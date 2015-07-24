package nifax.control.view.event;

import com.sun.glass.events.KeyEvent;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import nifax.control.controller.TicketController;
import nifax.control.model.Price;
import nifax.control.model.Product;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Txf_ticketCodeProductListener extends Txf_Listener {

    private static final Logger logger = Logger.getLogger(Txf_ticketCodeProductListener.class.getName());

    private final PanelSalesTicket panelSalesTicket;
    private final ProductOperation productOperation = ProductOperation.getInstance();
    private final PriceOperation priceOperation = PriceOperation.getInstance();

    private final TicketController ticketController = new TicketController();

    public Txf_ticketCodeProductListener(PanelSalesTicket panelSalesTicket) {
        this.panelSalesTicket = panelSalesTicket;

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextField txf = (JTextField) e.getSource();

            String code = txf.getText();
            Product prod = new Product(Long.parseLong(code));
            Product product = productOperation.Find(prod);

            try {

                String listPrice = this.panelSalesTicket.getCbx_ticketPriceProduct().getSelectedItem().toString();
                Price obj = new Price(Long.parseLong(listPrice));
                Price price = priceOperation.Find(obj);

                double quantity = Double.parseDouble(this.panelSalesTicket.
                        getTxf_ticketQuantityProduct().getText());

                double calculatePrice = price.getProfit() * product.getCost() + product.getCost();

                double amount = calculatePrice * quantity;

                double iva = product.getIva().getIva();

                double percentageOfIvaInPrice = iva / 100 * calculatePrice;

                double calculatePriceWithIva = calculatePrice + percentageOfIvaInPrice;

                double amountWithIva = calculatePriceWithIva * quantity;

                DefaultTableModel tableModel = (DefaultTableModel) panelSalesTicket.getTbl_ticket().getModel();
                Vector rowData = new Vector();
                rowData.add(tableModel.getRowCount() + 1);
                rowData.add(product.getId());
                rowData.add(product.getDescription());
                rowData.add(calculatePrice);
                rowData.add(calculatePriceWithIva);
                rowData.add(quantity);
                rowData.add(iva);
                rowData.add(amountWithIva);
                rowData.add(amount);

                tableModel.insertRow(tableModel.getRowCount(), rowData);

                this.ticketController.reCalculateSubTotal(amount);
                this.ticketController.reCalculateTotal(amountWithIva);
                this.ticketController.reCalculateIva(percentageOfIvaInPrice, iva);

                //After I will change the concatenations using StringBuilder
                this.panelSalesTicket.getLbl_subTotalTicket().setText("$ "
                        + this.ticketController.getSubtotal());

                this.panelSalesTicket.getLbl_TotalTicket().setText("$ "
                        + this.ticketController.getTotal());

                this.panelSalesTicket.getLbl_iva21Ticket().setText("$ "
                        + this.ticketController.getIva21());

                this.panelSalesTicket.getLbl_iva105Ticket().setText("$ "
                        + this.ticketController.getIva105());

            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "No existe producto", "No existencia", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

}
