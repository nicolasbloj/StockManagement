package nifax.control.util.ww;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import nifax.control.controller.Administration;
import nifax.control.validate.MyDoubleFilter;
import nifax.control.view.util.ww.WWFilterRow;
import nifax.control.view.util.ww.WWTableColumn;

/**
 *
 * @author NB
 */
public class WWPrice extends WWSimpleEntity{
    
    public WWPrice(){
    super(Administration.Price,"Lista de precio");
    
    JTextField txf = new JTextField("");
    ((PlainDocument) txf.getDocument()).setDocumentFilter(new MyDoubleFilter());
    super.getFilter().getMapFilterRow().put("profit", new WWFilterRow(new JLabel("Rentabilidad"), txf));
    super.getFilter().getListFilterRow().add(super.getFilter().getMapFilterRow().get("profit"));
    super.getListTableColumns().add(new WWTableColumn("Rentabilidad", java.lang.String.class, false));
    }
}
