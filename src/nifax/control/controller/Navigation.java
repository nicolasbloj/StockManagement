package nifax.control.controller;

import javax.swing.tree.TreePath;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Navigation {
    
    private static Navigation instance = null;
    
    private static FrameMain frameMain=null;
    
    protected Navigation(){}

    public static Navigation getInstance(){
    if(instance==null)
        instance =  new Navigation();
    return instance ; 
    }

    public static void setFrameMain(FrameMain frameMain) {
        Navigation.frameMain = frameMain;
    }
    
    public void showPanel(TreePath tp) {        
          if (tp!=null) {
                switch (tp.toString()) {
                    case "[NiFax, Administracion, Productos, Gestion]":
                        PanelProductsAdmin panelProductsAdmin = new PanelProductsAdmin();
                        panelProductsAdmin.setVisible(true);
                        panelProductsAdmin.setOpaque(true);
                        frameMain.getScp_container().setViewportView(panelProductsAdmin);
                        break;
                    case "[NiFax, Operacion, Ventas, Ticket]":
                        PanelSalesTicket panelSalesTicket = new PanelSalesTicket();
                        panelSalesTicket.setVisible(true);
                        panelSalesTicket.setOpaque(true);
                        frameMain.getScp_container().setViewportView(panelSalesTicket);
                        break;
                    default:
                        PanelPresentation jPanelPresentation = new PanelPresentation();
                        jPanelPresentation.setVisible(true);
                        jPanelPresentation.setOpaque(true);
                        frameMain.getScp_container().setViewportView(jPanelPresentation);
                        break;
                }
            }
    }
}
