package nifax.control.controller;

import java.util.Collections;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.Category;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.Store;
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

        switch (titleTab) {

            case Category:
                CategoryOperation categoryOperation = CategoryOperation.getInstance();
                Map<String, Category> categoryList = categoryOperation.List();
                MapDb.categoryList = categoryList;

                categoryList.entrySet().stream().map((entry) -> entry.getValue()).forEach((category) -> {
                    DefaultTableModel modelTable = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
                    Vector v = new Vector();

                    v.add(false);
                    v.add(category.getId());
                    v.add(category.getDescription());

                    modelTable.insertRow(0, v);

                });

                break;
            case Store:
                StoreOperation storeOperation = StoreOperation.getInstance();
                Map<String, Store> storeList = storeOperation.List();
                MapDb.storeList = storeList;
                storeList.entrySet().stream().map((entry) -> entry.getValue()).forEach((store) -> {
                    DefaultTableModel modelTable = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
                    Vector v = new Vector();

                    v.add(false);
                    v.add(store.getId());
                    v.add(store.getDescription());

                    modelTable.insertRow(0, v);

                });

                break;
            case Measure:
                MeasureOperation measureOperation = MeasureOperation.getInstance();
                Map<String, Measure> measureList = measureOperation.List();
                MapDb.measureList = measureList;
                measureList.entrySet().stream().map((entry) -> entry.getValue()).forEach((measure) -> {
                    DefaultTableModel modelTable = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
                    Vector v = new Vector();

                    v.add(false);
                    v.add(measure.getId());
                    v.add(measure.getDescription());

                    modelTable.insertRow(0, v);

                });
                break;
            case Price:
                PriceOperation priceOperation = PriceOperation.getInstance();
                Map<String, Price> priceList = priceOperation.List();
                MapDb.priceList = priceList;
                priceList.entrySet().stream().map((entry) -> entry.getValue()).forEach((price) -> {
                    DefaultTableModel modelTable = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
                    Vector v = new Vector();

                    v.add(false);
                    v.add(price.getId());
                    v.add(price.getDescription());
                    v.add(price.getProfit());

                    modelTable.insertRow(0, v);

                });
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

            int indexBoolean = this.panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("");
            int indexdescription = this.panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("DESCRIPCION");

            for (int i = 0; i < this.panelGeneralAdmin.getTbl_gral().getRowCount(); i++) {
                if (this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexBoolean).equals(true)) {
                    switch (tab) {
                        case Category:
                            op.Delete(MapDb.categoryList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                            break;
                        case Measure:

                            Measure measure = (Measure) MapDb.measureList.get(this.panelGeneralAdmin.getTbl_gral().getValueAt(i,
                                            indexdescription).toString());

                            measure.getProductMeasures().stream().forEach((productMeasure) -> {
                                op.Delete(productMeasure);
                            });

                            measure.setProductMeasures(null);
                            op.Delete(measure);

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
}
