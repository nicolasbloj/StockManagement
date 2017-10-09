package nifax.control.util.ww;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import nifax.control.controller.Administration;
import ww.WWFilter;
import ww.WWFilterRow;
import ww.WWTableColumn;
import validate.MyAlphaNumericFilter;
import validate.MyIntegerFilter;

/**
 *
 * @author NB
 */
public class WWEmployee {

    private final WWFilter filter;
    private final ArrayList<WWTableColumn> listTableColumns;
    private final String panelName;

    public WWEmployee() {

        Map<String,WWFilterRow> mapFilterRow = new HashMap<>();
        ArrayList<WWFilterRow> listFilterRow = new ArrayList<>();
        
        
        JTextField txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyAlphaNumericFilter());
        mapFilterRow.put("name",new WWFilterRow(new JLabel("Nombre"), txf));
        listFilterRow.add(mapFilterRow.get("name"));
        
        txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyAlphaNumericFilter());
        mapFilterRow.put("lastname",new WWFilterRow(new JLabel("Apellido"), txf));
        listFilterRow.add(mapFilterRow.get("lastname"));
        
        txf =  new JTextField("");
        ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyIntegerFilter());
        mapFilterRow.put("phone",new WWFilterRow(new JLabel("Telefono"), txf));
        listFilterRow.add(mapFilterRow.get("phone"));
        
        filter = new WWFilter("Empleado", mapFilterRow,listFilterRow);

        listTableColumns = new ArrayList<>();
        listTableColumns.add(new WWTableColumn("", java.lang.Boolean.class, true));
        listTableColumns.add(new WWTableColumn("Id", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Nombre", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Apellido", java.lang.String.class, false));
        listTableColumns.add(new WWTableColumn("Celular", java.lang.String.class, false));
        
        panelName=Administration.Employee;

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
