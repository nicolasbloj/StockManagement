package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import nifax.control.util.Number;
import javax.swing.table.DefaultTableModel;
import nifax.control.util.Message;
import nifax.control.util.Table;
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
        try {
            String measure = panelProductsAdmin.getCbx_measure().getSelectedItem().toString();
            double equivalent = Double.parseDouble(panelProductsAdmin.getTxf_equivalent().getText());
            if (!Table.InCellTable(measure, panelProductsAdmin.getTbl_rules(), "Medida")) {

                DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();

                Vector vector = new Vector();
                vector.add(tableModel.getRowCount() + 1);
                vector.add("");
                vector.add(measure);
                vector.add(Double.parseDouble(Number.formateator.format(equivalent)));
                vector.add(false);

                tableModel.insertRow(tableModel.getRowCount(), vector);

            } else {
                JOptionPane.showMessageDialog(null,
                    Message.MeasureAlreadyLoaded, "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, Message.NumberFormatException, Message.NumberFormatExceptionTitle, JOptionPane.ERROR_MESSAGE);

        }
    }

}
