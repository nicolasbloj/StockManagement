package nifax.control.util.ww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import nifax.control.controller.Administration;
import nifax.control.validate.MyAlphaNumericFilter;
import nifax.control.validate.MyIntegerFilter;
import nifax.control.view.util.ww.WWFilter;
import nifax.control.view.util.ww.WWFilterRow;
import nifax.control.view.util.ww.WWTableColumn;

/**
 *
 * @author NB
 */
public class WWUser {

    private final WWFilter filter;
    private final ArrayList<WWTableColumn> listTableColumns;
    private final String panelName;

    public WWUser() {

        Map<String,WWFilterRow> mapFilterRow = new HashMap<>();
        ArrayList<WWFilterRow> listFilterRow = new ArrayList<WWFilterRow>();
        
        JTextField txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyAlphaNumericFilter());
        mapFilterRow.put("user",new WWFilterRow(new JLabel("Usuario"), txf));
        listFilterRow.add(mapFilterRow.get("user"));
        
        mapFilterRow.put("password",new WWFilterRow(new JLabel("Contraseña"), new JPasswordField("")));
        listFilterRow.add(mapFilterRow.get("password"));
        
        txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyIntegerFilter());
        mapFilterRow.put("employee_id",new WWFilterRow(new JLabel("Cod Empleado"), txf));
        listFilterRow.add(mapFilterRow.get("employee_id"));

        filter = new WWFilter("Usuario", mapFilterRow,listFilterRow);

        listTableColumns = new ArrayList<>();
        listTableColumns.add(new WWTableColumn("", java.lang.Boolean.class, true));
        listTableColumns.add(new WWTableColumn("Id", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Usuario", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Empleado", java.lang.String.class, false));
        
        
        panelName = Administration.User;

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
