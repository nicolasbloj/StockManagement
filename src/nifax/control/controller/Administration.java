package nifax.control.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.Category;
import nifax.control.model.EntityModel;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.Product;
import nifax.control.model.ProductMeasure;
import nifax.control.model.Store;
import nifax.control.model.modeler.CategoryOperation;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.StoreOperation;
import nifax.control.util.ColumnSorter;
import nifax.control.util.Frame;
import nifax.control.util.Message;
import nifax.control.util.Table;
import nifax.control.view.panel.PanelGeneralAdmin;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Administration implements ActionController{

    private static Administration instance = null;

    protected Administration() {
    }

    public static Administration getInstance() {
        if (instance == null) {
            instance = new Administration();
        }
        return instance;
    }

    //Constants SSDL
    public static final int SAVE = 0;
    public static final int SEARCH = 1;
    public static final int DELETE = 2;
    public static final int LIST = 3;

    // Panels name - GRAL
    public static final String Category = "Category";
    public static final String Store = "Store";
    public static final String Price = "Price";
    public static final String Measure = "Measure";

    //Panels name - PRODUCT
    private static final String Product = "Product";
    private static final String Offer = "Offer";
    private static final String Restoration = "Restoration";
    private static final String Stock = "Stock";

    //Panels name - EXTRAS
    //Ticket panel , for product's list and select one.
    private static final String Ticket = "Ticket";

    @Override
    public Boolean operate(JPanel panel, String panelName, int ACTION) {
        switch (ACTION) {
            case SAVE:
                return save(panel, panelName);
            case SEARCH:
                return search(panel, panelName);
            case LIST:
                return list(panel, panelName);
            case DELETE:
                return delete(panel, panelName);
        }
        return Boolean.FALSE;
    }

    private Boolean save(JPanel panel, String panelName) {
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                Message.DialogSave, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                switch (panelName) {
                    case Product:
                        return saveProduct((PanelProductsAdmin) panel);
                    case Offer:
                    //return ;
                    case Restoration:
                    //return ;
                    case Stock:
                    //return ;
                    case Category:
                    case Store:
                    case Price:
                    case Measure:
                        return gralSave((PanelGeneralAdmin) panel, panelName);
                }
            }
            return true;
        } catch (NumberFormatException ex1) {
            JOptionPane.showMessageDialog(null, Message.NumberFormatException, Message.NumberFormatExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, Message.NullPointerException, Message.NullPointerExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }
    }

    private Boolean search(JPanel panel, String panelName) {
        try {
            switch (panelName) {
                case Product:
                    return searchProduct((PanelProductsAdmin) panel);
                case Offer:
                //return ;
                case Restoration:
                //return ;
                case Stock:
                //return ;
                case Category:
                case Store:
                case Price:
                case Measure:
                    return false;
            }
            return true;
        } catch (NullPointerException ex1) {
            return false;
        }
    }

    private Boolean list(JPanel panel, String panelName) {
        try {
            switch (panelName) {
                case Product:
                case Ticket:
                    return productListAndAdvancedSearch(panel);
                //return ;
                case Offer:
                //return ;
                case Restoration:
                //return ;
                case Stock:
                //return ;
                case Category:
                case Store:
                case Price:
                case Measure:
                    return gralList((PanelGeneralAdmin) panel, panelName);
            }
            return true;
        } catch (NullPointerException ex1) {
            return false;
        }

    }

    private Boolean delete(JPanel panel, String panelName) {
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                Message.DialogDelete, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                switch (panelName) {
                    case Product:
                        return deleteProduct((PanelProductsAdmin) panel);
                    case Offer:
                    //return ;
                    case Restoration:
                    //return ;
                    case Stock:
                    //return ;
                    case Category:
                    case Store:
                    case Price:
                    case Measure:
                        return gralDelete((PanelGeneralAdmin) panel, panelName);
                }
            }
            return true;
        } catch (org.hibernate.exception.ConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, Message.ConstraintViolationException, Message.ConstraintViolationExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        } catch (NullPointerException ex2) {
            JOptionPane.showMessageDialog(null, Message.NullPointerException, Message.NullPointerExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }

    }

//  Product 
    private Boolean saveProduct(PanelProductsAdmin panelProductsAdmin) {

        String id = panelProductsAdmin.getLbl_idProduct().getText();
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        String category = panelProductsAdmin.getCbx_category().getSelectedItem().toString();
        String description = panelProductsAdmin.getTxf_descProduct().getText();
        double cost = Double.parseDouble(panelProductsAdmin.getTxf_cost().getText());
        double iva = Double.parseDouble(panelProductsAdmin.getCbx_iva().getSelectedItem().toString());

        int indexMeasure = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Medida");
        int indexEquivalent = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Equivalente");
        int indexCod = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Cod");

        //Measures.
        List<ProductMeasure> measures = new ArrayList<ProductMeasure>();
        for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {
            measures.add(new ProductMeasure(
                nifax.control.util.Number.stringToLong(panelProductsAdmin.getTbl_rules().getValueAt(i, indexCod).toString()),
                Double.parseDouble(panelProductsAdmin.getTbl_rules().getValueAt(i, indexEquivalent).toString()),
                MapDb.measureList.get(panelProductsAdmin.getTbl_rules().getValueAt(i, indexMeasure).toString()))
            );

        }

        Boolean active = panelProductsAdmin.getChx_active().isSelected();

        if (ProductOperation.getInstance().AddOrUpdate(id, code, description, cost,
            MapDb.categoryList.get(category), MapDb.ivaList.get(iva), active, measures));
        if (id.trim().length() > 0) {
            JOptionPane.showMessageDialog(null, Message.Edit);
        } else {
            JOptionPane.showMessageDialog(null, Message.Save);
        }

        //Reload panel
        Frame.reloadPanel();
        panelProductsAdmin.repaint();

        return Boolean.TRUE;

    }

    private boolean searchProduct(PanelProductsAdmin panelProductsAdmin) {

        //Search by code
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        Product product = ProductOperation.getInstance().Find(new Product(code, 1));

        panelProductsAdmin.getLbl_idProduct().setText(String.valueOf(product.getId()));
        panelProductsAdmin.getCbx_category().setSelectedItem(product.getCategory().getDescription());
        panelProductsAdmin.getTxf_descProduct().setText(product.getDescription());
        panelProductsAdmin.getTxf_cost().setText(Double.toString(product.getCost()));
        panelProductsAdmin.getTxf_codeProduct().setText(product.getCode());
        panelProductsAdmin.getCbx_iva().setSelectedItem(product.getIva().getIva());
        panelProductsAdmin.getChx_active().setSelected(product.getActive());

        //Measures
        DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();
        tableModel.setRowCount(0);

        product.getProductMeasures().stream().map((productMeasure) -> {
            Vector v = new Vector();
            v.add(tableModel.getRowCount() + 1);
            v.add(String.valueOf(productMeasure.getId()));
            v.add(productMeasure.getMeasure().getDescription());
            v.add(productMeasure.getQuantity());
            v.add(false);
            return v;
        }
        ).forEach((v) -> {
            tableModel.insertRow(tableModel.getRowCount(), v);
        }
        );

        panelProductsAdmin.getTxf_codeProduct().setEnabled(false);
        return Boolean.TRUE;

    }

    private boolean deleteProduct(PanelProductsAdmin panelProductsAdmin) {
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        ProductOperation productOperation = ProductOperation.getInstance();
        Product product = productOperation.Find(new Product(code, 1));

        Set<ProductMeasure> productMeasuresAux = new HashSet<ProductMeasure>();

        product.getProductMeasures().stream().forEach((productMeasure) -> {
            productMeasuresAux.add(productMeasure);
        });

        product.setProductMeasures(null);

        productOperation.Delete(product);

        productMeasuresAux.stream().forEach((pm) -> {
            productOperation.Delete(pm);
        });

        JOptionPane.showMessageDialog(null, Message.Delete);

        //Reload panel
        Frame.reloadPanel();
        panelProductsAdmin.repaint();

        return Boolean.TRUE;

    }

    // Category,Store,Price,Measure.
    public Boolean gralSave(PanelGeneralAdmin panelGeneralAdmin, String panelName) {

        String desc = panelGeneralAdmin.getTxf_descGral().getText();
        double profit;
        HQLOperation hqlOperation = HQLOperation.getInstance();
        switch (panelName) {
            case Category:
                Category category = new Category(desc);
                hqlOperation.Insert(category);
                if (MapDb.categoryList != null) {
                    MapDb.categoryList.put(category.getDescription(), category);
                }
                break;
            case Store:
                Store store = new Store(desc);
                hqlOperation.Insert(store);
                if (MapDb.storeList != null) {
                    MapDb.storeList.put(store.getDescription(), store);
                }
                break;
            case Measure:
                Measure measure = new Measure(desc);
                hqlOperation.Insert(measure);
                if (MapDb.measureList != null) {
                    MapDb.measureList.put(measure.getDescription(), measure);
                }
                break;
            case Price:
                profit = Double.parseDouble(panelGeneralAdmin.getTxf_profitGral().getText());
                Price price = new Price(desc, profit);
                hqlOperation.Insert(price);
                if (MapDb.priceList != null) {
                    MapDb.priceList.put(price.getDescription(), price);
                }
                break;

        }

        //Reload panel
        Frame.reloadPanel();
        panelGeneralAdmin.repaint();

        return Boolean.TRUE;

    }

    public Boolean gralDelete(PanelGeneralAdmin panelGeneralAdmin, String panelName) {
        HQLOperation op = HQLOperation.getInstance();

        int indexCheck = panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("");
        int indexdescription = panelGeneralAdmin.getTbl_gral().getColumnModel().getColumnIndex("DESCRIPCION");

        for (int i = 0; i < panelGeneralAdmin.getTbl_gral().getRowCount(); i++) {
            if (panelGeneralAdmin.getTbl_gral().getValueAt(i, indexCheck).equals(true)) {
                switch (panelName) {
                    case Category:
                        op.Delete(MapDb.categoryList.get(panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                        break;
                    case Measure:
                        op.Delete(MapDb.measureList.get(panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                        break;
                    case Store:
                        op.Delete(MapDb.storeList.get(panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                        break;
                    case Price:
                        op.Delete(MapDb.priceList.get(panelGeneralAdmin.getTbl_gral().getValueAt(i, indexdescription).toString()));
                        break;
                }
            }
        }

        gralList(panelGeneralAdmin, panelName);
        return Boolean.TRUE;

    }

    private Boolean gralList(PanelGeneralAdmin panelGeneralAdmin, String panelName) {

        Table.clear(panelGeneralAdmin.getTbl_gral());
        Map map = null;
        switch (panelName) {

            case Category:
                CategoryOperation categoryOperation = CategoryOperation.getInstance();
                map = categoryOperation.List();
                MapDb.categoryList = map;
                break;
            case Store:
                StoreOperation storeOperation = StoreOperation.getInstance();
                map = storeOperation.List();
                MapDb.storeList = map;
                break;
            case Measure:
                MeasureOperation measureOperation = MeasureOperation.getInstance();
                map = measureOperation.List();
                MapDb.measureList = map;
                break;
            case Price:
                PriceOperation priceOperation = PriceOperation.getInstance();
                map = priceOperation.List();
                MapDb.priceList = map;
                break;

        }

        this.fillTable(map, panelGeneralAdmin.getTbl_gral());

        panelGeneralAdmin.getTbl_gral().setAutoCreateColumnsFromModel(false);
        DefaultTableModel model = (DefaultTableModel) panelGeneralAdmin.getTbl_gral().getModel();
        Vector data = model.getDataVector();
        Collections.sort(data, new ColumnSorter(1));
        model.fireTableStructureChanged();

        panelGeneralAdmin.repaint();
        return Boolean.TRUE;

    }

    private Boolean productListAndAdvancedSearch(JPanel panel) {
        /*
        javax.swing.JLayeredPane layeredPane = (javax.swing.JLayeredPane) panel.getParent().getParent().getParent().getParent();
        IntFrameProductSearch intFrameProductSearch = new IntFrameProductSearch(layeredPane);
        layeredPane.add(intFrameProductSearch);
       */
        
        //In inFrameProductSearch verify wich is the active panel for operate . Could do it if see the TreePath
        
        return Boolean.TRUE;
    }

    //Util.
    private void fillTable(Map<String, EntityModel> list, JTable table) {
        list.entrySet().stream().map((entry) -> entry.getValue()).forEach((EntityModel obj) -> {
            DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
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
