package nifax.control.view.util;

import nifax.control.view.event.tre.Tre_Listener;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import nifax.control.view.frame.FrameMain;

/**
 *
 * @author NB
 */
public class Tre extends JTree {

    private final Tre_Listener TreeListener;

    public Tre(final FrameMain jFrameMain) {

        TreeListener = new Tre_Listener();

        addMouseListener(TreeListener);
        addKeyListener(TreeListener);

        DefaultMutableTreeNode TreeRoot = new DefaultMutableTreeNode("NiFax");
        DefaultTreeModel TreeModel = new DefaultTreeModel(TreeRoot);

        setModel(TreeModel);

        //--
        DefaultMutableTreeNode defaultMutableTreeNodeAdministration = new DefaultMutableTreeNode("Administracion");
        DefaultMutableTreeNode DefaultMutableTreeNodeOperation = new DefaultMutableTreeNode("Operacion");
        DefaultMutableTreeNode DefaultMutableTreeNodeSystem = new DefaultMutableTreeNode("Sistema");
        DefaultMutableTreeNode defaultMutableTreeNodeReports = new DefaultMutableTreeNode("Reportes");

        TreeModel.insertNodeInto(defaultMutableTreeNodeAdministration, TreeRoot, 0);
        TreeModel.insertNodeInto(DefaultMutableTreeNodeOperation, TreeRoot, 1);
        TreeModel.insertNodeInto(defaultMutableTreeNodeReports, TreeRoot, 2);
        TreeModel.insertNodeInto(DefaultMutableTreeNodeSystem, TreeRoot, 3);

        // Administration
        DefaultMutableTreeNode defaultMutableTreeNodeProducts = new DefaultMutableTreeNode("Productos");
        DefaultMutableTreeNode defaultMutableTreeNodeProductsHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeProducts, defaultMutableTreeNodeAdministration, 0);
        TreeModel.insertNodeInto(defaultMutableTreeNodeProductsHlm, defaultMutableTreeNodeProducts, 0);

        //
        DefaultMutableTreeNode defaultMutableTreeNodeCategories = new DefaultMutableTreeNode("Categorias");
        DefaultMutableTreeNode defaultMutableTreeNodeCategoriessHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeCategories, defaultMutableTreeNodeAdministration, 1);
        TreeModel.insertNodeInto(defaultMutableTreeNodeCategoriessHlm, defaultMutableTreeNodeCategories, 0);

        //
        DefaultMutableTreeNode defaultMutableTreeNodePrices = new DefaultMutableTreeNode("Lista de precios");
        DefaultMutableTreeNode defaultMutableTreeNodePricesHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodePrices, defaultMutableTreeNodeAdministration, 2);
        TreeModel.insertNodeInto(defaultMutableTreeNodePricesHlm, defaultMutableTreeNodePrices, 0);

        //
        DefaultMutableTreeNode defaultMutableTreeNodeStores = new DefaultMutableTreeNode("Depositos");
        DefaultMutableTreeNode defaultMutableTreeNodeStoresHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeStores, defaultMutableTreeNodeAdministration, 3);
        TreeModel.insertNodeInto(defaultMutableTreeNodeStoresHlm, defaultMutableTreeNodeStores, 0);

        //
        DefaultMutableTreeNode defaultMutableTreeNodeMeasures = new DefaultMutableTreeNode("Medidas");
        DefaultMutableTreeNode defaultMutableTreeNodeMeasuresHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeMeasures, defaultMutableTreeNodeAdministration, 4);
        TreeModel.insertNodeInto(defaultMutableTreeNodeMeasuresHlm, defaultMutableTreeNodeMeasures, 0);
        
        //
        DefaultMutableTreeNode defaultMutableTreeNodeEmployees = new DefaultMutableTreeNode("Empleados");
        DefaultMutableTreeNode defaultMutableTreeNodeEmployeesHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeEmployees, defaultMutableTreeNodeAdministration, 5);
        TreeModel.insertNodeInto(defaultMutableTreeNodeEmployeesHlm, defaultMutableTreeNodeEmployees, 0);

        // Sales
        DefaultMutableTreeNode defaultMutableTreeNodeSales = new DefaultMutableTreeNode("Ventas");
        DefaultMutableTreeNode defaultMutableTreeNodeTicket = new DefaultMutableTreeNode("Ticket");

        TreeModel.insertNodeInto(defaultMutableTreeNodeSales, DefaultMutableTreeNodeOperation, 0);
        TreeModel.insertNodeInto(defaultMutableTreeNodeTicket, defaultMutableTreeNodeSales, 0);

        // Reports
        DefaultMutableTreeNode defaultMutableTreeNodeReportProducts = new DefaultMutableTreeNode("Productos");
        DefaultMutableTreeNode defaultMutableTreeNodeProductsStock = new DefaultMutableTreeNode("Stock");

        TreeModel.insertNodeInto(defaultMutableTreeNodeReportProducts, defaultMutableTreeNodeReports, 0);
        TreeModel.insertNodeInto(defaultMutableTreeNodeProductsStock, defaultMutableTreeNodeReportProducts, 0);

        // System
        DefaultMutableTreeNode defaultMutableTreeNodeUsers = new DefaultMutableTreeNode("Usuarios");
        DefaultMutableTreeNode defaultMutableTreeNodeUsersHlm = new DefaultMutableTreeNode("Gestion");//this could be to used other nodes

        TreeModel.insertNodeInto(defaultMutableTreeNodeUsers, DefaultMutableTreeNodeSystem, 0);
        TreeModel.insertNodeInto(defaultMutableTreeNodeUsersHlm, defaultMutableTreeNodeUsers, 0);

        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

    }

    public static void expandAll(final JTree tree) {
        int row = 0;
        while (row < tree.getRowCount()) {
            tree.expandRow(row);
            row++;
        }
    }

}
