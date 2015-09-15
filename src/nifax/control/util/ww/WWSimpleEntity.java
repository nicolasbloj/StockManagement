package nifax.control.util.ww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import ww.WWFilter;
import ww.WWFilterRow;
import ww.WWTableColumn;
import validate.MyAlphaNumericFilter;

/**
 *
 * @author NB
 */
public class WWSimpleEntity {

    private final WWFilter filter;
    private final ArrayList<WWTableColumn> listTableColumns;
    private final String panelName;

    public WWSimpleEntity(final String panelName,final String title) {

        this.panelName = panelName;

        Map<String, WWFilterRow> mapFilterRow = new HashMap<>();
        ArrayList<WWFilterRow> listFilterRow = new ArrayList<>();

        
        JTextField txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyAlphaNumericFilter());
        mapFilterRow.put("description", new WWFilterRow(new JLabel("Descripcion"),txf));
        listFilterRow.add(mapFilterRow.get("description"));

        filter = new WWFilter(title, mapFilterRow, listFilterRow);

        listTableColumns = new ArrayList<>();
        listTableColumns.add(new WWTableColumn("", java.lang.Boolean.class, true));
        listTableColumns.add(new WWTableColumn("Id", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Descripcion", java.lang.String.class, false));

    }

    public WWFilter getFilter() {
        return filter;
    }

    public ArrayList<WWTableColumn> getListTableColumns() {
        return listTableColumns;
    }

    public String getPanelName() {
        return panelName;
    }

}
