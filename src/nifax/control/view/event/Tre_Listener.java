package nifax.control.view.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Tre_Listener implements MouseListener {

    private final FrameMain jFrameMain;

    public Tre_Listener(FrameMain jFrameMain) {

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
                if (tp.toString().equals("[NiFax, Administracion, Productos, Gestion]")) {
                    PanelProductsAdmin panelProductsAdmin = new PanelProductsAdmin();
                    panelProductsAdmin.setVisible(true);
                    panelProductsAdmin.setOpaque(true);
                    this.jFrameMain.getScp_container().setViewportView(panelProductsAdmin);
                } else if (tp.toString().equals("[NiFax, Operacion, Ventas, Ticket]")) {
                    PanelSalesTicket panelSalesTicket = new PanelSalesTicket();
                    panelSalesTicket.setVisible(true);
                    panelSalesTicket.setOpaque(true);
                    this.jFrameMain.getScp_container().setViewportView(panelSalesTicket);
                } else {
                    PanelPresentation jPanelPresentation = new PanelPresentation();
                    jPanelPresentation.setVisible(true);
                    jPanelPresentation.setOpaque(true);
                    this.jFrameMain.getScp_container().setViewportView(jPanelPresentation);
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
