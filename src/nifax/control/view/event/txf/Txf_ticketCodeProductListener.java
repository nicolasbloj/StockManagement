package nifax.control.view.event.txf;

import com.sun.glass.events.KeyEvent;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import nifax.control.controller.SaleController;
import nifax.control.model.Product;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Txf_ticketCodeProductListener extends Txf_Listener {

    private static final Logger logger = Logger.getLogger(Txf_ticketCodeProductListener.class.getName());

    private final PanelSalesTicket panelSalesTicket;

    public Txf_ticketCodeProductListener(PanelSalesTicket panelSalesTicket) {
        this.panelSalesTicket = panelSalesTicket;

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        SaleController saleController = SaleController.getInstance();
        saleController.setPanelSalesTicket(panelSalesTicket);

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

            JTextField txf = (JTextField) e.getSource();

            String codeProduct = txf.getText();

            Product parcialProd = new Product(Long.parseLong(codeProduct));

            final ProductOperation productOperation = ProductOperation.getInstance();
            Product product = productOperation.Find(parcialProd);

            if (!saleController.SaleProduct(product)) {
                JOptionPane.showMessageDialog(null, "Elemento no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
