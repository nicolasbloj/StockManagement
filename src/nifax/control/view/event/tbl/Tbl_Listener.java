package nifax.control.view.event.tbl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;

/**
 *
 * @author NB
 */
public class Tbl_Listener implements MouseListener {

    private final JTable table;

    public Tbl_Listener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int col = table.columnAtPoint(e.getPoint());
        String name = table.getColumnName(col);

        if (name.equals("")) {
            int indexCheck = table.getColumnModel().getColumnIndex("");
            if (allCheckFalse(table)) {
                for (int i = 0; i < table.getRowCount(); i++) {
                    table.setValueAt(Boolean.TRUE, i, indexCheck);
                }
            } else {
                for (int i = 0; i < table.getRowCount(); i++) {
                    if (table.getValueAt(i, indexCheck).equals(true)) {
                        table.setValueAt(Boolean.FALSE, i, indexCheck);
                    }

                }
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {

    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {

    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

    private boolean allCheckFalse(JTable table) {
        int indexCheck = table.getColumnModel().getColumnIndex("");
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, indexCheck).equals(true)) {
                return false;
            }
        }
        return true;
    }

}
