package nifax.control.controller;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Item;
import nifax.control.model.Product;
import nifax.control.model.TypeSaleDoc;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.SaleDocOperation;
import nifax.control.model.modeler.TypeSaleDocOperation;
import nifax.control.util.Frame;
import nifax.control.util.Message;
import nifax.control.view.event.btn.Btn_operationAction;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Operation implements ActionController {

    private static Operation instance = null;

    protected Operation() {
    }

    public static Operation getInstance() {
        if (instance == null) {
            instance = new Operation();
        }
        return instance;
    }

    //Constants 
    public static final int EMIT = 0;
    public static final int SALE = 1;//when product is introduced in the jtable

    // Panels name
    public static final String Ticket = "Ticket";

    @Override
    public Boolean operate(JPanel panel, String panelName, int ACTION) {
        switch (ACTION) {
            case EMIT:
                return emit(panel, panelName);
            case SALE:
                return sale((PanelSalesTicket) panel);
        }
        return Boolean.FALSE;
    }

    private Boolean emit(JPanel panel, String panelName) {

        int dialogResult = JOptionPane.showConfirmDialog(null,
            Message.DialogEmit, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            switch (panelName) {
                case Ticket:
                    return emitTicket((PanelSalesTicket) panel);
            }

        }
        return Boolean.TRUE;
    }

    private Boolean sale(PanelSalesTicket panelSalesTicket) {
        SaleController saleController = SaleController.getInstance();
        saleController.setPanelSalesTicket(panelSalesTicket);
        String codeProduct = panelSalesTicket.getTxf_ticketCodeProduct().getText().toUpperCase();
        Product parcialProd = new Product(codeProduct, 1);
        final ProductOperation productOperation = ProductOperation.getInstance();
        Product product = productOperation.Find(parcialProd);

        if (product != null) {
            if (product.getActive()) {
                if (!saleController.SaleProduct(product)) {
                    JOptionPane.showMessageDialog(null, Message.DialogProductNotFound, Message.NullPointerExceptionTitle, JOptionPane.ERROR_MESSAGE);
                    return Boolean.FALSE;
                }
            } else {
                JOptionPane.showMessageDialog(null, Message.DialogProductNotActive, Message.DialogProductNotActiveTitle, JOptionPane.ERROR_MESSAGE);
                return Boolean.FALSE;
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.DialogProductNotFound, Message.NullPointerExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    private Boolean emitTicket(PanelSalesTicket panelSalesTicket) {
        try {
            SaleController saleController = SaleController.getInstance();
            saleController.setPanelSalesTicket(panelSalesTicket);

            ProductOperation productOperation = ProductOperation.getInstance();

            int indexIt = panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("IT");
            int indexCodProd = panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CODIGO");
            int indexCodStore = panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("DEPO");
            int indexCant = panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CANT X UN.");
            int indexPrice = panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("PREC C/IVA");

            long store_id;
            Product product;
            double quantity;
            double price;
            int it;

            Item item;

            Set<Item> items = new HashSet<Item>();

            for (int i = 0; i < panelSalesTicket.getTbl_ticket().getRowCount(); i++) {
                product = productOperation.Find(new Product(panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodProd).toString(), 1));
                quantity = Double.parseDouble(panelSalesTicket.getTbl_ticket().getValueAt(i, indexCant).toString());
                price = Double.parseDouble(panelSalesTicket.getTbl_ticket().getValueAt(i, indexPrice).toString());

                store_id = Long.parseLong(panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodStore).toString());

                it = Integer.parseInt(panelSalesTicket.getTbl_ticket().getValueAt(i, indexIt).toString());
                item = new Item(quantity, price, product, it);

                items.add(item);

                //STOCK QUANTITYCOMMITTED
                saleController.calculateStocks(product,
                    store_id,
                    quantity,
                    SaleController.DOSCOUNT_STOCKCOMMITTED
                );
                //STOCK QUANTITYCOMMITTED
                saleController.calculateStocks(product,
                    store_id,
                    quantity,
                    SaleController.DISCOUNT_STOCK
                );
            }

            SaleDocOperation.getInstance().add(Calendar.getInstance().getTime(),
                Authentication.getInstance().getSession().getUser_id(),
                TypeSaleDocOperation.getInstance().Find(new TypeSaleDoc("TICKET")),
                items
            );

            JOptionPane.showMessageDialog(null, new StringBuilder()
                .append("Ticket ").append(HQLOperation.getInstance()
                    .getCurrSequenceValue("saledoc_saledoc_id_seq").toString())
                .append(" generado correctamente"));

            //Reload panel
            Frame.reloadPanel();
            panelSalesTicket.repaint();

            return Boolean.TRUE;

        } catch (InitializeSessionException ex) {
            Logger.getLogger(Btn_operationAction.class.getName()).log(Level.SEVERE, null, ex);
            return Boolean.FALSE;
        }

    }

}
