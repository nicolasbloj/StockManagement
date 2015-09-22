package nifax.control.controller;

import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.Measure;
import nifax.control.model.Offer;
import nifax.control.model.Price;
import nifax.control.model.Product;
import nifax.control.model.ProductMeasure;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.modeler.StockOperation;
import nifax.control.util.Number;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class SaleController {

    private static final Logger logger = Logger.getLogger(SaleController.class.getName());

    private static SaleController instance = null;

    //Constants for Stock's management
    public static final int DISCOUNT_STOCK = 0;
    public static final int DOSCOUNT_STOCKCOMMITTED = 1;
    public static final int SUM_STOCK = 2;
    public static final int SUM_STOCKCOMMITTED = 3;

    private PanelSalesTicket panelSalesTicket;

    //Variables for totlas's management
    private double iva21 = 0;
    private double iva105 = 0;
    private double subtotal = 0;
    private double total = 0;

    protected SaleController() {
    }

    public static SaleController getInstance() {
        if (instance == null) {
            instance = new SaleController();
        }
        return instance;
    }

    public void setPanelSalesTicket(PanelSalesTicket panelSalesticket) {
        this.panelSalesTicket = panelSalesticket;
    }

    //when a product is inserted in the grid, for a sale.
    public boolean SaleProduct(Product product) {
        try {
            String selectedPriceListDesc = panelSalesTicket.getCbx_ticketPriceProduct().getSelectedItem().toString();
            Price priceList = MapDb.getPriceList().get(selectedPriceListDesc);

            String selectedStoreDesc = panelSalesTicket.getCbx_ticketStoreProduct().getSelectedItem().toString();
            Store store = MapDb.getStoreList().get(selectedStoreDesc);

            String selectedMeasureDesc = panelSalesTicket.getCbx_ticketMeasureProduct().getSelectedItem().toString();
            Measure measure = MapDb.getMeasureList().get(selectedMeasureDesc);

            ProductMeasure productMeasure = this.findProductMesureByDescription(product.getProductMeasures(), selectedMeasureDesc);

            double quantityXunit = Double.parseDouble(panelSalesTicket.getTxf_ticketQuantityProduct().getText());

            double quantityReal = quantityXunit;

            if (productMeasure != null) {
                quantityXunit = Double.parseDouble(panelSalesTicket.getTxf_ticketQuantityProduct().getText())
                    * productMeasure.getQuantity();
            } else {
                logger.info("No existe regla de medida para producto - calculo de cantidad en grilla");
            }

            //Offer
            double discount = this.discount(product, quantityXunit);

            double price = (priceList.getProfit() / 100) * product.getCost() + product.getCost();

            //offer's discount
            price = price - price * (discount) / 100;

            double amount = price * quantityXunit;

            double ivaPercent = product.getIva().getIva();

            double IvaInPrice = (ivaPercent / 100) * price;

            double priceWithIva = price + IvaInPrice;

            double amountWithIva = priceWithIva * quantityXunit;

            DefaultTableModel tableModel = (DefaultTableModel) panelSalesTicket.getTbl_ticket().getModel();

            Vector rowData = new Vector();

            rowData.add(Boolean.FALSE);
            rowData.add(tableModel.getRowCount() + 1);
            rowData.add(product.getCode());
            rowData.add(product.getDescription());
            rowData.add(Number.round(price));
            rowData.add(Number.round(priceWithIva));
            rowData.add(priceList.getId());
            rowData.add(Number.round(quantityXunit));
            rowData.add(Number.round(quantityReal));
            rowData.add(measure.getDescription());
            rowData.add(discount);
            rowData.add(Number.round(product.getCost()));
            rowData.add(Number.round(priceList.getProfit()));
            rowData.add(ivaPercent);
            rowData.add(Number.round(IvaInPrice));
            rowData.add(Number.round(amount));
            rowData.add(Number.round(amountWithIva));
            rowData.add((store.getId()));

            tableModel.insertRow(tableModel.getRowCount(), rowData);

            this.reCalculateSubTotal(Number.round(amount));
            this.reCalculateTotal(Number.round(amountWithIva));
            this.reCalculateIva(Number.round(IvaInPrice), ivaPercent);

            this.loadTotalsInPanel();

            this.calculateStocks(product, store.getId(), quantityXunit, SUM_STOCKCOMMITTED);

            //panelSalesTicket.getTxf_ticketCodeProduct().setText("");
            return true;

        } catch (NullPointerException ex) {
            return false;
        }

    }

    public void loadTotalsInPanel() {
        panelSalesTicket.getLbl_subTotalTicket().setText(
            new StringBuilder().append("$ ").append(Number.round(subtotal)).toString());
        panelSalesTicket.getLbl_TotalTicket().setText(
            new StringBuilder().append("$ ").append(Number.round(total)).toString());
        panelSalesTicket.getLbl_iva21Ticket().setText(
            new StringBuilder().append("$ ").append(Number.round(iva21)).toString());
        panelSalesTicket.getLbl_iva105Ticket().setText(
            new StringBuilder().append("$ ").append(Number.round(iva105)).toString());
    }

    public void calculateStocks(Product product, long store_id, double quantity, int op) {
        StockOperation stockOperation = StockOperation.getInstance();
        Stock stock = stockOperation.Find(product.getId(), store_id);
        //Stock stock= stockOperation.Find(new Stock(product,store));
        if (stock != null) {

            Set<ProductMeasure> listProductMeasure = product.getProductMeasures();

            ProductMeasure productMeasure = null;
            for (ProductMeasure pm : listProductMeasure) {
                if (pm.getMeasure().getId().equals(stock.getMeasure().getId())) {
                    productMeasure = pm;
                    break;
                }
            }

            if (productMeasure != null) {
                quantity = quantity / productMeasure.getQuantity();
            }

            quantity = Number.round(quantity);

            double quantityStock;
            double quantityCommitted;

            switch (op) {

                case SaleController.DISCOUNT_STOCK:// when emit ticket *
                    quantityStock = stock.getQuantity() - quantity;
                    quantityCommitted = stock.getQuantityCommitted() - quantity;

                    stock.setQuantity(quantityStock);
                    stock.setQuantityCommitted(quantityCommitted);

                    break;
                case SaleController.DOSCOUNT_STOCKCOMMITTED: // when reestablish
                    quantityCommitted = stock.getQuantityCommitted() - quantity;
                    stock.setQuantityCommitted(quantityCommitted);

                    break;
                case SaleController.SUM_STOCK://when load new produc *
                    quantityStock = stock.getQuantity() + quantity;
                    stock.setQuantity(quantityStock);

                    break;
                case SaleController.SUM_STOCKCOMMITTED://when load in Grid
                    quantityCommitted = stock.getQuantityCommitted() + quantity;
                    stock.setQuantityCommitted(quantityCommitted);

                    break;

            }

            if (stock.getQuantityCommitted() < 0) {
                stock.setQuantityCommitted(0);
            }

            if (stock.getQuantity() < 0) {
                stock.setQuantity(0);
            }

            stockOperation.Update(stock);
        }
    }

    public void reCalculateSubTotal(double amount) {
        subtotal = subtotal + amount;
    }

    public void reCalculateTotal(double amountWithIva) {
        total = total + amountWithIva;
    }

    public void reCalculateIva(double iva, double ivaPercentage) {
        if (ivaPercentage == 21 || ivaPercentage == 21.0) {
            iva21 = iva21 + iva;
        } else if (ivaPercentage == 10.5) {
            iva105 = iva105 + iva;
        }
    }

    //for calculate quantity inserted in grid 
    private ProductMeasure findProductMesureByDescription(Set<ProductMeasure> listProductMeasure, String selectedMeasureDesc) {
        for (ProductMeasure pm : listProductMeasure) {
            if (pm.getMeasure().getDescription().equals(selectedMeasureDesc)) {
                return pm;
            }
        }
        return null;
    }

    private ProductMeasure findProductMesureById(Set<ProductMeasure> listProductMeasure, long id) {
        for (ProductMeasure pm : listProductMeasure) {
            if (pm.getMeasure().getId().equals(id)) {
                return pm;
            }
        }
        return null;
    }

    private double discount(Product product, double quantityXunit) {
        double discount = 0;
        double AUX = 0;

        for (Offer offer : product.getOffers()) {

            long measure_id = offer.getMeasure().getId();
            double offerQuantity = offer.getQuantity();

            ProductMeasure productMeasure = this.findProductMesureById(product.getProductMeasures(), measure_id);

            if (productMeasure != null) {
                offerQuantity = offer.getQuantity() * productMeasure.getQuantity();
            } else {
                logger.info("No existe regla de medida para producto - calculo de cantidad en oferta");
            }

            if (quantityXunit >= offerQuantity && offerQuantity > AUX) {
                AUX = offerQuantity;
                discount = offer.getDiscount();
            }

        }
        return discount;
    }

    public double getIva21() {
        return iva21;
    }

    public double getIva105() {
        return iva105;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void resetTotals() {
        iva21 = 0;
        iva105 = 0;
        subtotal = 0;
        total = 0;
    }

}
