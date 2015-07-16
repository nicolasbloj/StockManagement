package nifax.control.view.util;

import nifax.control.view.event.JTreeMenuMainListener;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import nifax.control.view.FrameMain;

/**
 *
 * @author NB
 */
public class TreeMenuMain extends JTree {

    private final JTreeMenuMainListener TreeListener;

    public TreeMenuMain(FrameMain jFrameMain) {

        TreeListener = new JTreeMenuMainListener(jFrameMain);

        addMouseListener(TreeListener);

        DefaultMutableTreeNode TreeRoot = new DefaultMutableTreeNode("NiFax");
        DefaultTreeModel TreeModel = new DefaultTreeModel(TreeRoot);

        setModel(TreeModel);

        DefaultMutableTreeNode defaultMutableTreeNodeAdministration = new DefaultMutableTreeNode("Administracion");
        DefaultMutableTreeNode DefaultMutableTreeNodeOperation = new DefaultMutableTreeNode("Operacion");

        TreeModel.insertNodeInto(defaultMutableTreeNodeAdministration, TreeRoot, 0);
        TreeModel.insertNodeInto(DefaultMutableTreeNodeOperation, TreeRoot, 1);

        DefaultMutableTreeNode defaultMutableTreeNodeProducts = new DefaultMutableTreeNode("Productos");
        DefaultMutableTreeNode defaultMutableTreeNodeLoad = new DefaultMutableTreeNode("Cargar");//this could be to used other nodes
        
        TreeModel.insertNodeInto(defaultMutableTreeNodeProducts, defaultMutableTreeNodeAdministration, 0);
        TreeModel.insertNodeInto(defaultMutableTreeNodeLoad, defaultMutableTreeNodeProducts, 0);

        DefaultMutableTreeNode defaultMutableTreeNodeSales = new DefaultMutableTreeNode("Ventas");
        TreeModel.insertNodeInto(defaultMutableTreeNodeSales, DefaultMutableTreeNodeOperation, 0);

        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

    }

}
