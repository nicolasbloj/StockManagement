/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import nifax.control.controller.Authentication;
import nifax.control.controller.SaleController;
import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Product;
import nifax.control.model.SaleDocProduct;
import nifax.control.model.TypeSaleDoc;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.SaleDocOperation;
import nifax.control.model.modeler.TypeSaleDocOperation;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Btn_emitTicketAction extends AbstractAction {

    private final PanelSalesTicket panelSalesTicket;

    public Btn_emitTicketAction(PanelSalesTicket panelSalesTicket) {
        super("Emitir Ticket");
        this.panelSalesTicket = panelSalesTicket;
        putValue(SHORT_DESCRIPTION, "Presionando este boton emitirá ticket");
        putValue(MNEMONIC_KEY, KeyEvent.VK_T);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            SaleController saleController = SaleController.getInstance();
            saleController.setPanelSalesTicket(panelSalesTicket);

            ProductOperation productOperation = ProductOperation.getInstance();

            int indexCodProd = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CODIGO");
            int indexCodStore = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("DEPO");
            int indexCant = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CANT X UN.");
            int indexPrice = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("PREC C/IVA");

            long store_id;
            
            Product product;
            double quantity;
            double price;

            SaleDocProduct saleDocProduct;

            List<SaleDocProduct> saleDocProducts = new ArrayList<SaleDocProduct>();

            for (int i = 0; i < this.panelSalesTicket.getTbl_ticket().getRowCount(); i++) {
                product = productOperation.Find(new Product(Long.parseLong(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodProd).toString())));
                quantity = Double.parseDouble(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCant).toString());
                price = Double.parseDouble(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexPrice).toString());

                store_id = Long.parseLong(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodStore).toString());

                saleDocProduct = new SaleDocProduct();

                saleDocProduct.setProduct(product);
                saleDocProduct.setQuantity(quantity);
                saleDocProduct.setPrice(price);

                saleDocProducts.add(saleDocProduct);

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
                    TypeSaleDocOperation.getInstance().Find(new TypeSaleDoc("Ticket")),
                    saleDocProducts
            );

        } catch (InitializeSessionException ex) {
            Logger.getLogger(Btn_emitTicketAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}