package nifax.control.view.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class JTreeMenuMainListener implements MouseListener {

    private final FrameMain jFrameMain;

    public JTreeMenuMainListener(FrameMain jFrameMain) {

        this.jFrameMain = jFrameMain;

    }

    @Override
    public void mouseClicked(MouseEvent me) {

        if (me.getButton() == MouseEvent.BUTTON1 && me.getClickCount() == 2) {
            JTree jTree = (JTree) me.getSource();

            TreePath tp = jTree.getPathForLocation(me.getX(), me.getY());

            TreePath nodoPadre = null;

            if (tp != null) {
                nodoPadre = tp.getParentPath();

                if (tp.toString().equals("[NiFax, Administracion, Productos, Cargar]")) {
                    PanelProductsAdmin jPanelProductsAdmin = new PanelProductsAdmin();
                    jPanelProductsAdmin.setVisible(true);
                    jPanelProductsAdmin.setOpaque(true);

                    this.jFrameMain.DesktopPaneAddPanel(jPanelProductsAdmin);

                } else {
                    this.jFrameMain.DesktopPaneRemoveAll();
                }

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
