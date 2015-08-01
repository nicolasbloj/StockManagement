package nifax.control.controller;

import javax.swing.tree.TreePath;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelGeneralAdmin;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Navigation {

    private static Navigation instance = null;

    static FrameMain frameMain = null;

    private static TreePath lastSelected = null;

    protected Navigation() {
    }

    public static Navigation getInstance() {
        if (instance == null) {
            instance = new Navigation();
        }
        return instance;
    }

    public static void setFrameMain(FrameMain frameMain) {
        Navigation.frameMain = frameMain;
    }

    public void showPanel(TreePath tp) {
        lastSelected = tp;
        if (tp != null) {
            switch (tp.toString()) {
                case "[NiFax, Administracion, Productos, Gestion]":
                    PanelProductsAdmin panelProductsAdmin = new PanelProductsAdmin();
                    frameMain.getScp_container().setViewportView(panelProductsAdmin);
                    break;
                case "[NiFax, Administracion, Categorias, Gestion]":
                    PanelGeneralAdmin panelGeneralAdminCategories = new PanelGeneralAdmin();
                    panelGeneralAdminCategories.getTbp_gral().setTitleAt(0, "Categoria");
                    frameMain.getScp_container().setViewportView(panelGeneralAdminCategories);
                    break;
                case "[NiFax, Administracion, Depositos, Gestion]":
                    PanelGeneralAdmin panelGeneralAdminStores = new PanelGeneralAdmin();
                    panelGeneralAdminStores.getTbp_gral().setTitleAt(0, "Deposito");
                    frameMain.getScp_container().setViewportView(panelGeneralAdminStores);
                    break;
                case "[NiFax, Administracion, Medidas, Gestion]":
                    PanelGeneralAdmin panelGeneralAdminMedidas = new PanelGeneralAdmin();
                    panelGeneralAdminMedidas.getTbp_gral().setTitleAt(0, "Medida");
                    frameMain.getScp_container().setViewportView(panelGeneralAdminMedidas);
                    break;
                case "[NiFax, Administracion, Lista de precios, Gestion]":
                    PanelGeneralAdmin panelGeneralAdminPrices = new PanelGeneralAdmin();
                    panelGeneralAdminPrices.getLbl_profitGral().setVisible(true);
                    panelGeneralAdminPrices.getTxf_profitGral().setVisible(true);
                    panelGeneralAdminPrices.getTbp_gral().setTitleAt(0, "Lista de precio");
                    frameMain.getScp_container().setViewportView(panelGeneralAdminPrices);
                    break;
                case "[NiFax, Operacion, Ventas, Ticket]":
                    PanelSalesTicket panelSalesTicket = new PanelSalesTicket();
                    frameMain.getScp_container().setViewportView(panelSalesTicket);
                    break;
                default:
                    PanelPresentation jPanelPresentation = new PanelPresentation();
                    frameMain.getScp_container().setViewportView(jPanelPresentation);
                    break;
            }
        }
    }

    public FrameMain getFrameMain() {
        return frameMain;
    }

    public TreePath getLastSelected() {
        return lastSelected;
    }

}
