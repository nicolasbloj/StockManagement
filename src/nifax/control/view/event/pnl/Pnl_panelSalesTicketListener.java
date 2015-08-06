package nifax.control.view.event.pnl;

import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorEvent;
import nifax.control.controller.SaleController;
import nifax.control.data.MapDb;
import nifax.control.model.Product;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.StoreOperation;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Pnl_panelSalesTicketListener extends Pnl_Listener {

    private final PanelSalesTicket panelSalesTicket;

    public Pnl_panelSalesTicketListener(PanelSalesTicket panelSalesTicket) {
        this.panelSalesTicket = panelSalesTicket;
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {

        MapDb.priceList = PriceOperation.getInstance().List();

        Object[] StringArrayPrices = MapDb.priceList.keySet().toArray();

        Arrays.sort(StringArrayPrices);

        this.panelSalesTicket.getCbx_ticketGralPrice().setModel(
                new DefaultComboBoxModel(StringArrayPrices)
        );
        
        this.panelSalesTicket.getCbx_ticketPriceProduct().setModel(
                new DefaultComboBoxModel(StringArrayPrices)
        );

        MapDb.storeList = StoreOperation.getInstance().List();

        Object[] StringArrayStores = MapDb.storeList.keySet().toArray();

        
        this.panelSalesTicket.getCbx_ticketGralStore().setModel(
                new DefaultComboBoxModel(StringArrayStores)
        );
        
        this.panelSalesTicket.getCbx_ticketStoreProduct().setModel(
                new DefaultComboBoxModel(StringArrayStores)
        );

        MapDb.measureList = MeasureOperation.getInstance().List();

        Object[] StringArrayMeasure = MapDb.measureList.keySet().toArray();

        this.panelSalesTicket.getCbx_ticketMeasureProduct().setModel(
                new DefaultComboBoxModel(
                        StringArrayMeasure
                )
        );

        this.panelSalesTicket.getCbx_ticketMeasureProduct().setSelectedItem("Unidad");

    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        SaleController saleController = SaleController.getInstance();
        saleController.setPanelSalesTicket(panelSalesTicket);

        ProductOperation productOperation = ProductOperation.getInstance();

        int indexCodProd = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CODIGO");
        int indexCodStore = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("DEPO");
        int indexCant = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CANT X UN.");

        long store_id;
        Product product;
        double quantity;
        String codeProduct;
        
        for (int i = 0; i < this.panelSalesTicket.getTbl_ticket().getRowCount(); i++) {
            codeProduct = this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodProd).toString();
            product = productOperation.Find(new Product(codeProduct,1));
            store_id = Long.parseLong(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodStore).toString());
            quantity = Double.parseDouble(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCant).toString());

            saleController.calculateStocks(product,
                    store_id,
                    quantity,
                    SaleController.DOSCOUNT_STOCKCOMMITTED
            );
        }

    }

}
