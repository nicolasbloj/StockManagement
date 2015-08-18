package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nifax.control.model.ProductMeasure;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.util.Message;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Btn_lessRule extends AbstractAction {

    private final PanelProductsAdmin panelProductsAdmin;

    public Btn_lessRule(PanelProductsAdmin panelProductsAdmin) {
        this.panelProductsAdmin = panelProductsAdmin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int dialogResult = JOptionPane.showConfirmDialog(null,
            Message.DialogDelete,Message.DialogSaveAndDeleteTitle,
            JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {

            int indexCheck = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("");
            int indexIt = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("It");
            int indexCod = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Cod");

            DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();

            List<Integer> rowsToDelete = new ArrayList<Integer>();

            for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {

                if (panelProductsAdmin.getTbl_rules().getValueAt(i, indexCheck).equals(true)) {
                    rowsToDelete.add((Integer) panelProductsAdmin.getTbl_rules().getValueAt(i, indexIt));
                }

            }

            rowsToDelete.stream().forEach((row) -> {

                for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {

                    if (panelProductsAdmin.getTbl_rules().getValueAt(i, indexIt).equals(row)) {

                        if (panelProductsAdmin.getTbl_rules().getValueAt(i, indexCod).toString().trim().length() != 0) {

                            HQLOperation.getInstance().Delete(new ProductMeasure(Long.parseLong(panelProductsAdmin.getTbl_rules().getValueAt(i, indexCod).toString())));
                        }

                        tableModel.removeRow(i);
                    }

                }
            });

            //Order table by it
            for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {
                panelProductsAdmin.getTbl_rules().setValueAt(i + 1, i, indexIt);
            }
        }
        //
    }

}
