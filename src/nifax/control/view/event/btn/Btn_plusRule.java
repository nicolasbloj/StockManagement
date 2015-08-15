package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Btn_plusRule extends AbstractAction {

    private final PanelProductsAdmin panelProductsAdmin;

    public Btn_plusRule(PanelProductsAdmin panelProductsAdmin) {
        this.panelProductsAdmin = panelProductsAdmin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String measure = panelProductsAdmin.getCbx_measure().getSelectedItem().toString();
        String equivalent = panelProductsAdmin.getTxf_equivalent().getText();

        DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();

        Vector vector = new Vector();
        vector.add(tableModel.getRowCount()+1);
        vector.add("");
        vector.add(measure);
        vector.add(equivalent);
        vector.add(false);

        tableModel.insertRow(tableModel.getRowCount(), vector);

    }

}
