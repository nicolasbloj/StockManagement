package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import nifax.control.controller.Authentication;
import nifax.control.controller.Navigation;
import nifax.control.controller.SaleController;
import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Item;
import nifax.control.model.Product;
import nifax.control.model.TypeSaleDoc;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.SaleDocOperation;
import nifax.control.model.modeler.TypeSaleDocOperation;
import nifax.control.view.FrameMain;
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
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Esta seguro que desea emitir ticket ?", "Confirmacion",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                SaleController saleController = SaleController.getInstance();
                saleController.setPanelSalesTicket(panelSalesTicket);

                ProductOperation productOperation = ProductOperation.getInstance();

                int indexIt = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("IT");
                int indexCodProd = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CODIGO");
                int indexCodStore = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("DEPO");
                int indexCant = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("CANT X UN.");
                int indexPrice = this.panelSalesTicket.getTbl_ticket().getColumnModel().getColumnIndex("PREC C/IVA");

                long store_id;
                Product product;
                double quantity;
                double price;
                int it;
                
                Item item;

                Set<Item> items = new HashSet<Item>();

                for (int i = 0; i < this.panelSalesTicket.getTbl_ticket().getRowCount(); i++) {
                    product = productOperation.Find(new Product(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodProd).toString(),1));
                    quantity = Double.parseDouble(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCant).toString());
                    price = Double.parseDouble(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexPrice).toString());

                    store_id = Long.parseLong(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexCodStore).toString());

                    it = Integer.parseInt(this.panelSalesTicket.getTbl_ticket().getValueAt(i, indexIt).toString());
                    item = new Item(quantity,price,product,it);


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
                        TypeSaleDocOperation.getInstance().Find(new TypeSaleDoc("Ticket")),
                        items
                );

                JOptionPane.showMessageDialog(null,
                        new StringBuilder()
                                .append("Ticket ").append(HQLOperation.getInstance()
                                        .getCurrSequenceValue("saledoc_saledoc_id_seq").toString())
                                            .append(" generado correctamente"));
                
                
                //Reload panel
                FrameMain f = Navigation.getInstance().getFrameMain();
                TreePath tp = Navigation.getInstance().getLastSelected();
                Navigation.getInstance().showPanel(tp);

                this.panelSalesTicket.repaint();

            } catch (InitializeSessionException ex) {
                Logger.getLogger(Btn_emitTicketAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
