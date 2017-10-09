package nifax.control.controller;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.TreePath;
import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Item;
import nifax.control.model.Product;
import nifax.control.model.SaleDoc;
import nifax.control.model.TypeSaleDoc;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.SaleDocOperation;
import nifax.control.model.modeler.TypeSaleDocOperation;
import nifax.control.util.Message;
import nifax.control.util.Table;
import nifax.control.util.UtilPdf;
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
    public static final int DELETEROW = 3;
    public static final int CANCEL = 4;

    // Panels name
    public static final String Ticket = "Ticket";

    @Override
    public Boolean operate(JPanel panel, String panelName, int ACTION) {
        switch (ACTION) {
            case EMIT:
                return emit(panel, panelName);
            case SALE:
                return sale((PanelSalesTicket) panel);
            case DELETEROW:
                return deleteRow((PanelSalesTicket) panel);
            case CANCEL:
                return cancel(panelName);

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

            SaleDoc saleDoc = new SaleDoc(
                Calendar.getInstance().getTime(),
                Authentication.getInstance().getSession().getUserEmployee(),
                TypeSaleDocOperation.getInstance().Find(new TypeSaleDoc("TICKET")),
                items);

            SaleDocOperation.getInstance().add(saleDoc);

            JOptionPane.showMessageDialog(null, new StringBuilder()
                .append("Ticket ").append(HQLOperation.getInstance()
                    .getCurrSequenceValue("saledoc_saledoc_id_seq").toString())
                .append(" generado correctamente"));

            if (panelSalesTicket.getChb_pdf().isSelected()) {
                UtilPdf.generateSalePdf(saleDoc, panelSalesTicket);
            }

            //Reload panel
            TreePath tp = Navigation.getInstance().getLastSelectedTreePath();
            Navigation.getInstance().setPanelSalesTicket(new PanelSalesTicket(), tp);
            SaleController.getInstance().resetTotals();

            return Boolean.TRUE;

        } catch (InitializeSessionException ex) {
            Logger.getLogger(Btn_operationAction.class.getName()).log(Level.SEVERE, null, ex);
            return Boolean.FALSE;
        }

    }

    //Delete Item of grid
    private Boolean deleteRow(PanelSalesTicket panelSalesTicket) {
        JTable table = panelSalesTicket.getTbl_ticket();
        int indexCheck = table.getColumnModel().getColumnIndex("");
        Integer rowsToDelete[];
        int c = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, indexCheck) != null) {
                if (table.getValueAt(i, indexCheck).equals(true)) {
                    c++;
                }
            }

        }
        rowsToDelete = new Integer[c];
        c = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, indexCheck) != null) {
                if (table.getValueAt(i, indexCheck).equals(true)) {
                    rowsToDelete[c] = i;
                    c++;
                }
            }

        }
        int d;

        for (int i = 0; i < rowsToDelete.length; i++) {
            d = rowsToDelete[i] - i;

            lessTotals(d, table);

            ((DefaultTableModel) table.getModel()).removeRow(d);

        }

        Table.UpdateIt(table);
        SaleController.getInstance().loadTotalsInPanel();

        return Boolean.TRUE;
    }

    private void lessTotals(int d, JTable table) {
        SaleController saleController = SaleController.getInstance();

        int indexAmount = table.getColumnModel().getColumnIndex("IMPORTE");
        double amount = Double.parseDouble(table.getValueAt(d, indexAmount).toString());
        saleController.reCalculateSubTotal(-amount);

        int indexAmountWithIva = table.getColumnModel().getColumnIndex("IMPORTE C/IVA");
        double amountWithIva = Double.parseDouble(table.getValueAt(d, indexAmountWithIva).toString());
        saleController.reCalculateTotal(-amountWithIva);

        int indexIvaPercent = table.getColumnModel().getColumnIndex("IVA(%)");
        int indexIva = table.getColumnModel().getColumnIndex("IVA");
        double ivaPercent = Double.parseDouble(table.getValueAt(d, indexIvaPercent).toString());
        double iva = Double.parseDouble(table.getValueAt(d, indexIva).toString());
        saleController.reCalculateIva(-iva, ivaPercent);
    }

    private Boolean cancel(String panelName) {
        int dialogResult = JOptionPane.showConfirmDialog(null,
            Message.DialogCancel, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {

            switch (panelName) {
                case Ticket:
                    Navigation.getInstance().setPanelSalesTicket(new PanelSalesTicket(), null);
                    break;

            }
        }
        return Boolean.TRUE;

    }

}
