package nifax.control.controller;

import javax.swing.tree.TreePath;
import nifax.control.util.Table;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelGeneralAdmin;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.view.panel.PanelReportProductStock;
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
                    showGralPanel("Category", "Categoria");
                    break;
                case "[NiFax, Administracion, Depositos, Gestion]":
                    showGralPanel("Store", "Deposito");
                    break;
                case "[NiFax, Administracion, Medidas, Gestion]":
                    showGralPanel("Measure", "Medida");
                    break;
                case "[NiFax, Administracion, Lista de precios, Gestion]":
                    showGralPanel("Price", "Lista de precio");
                    break;
                case "[NiFax, Operacion, Ventas, Ticket]":
                    PanelSalesTicket panelSalesTicket = new PanelSalesTicket();
                    panelSalesTicket.getPnl_ticket().setName("Ticket");
                    frameMain.getScp_container().setViewportView(panelSalesTicket);
                    break;
                case "[NiFax, Reportes, Productos, Stock]":
                    PanelReportProductStock panelReportProductStock = new PanelReportProductStock();
                    panelReportProductStock.getPnl_reportProductStock().setName("ProductStock");
                    frameMain.getScp_container().setViewportView(panelReportProductStock);
                    break;
                default:
                    PanelPresentation jPanelPresentation = new PanelPresentation();
                    frameMain.getScp_container().setViewportView(jPanelPresentation);
                    break;
            }

        }
    }

    private void showGralPanel(String panelName, String tab) {

        PanelGeneralAdmin panelGeneralAdmin = new PanelGeneralAdmin();
        frameMain.getScp_container().setViewportView(panelGeneralAdmin);

        panelGeneralAdmin.getPnl_loadGral().setName(panelName);
        panelGeneralAdmin.getTbp_gral().setTitleAt(0, tab);

        if (!Administration.Price.equals(panelName)) {

            panelGeneralAdmin.getLbl_profitGral().setVisible(false);
            panelGeneralAdmin.getTxf_profitGral().setVisible(false);

            int[] columnsHides = {3};
            Table.hiddenColumns(panelGeneralAdmin.getTbl_gral(), columnsHides);
        } else {
            panelGeneralAdmin.getLbl_profitGral().setVisible(true);
            panelGeneralAdmin.getTxf_profitGral().setVisible(true);
        }

    }

    public FrameMain getFrameMain() {
        return frameMain;
    }

    public TreePath getLastSelected() {
        return lastSelected;
    }

}
