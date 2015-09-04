package nifax.control.controller;

import javax.swing.JPanel;
import javax.swing.tree.TreePath;
import nifax.control.util.Table;
import nifax.control.view.frame.FrameMain;
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

    private static FrameMain frameMain = null;

    public static TreePath lastSelectedTreePath = null;
    public static String nodeSelected = null;
    private static JPanel lastSelectedPanel = null;

    //NODES
    public static final String ADMINISTRATION_PRODUCT_MANAGEMENT = "[NiFax, Administracion, Productos, Gestion]";
    public static final String OPERATION_SALE_TICKET = "[NiFax, Operacion, Ventas, Ticket]";

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
        lastSelectedTreePath = tp;
        if (tp != null) {
            switch (tp.toString()) {
                case ADMINISTRATION_PRODUCT_MANAGEMENT:
                    PanelProductsAdmin panelProductsAdmin = new PanelProductsAdmin();

                    panelProductsAdmin.getPnl_product().setName("Product");
                    panelProductsAdmin.getPnl_offer().setName("Product");
                    panelProductsAdmin.getPnl_restoration().setName("Product");
                    panelProductsAdmin.getPnl_stock().setName("Product");

                    frameMain.getScp_container().setViewportView(panelProductsAdmin);

                    panelProductsAdmin.getCbx_category().requestFocus();

                    nodeSelected = ADMINISTRATION_PRODUCT_MANAGEMENT;
                    lastSelectedPanel = panelProductsAdmin;
                    
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
                case OPERATION_SALE_TICKET:
                    PanelSalesTicket panelSalesTicket = new PanelSalesTicket();
                    panelSalesTicket.getPnl_ticket().setName("Ticket");
                    frameMain.getScp_container().setViewportView(panelSalesTicket);
                    panelSalesTicket.getTxf_ticketCodeProduct().requestFocus();
                    
                    
                    nodeSelected = OPERATION_SALE_TICKET;
                    lastSelectedPanel = panelSalesTicket;
                    
                    break;
                case "[NiFax, Reportes, Productos, Stock]":
                    PanelReportProductStock panelReportProductStock = new PanelReportProductStock();
                    panelReportProductStock.getPnl_reportProductStock().setName("ProductStock");
                    frameMain.getScp_container().setViewportView(panelReportProductStock);
                    panelReportProductStock.getTxf_StockMin().requestFocus();
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

        panelGeneralAdmin.getTxf_descGral().requestFocus();

    }

    public FrameMain getFrameMain() {
        return frameMain;
    }

    public TreePath getLastSelectedTreePath() {
        return lastSelectedTreePath;
    }

    public static JPanel getLasSelectedPanel() {
        return lastSelectedPanel;
    }
    
    

}
