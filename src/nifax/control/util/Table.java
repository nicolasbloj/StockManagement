package nifax.control.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NB
 */
public final class Table {

    public static void ocultColumns(JTable tbl, int columna[]) {

        for (int i = 0; i < columna.length; i++) {

            tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);

            tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);

            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);

            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);

        }
    }

    public static void clear(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

}
