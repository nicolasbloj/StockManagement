package nifax.control.controller;

import javax.swing.JPanel;
import javax.swing.tree.TreePath;
import nifax.control.util.ww.WWCategory;
import nifax.control.util.ww.WWEmployee;
import nifax.control.util.ww.WWMeasure;
import nifax.control.util.ww.WWPrice;
import nifax.control.util.ww.WWStore;
import nifax.control.util.ww.WWUser;
import nifax.control.view.event.btn.Btn_adminAction;
import nifax.control.view.frame.FrameMain;
import nifax.control.view.panel.PanelPresentation;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.view.panel.PanelReportProductStock;
import nifax.control.view.panel.PanelSalesTicket;
import nifax.control.view.util.ww.WWPanel;
import nifax.control.view.util.ww.WWTableModel;

/**
 *
 * @author NB
 */
public class Navigation {

    private final PanelPresentation panelPresentation;
    private PanelProductsAdmin panelProductsAdmin;
    private PanelSalesTicket panelSalesTicket;
    private PanelReportProductStock panelReportProductStock;

    private static Navigation instance = null;

    private static FrameMain frameMain = null;

    public static TreePath lastSelectedTreePath = null;
    public static String nodeSelected = null;
    private static JPanel lastSelectedPanel = null;

    //NODES
    public static final String ADMINISTRATION_PRODUCT_MANAGEMENT = "[NiFax, Administracion, Productos, Gestion]";
    public static final String OPERATION_SALE_TICKET = "[NiFax, Operacion, Ventas, Ticket]";
    public static final String ADMINISTRATION_CATEGORY_MANAGEMENT = "[NiFax, Administracion, Categorias, Gestion]";
    public static final String ADMINISTRATION_STORE_MANAGEMENT = "[NiFax, Administracion, Depositos, Gestion]";
    public static final String ADMINISTRATION_MEASURE_MANAGEMENT = "[NiFax, Administracion, Medidas, Gestion]";
    public static final String ADMINISTRATION_PRICE_MANAGEMENT = "[NiFax, Administracion, Lista de precios, Gestion]";
    public static final String ADMINISTRATION_EMPLOYEE_MANAGEMENT = "[NiFax, Administracion, Empleados, Gestion]";
    public static final String SYSTEM_USER_MANAGEMENT = "[NiFax, Sistema, Usuarios, Gestion]";

    protected Navigation() {
        panelPresentation = new PanelPresentation();
        panelProductsAdmin = new PanelProductsAdmin();
        panelSalesTicket = new PanelSalesTicket();
        panelReportProductStock = new PanelReportProductStock();
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
                    panelProductsAdmin.setName("Product");
                    frameMain.getScp_container().setViewportView(panelProductsAdmin);
                    panelProductsAdmin.getCbx_category().requestFocus();
                    nodeSelected = ADMINISTRATION_PRODUCT_MANAGEMENT;
                    lastSelectedPanel = panelProductsAdmin;

                    break;
                case ADMINISTRATION_CATEGORY_MANAGEMENT:
                    showGralPanel_WW(Administration.Category);
                    break;
                case ADMINISTRATION_STORE_MANAGEMENT:
                    showGralPanel_WW(Administration.Store);
                    break;
                case ADMINISTRATION_MEASURE_MANAGEMENT:
                    showGralPanel_WW(Administration.Measure);
                    break;
                case ADMINISTRATION_PRICE_MANAGEMENT:
                    showGralPanel_WW(Administration.Price);
                    break;
                case ADMINISTRATION_EMPLOYEE_MANAGEMENT:
                    showGralPanel_WW(Administration.Employee);
                    break;
                case SYSTEM_USER_MANAGEMENT:
                    showGralPanel_WW(Administration.User);
                    break;

                case OPERATION_SALE_TICKET:
                    panelSalesTicket.setName("Ticket");
                    frameMain.getScp_container().setViewportView(panelSalesTicket);
                    panelSalesTicket.getTxf_ticketCodeProduct().requestFocus();
                    nodeSelected = OPERATION_SALE_TICKET;
                    lastSelectedPanel = panelSalesTicket;

                    break;
                case "[NiFax, Reportes, Productos, Stock]":
                    panelReportProductStock.setName("ProductStock");
                    frameMain.getScp_container().setViewportView(panelReportProductStock);
                    panelReportProductStock.getTxf_StockMin().requestFocus();
                    break;
                default:
                    frameMain.getScp_container().setViewportView(panelPresentation);
                    break;
            }

        } else {
            frameMain.getScp_container().setViewportView(panelPresentation);
        }
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

    //for cancel option
    public void setPanelProductsAdmin(PanelProductsAdmin panelProductsAdmin, TreePath tp) {
        this.panelProductsAdmin = panelProductsAdmin;
        this.showPanel(tp);
    }

    public void setPanelSalesTicket(PanelSalesTicket panelSalesTicket, TreePath tp) {
        this.panelSalesTicket = panelSalesTicket;
        this.showPanel(tp);
    }

    public void setPanelReportProductStock(PanelReportProductStock panelReportProductStock, TreePath tp) {
        this.panelReportProductStock = panelReportProductStock;
        this.showPanel(tp);
    }

    //WW ----
    private void showGralPanel_WW(String s) {
        WWPanel panel = null;
        switch (s) {
            case "Employee":
                WWEmployee wwemployee = new WWEmployee();
                panel = new WWPanel(wwemployee.getFilter(), new WWTableModel(wwemployee.getListTableColumns()), wwemployee.getPanelName());
                break;
            case "User":
                WWUser wwuser = new WWUser();
                panel = new WWPanel(wwuser.getFilter(), new WWTableModel(wwuser.getListTableColumns()), wwuser.getPanelName());
                break;
            case "Category":
                WWCategory wwcategory = new WWCategory();
                panel = new WWPanel(wwcategory.getFilter(), new WWTableModel(wwcategory.getListTableColumns()), wwcategory.getPanelName());
                break;
            case "Price":
                WWPrice wwprice = new WWPrice();
                panel = new WWPanel(wwprice.getFilter(), new WWTableModel(wwprice.getListTableColumns()), wwprice.getPanelName());
                break;
            case "Store":
                WWStore wwstore = new WWStore();
                panel = new WWPanel(wwstore.getFilter(), new WWTableModel(wwstore.getListTableColumns()), wwstore.getPanelName());
                break;
            case "Measure":
                WWMeasure wwmeasure = new WWMeasure();
                panel = new WWPanel(wwmeasure.getFilter(), new WWTableModel(wwmeasure.getListTableColumns()), wwmeasure.getPanelName());
                break;

        }
        if (panel != null) {
            panel.getBtn_save().setAction(new Btn_adminAction(panel, nifax.control.controller.Administration.SAVE, "Guardar"));
            panel.getBtn_search().setAction(new Btn_adminAction(panel, nifax.control.controller.Administration.SEARCH, "Buscar"));
            panel.getBtn_list().setAction(new Btn_adminAction(panel, nifax.control.controller.Administration.LIST, "Listar"));
            panel.getBtn_delete().setAction(new Btn_adminAction(panel, nifax.control.controller.Administration.DELETE, "Eliminar"));
            panel.getBtn_cancel().setAction(new Btn_adminAction(panel, nifax.control.controller.Administration.CANCEL, "Cancelar"));

            panel.getBtn_search().setEnabled(false);

            frameMain.getScp_container().setViewportView(panel);
        }

    }

}
