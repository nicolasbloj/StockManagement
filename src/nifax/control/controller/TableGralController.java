package nifax.control.controller;

import java.util.Collections;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.EntityModel;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.modeler.CategoryOperation;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.StoreOperation;
import nifax.control.util.ColumnSorter;
import nifax.control.util.Table;
import nifax.control.view.panel.PanelGeneralAdmin;

/**
 *
 * @author NB
 */
public final class TableGralController {

    private static TableGralController instance = null;

    private PanelGeneralAdmin panelGeneralAdmin;

    public static final String Category = "Categoria";
    public static final String Store = "Deposito";
    public static final String Price = "Lista de precio";
    public static final String Measure = "Medida";

    protected TableGralController() {
    }

    public static TableGralController getInstance() {
        if (instance == null) {
            instance = new TableGralController();
        }
        return instance;
    }

    public void setPanelGeneralAdmin(PanelGeneralAdmin panelGeneralAdmin) {
        this.panelGeneralAdmin = panelGeneralAdmin;
    }

    public void list(String titleTab) {
        Table.clear(panelGeneralAdmin.getTbl_gral());
        Map map;
        switch (titleTab) {

            case Category:
                CategoryOperation categoryOperation = CategoryOperation.getInstance();
                map = categoryOperation.List();
                MapDb.categoryList = map;
                this.fillTable(map);
                break;
            case Store:
                StoreOperation storeOperation = StoreOperation.getInstance();
                map = storeOperation.List();
                MapDb.storeList = map;
                this.fillTable(map);
                break;
            case Measure:
                MeasureOperation measureOperation = MeasureOperation.getInstance();
                map = measureOperation.List();
                MapDb.measureList = map;
                this.fillTable(map);
                break;
            case Price:
                PriceOperation priceOperation = PriceOperation.getInstance();
                map = priceOperation.List();
                MapDb.priceList = map;
                this.fillTable(map);
                break;

        }

        panelGeneralAdmin.getTbl_gral().setAutoCreateColumnsFromModel(false);
        DefaultTableModel model = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
        Vector data = model.getDataVector();
        Collections.sort(data, new ColumnSorter(1));
        model.fireTableStructureChanged();

        panelGeneralAdmin.repaint();

    }

    public void delete(String tab) {
        try {
            HQLOperation op = HQLOperation.getInstance();

            int indexCheck = this.panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("");
            int indexdescription = this.panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("DESCRIPCION");

            for (int i = 0; i < this.panelGeneralAdmin.getTbl_gral().getRowCount(); i++) {
                if (this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexCheck).equals(true)) {
                    switch (tab) {
                        case Category:
                            op.Delete(MapDb.categoryList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                            break;
                        case Measure:
                            op.Delete(MapDb.measureList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i,indexdescription).toString()));
                            break;
                        case Store:
                            op.Delete(MapDb.storeList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                            break;
                        case Price:
                            op.Delete(MapDb.priceList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                            break;
                    }
                }
            }

            list(tab);

        } catch (org.hibernate.exception.ConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar ya que existen otros elementos que usan este valor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillTable(Map<String, EntityModel> list) {
        list.entrySet().stream().map((entry) -> entry.getValue()).forEach((EntityModel obj) -> {
            DefaultTableModel modelTable = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
            Vector v = new Vector();

            v.add(false);
            v.add(obj.getId());
            v.add(obj.getDescription());

            if (obj instanceof Price) {
                Price p = (Price) obj;
                v.add(p.getProfit());
            }

            modelTable.insertRow(0, v);

        }
        );

    }

}
