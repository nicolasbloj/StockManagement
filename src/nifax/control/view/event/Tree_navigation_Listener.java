package nifax.control.view.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Tree_navigation_Listener implements MouseListener {

    private final FrameMain jFrameMain;

    public Tree_navigation_Listener(FrameMain jFrameMain) {

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

                    this.jFrameMain.ContainerAddPanel(jPanelProductsAdmin);

                } else {

                    PanelPresentation jPanelPresentation = new PanelPresentation();
                    jPanelPresentation.setVisible(true);
                    jPanelPresentation.setOpaque(true);

                    this.jFrameMain.ContainerAddPanel(jPanelPresentation);
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
