package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import nifax.control.controller.Navigation;
import nifax.control.controller.ProductController;
import nifax.control.util.Frame;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Btn_saveAction extends AbstractAction {

    private final PanelProductsAdmin panelProductsAdmin;

    public Btn_saveAction(PanelProductsAdmin panelProductsAdmin) {
        super("Guardar");
        this.panelProductsAdmin = panelProductsAdmin;
        putValue(SHORT_DESCRIPTION, "Presionando este boton guardara el elemento");
        putValue(MNEMONIC_KEY, KeyEvent.VK_G);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                "Esta seguro que desea guardar este producto ?", "Confirmacion",
                JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String title = panelProductsAdmin.getTbp_containerProduct().getSelectedComponent().getName();

                ProductController productController = ProductController.getInstance();
                productController.setPanelProductsAdmin(panelProductsAdmin);
                productController.Operation(title, ProductController.SAVE);

                //Reload panel
                Frame.reloadPanel();
                panelProductsAdmin.repaint();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Elementos nulos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
