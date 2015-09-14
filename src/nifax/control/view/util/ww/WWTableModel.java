package nifax.control.view.util.ww;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nb
 */
public class WWTableModel extends DefaultTableModel {

    //Columns's propierties
    private final String[] identifiers;
    private final Class[] types;
    private final boolean[] canEdit;

    public WWTableModel(final ArrayList<WWTableColumn> listColumns) {

        identifiers = new String[listColumns.size()];
        types = new Class[listColumns.size()];
        canEdit = new boolean[listColumns.size()];

        for (int i = 0; i < listColumns.size(); i++) {
            identifiers[i] = listColumns.get(i).getIdentifier();
            types[i] = listColumns.get(i).getType();
            canEdit[i] = listColumns.get(i).getEdit();
        }

        //Model setters.
        this.setColumnCount(identifiers.length);
        this.setColumnIdentifiers(identifiers);

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

}
