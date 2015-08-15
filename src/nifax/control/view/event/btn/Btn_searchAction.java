package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;
import nifax.control.controller.ProductController;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Btn_searchAction extends AbstractAction {

    private final PanelProductsAdmin panelProductsAdmin;

    public Btn_searchAction(PanelProductsAdmin panelProductsAdmin) {
        super("Buscar");
        this.panelProductsAdmin = panelProductsAdmin;
        putValue(SHORT_DESCRIPTION, "Presionando este boton se buscara el elemento");
        putValue(MNEMONIC_KEY, KeyEvent.VK_B);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String title = panelProductsAdmin.getTbp_containerProduct().getSelectedComponent().getName();

            ProductController productController = ProductController.getInstance();
            productController.setPanelProductsAdmin(panelProductsAdmin);
            productController.Operation(title, ProductController.SEARCH);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Elementos nulos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
