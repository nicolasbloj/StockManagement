package nifax.control.util;

import javax.swing.tree.*;
import javax.swing.*;
import java.awt.*;

public class TreeRenderer extends DefaultTreeCellRenderer {

    private boolean SELECTED;
    private final ImageIcon manage;
    private final ImageIcon report;
    private final ImageIcon sale;

    public TreeRenderer() {
        manage = new ImageIcon("src/nifax/control/image/manage.png");
        report = new ImageIcon("src/nifax/control/image/report.png");
        sale = new ImageIcon("src/nifax/control/image/sale.png");
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
        boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String text = (String) node.getUserObject();
        this.SELECTED = selected;

        if (SELECTED) {
            setForeground(Color.ORANGE);
        }

        switch (text) {
            case "Gestion":
                setIcon(manage);
                break;
            case "Ticket":
                setIcon(sale);
                break;
            case "Stock":
                setIcon(report);
                break;
        }

        setText(text);
        return (this);
    }
}
