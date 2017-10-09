package nifax.control.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.TreePath;
import nifax.control.data.MapDb;
import nifax.control.model.Category;
import nifax.control.model.Employee;
import nifax.control.model.SimpleEntity;
import nifax.control.model.Measure;
import nifax.control.model.Offer;
import nifax.control.model.Price;
import nifax.control.model.ProdRelEntity;
import nifax.control.model.Product;
import nifax.control.model.ProductMeasure;
import nifax.control.model.Restoration;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.EmployeeOperation;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.util.ColumnSorter;
import nifax.control.util.UtilFrame;
import nifax.control.util.Message;
import nifax.control.util.Table;
import nifax.control.view.internalframe.IntFrameProductSearch;
import nifax.control.view.panel.PanelProductsAdmin;
import ww.WWPanel;

/**
 *
 * @author NB
 */
public class Administration implements ActionController {

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
    public static final int CANCEL = 4;

    // Panels name - GRAL
    public static final String Category = "Category";
    public static final String Store = "Store";
    public static final String Price = "Price";
    public static final String Measure = "Measure";
    public static final String Employee = "Employee";
    public static final String User = "User";

    //Panels name - PRODUCT
    private static final String Product = "Product";

    //Panels name - EXTRAS
    //Ticket panel , for product's list and select one.
    private static final String Ticket = "Ticket";

    //Tables name
    private static final String TableRules = "TableRules";
    private static final String TableOffers = "TableOffers";
    private static final String TableRestorations = "TableRestorations";
    private static final String TableStocks = "TableStocks";

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
            case CANCEL:
                return cancel(panelName);
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
                    case Category:
                    case Store:
                    case Price:
                    case Measure:
                    case Employee:
                    case User:
                        return gralSave_WW((WWPanel) panel, panelName);

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
                case Category:
                case Store:
                case Price:
                case Measure:
                    //Not implemented yet.
                    return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (NullPointerException ex1) {
            return Boolean.FALSE;
        }
    }

    private Boolean list(JPanel panel, String panelName) {
        try {
            switch (panelName) {
                case Product:
                case Ticket:
                    return productListAndAdvancedSearch(panel);
                case Category:
                case Store:
                case Price:
                case Measure:
                case Employee:
                case User:
                    return gralList_WW((WWPanel) panel, panelName);
            }
            return Boolean.TRUE;
        } catch (NullPointerException ex1) {
            return Boolean.FALSE;
        }

    }

    private Boolean delete(JPanel panel, String panelName) {
        boolean graldelete = false;
        try {

            int dialogResult = JOptionPane.showConfirmDialog(null,
                Message.DialogDelete, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                switch (panelName) {
                    case Product:
                        return deleteProduct((PanelProductsAdmin) panel);
                    case Category:
                    case Store:
                    case Price:
                    case Measure:
                    case Employee:
                    case User:
                        graldelete = true;
                        return gralDelete_WW((WWPanel) panel, panelName);
                }
            }
            return Boolean.TRUE;
        } catch (org.hibernate.exception.ConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, Message.ConstraintViolationException, Message.ConstraintViolationExceptionTitle, JOptionPane.ERROR_MESSAGE);
            if (graldelete) {
                gralList_WW((WWPanel) panel, panelName);
            }
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
        String categoryDesc = panelProductsAdmin.getCbx_category().getSelectedItem().toString();
        String description = panelProductsAdmin.getTxf_descProduct().getText();
        double cost = Double.parseDouble(panelProductsAdmin.getTxf_cost().getText());
        double iva = Double.parseDouble(panelProductsAdmin.getCbx_iva().getSelectedItem().toString());

        List<ProductMeasure> measures = this.getListOfTable(panelProductsAdmin.getTbl_rules());

        List<Offer> offers = this.getListOfTable(panelProductsAdmin.getTbl_offer());

        List<Restoration> restorations = this.getListOfTable(panelProductsAdmin.getTbl_restoration());

        List<Stock> stocks = this.getListOfTable(panelProductsAdmin.getTbl_stock());

        Boolean active = panelProductsAdmin.getChx_active().isSelected();

        Category category = MapDb.getCategoryList().get(categoryDesc);
        if (category != null) {
            if (ProductOperation.getInstance().AddOrUpdate(id, code, description, cost,
                category, MapDb.getIvaList().get(iva), active, measures,
                offers, stocks, restorations));
            if (id.trim().length() > 0) {
                JOptionPane.showMessageDialog(null, Message.Edit);
            } else {
                JOptionPane.showMessageDialog(null, Message.Save);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                Message.CategoryInvalid, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;
        }

        //Reload panel
        TreePath tp = Navigation.getInstance().getLastSelectedTreePath();
        Navigation.getInstance().setPanelProductsAdmin(new PanelProductsAdmin(), tp);

        return Boolean.TRUE;

    }

    private boolean searchProduct(PanelProductsAdmin panelProductsAdmin) {
        //Search by code
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        Product product = ProductOperation.getInstance().Find(new Product(code, 1));
        fillPanelProductsAdmin(product, panelProductsAdmin);
        return Boolean.TRUE;
    }

    public void fillPanelProductsAdmin(Product product, PanelProductsAdmin panelProductsAdmin) {
        panelProductsAdmin.getLbl_idProduct().setText(String.valueOf(product.getId()));
        panelProductsAdmin.getCbx_category().setSelectedItem("");//Because when set category in cbx and cbx containts text, the cbx no refresh 
        panelProductsAdmin.getCbx_category().setSelectedItem(product.getCategory().getDescription());
        panelProductsAdmin.getTxf_descProduct().setText(product.getDescription());
        panelProductsAdmin.getTxf_cost().setText(Double.toString(product.getCost()));
        panelProductsAdmin.getCbx_iva().setSelectedItem(product.getIva().getIva());
        panelProductsAdmin.getChx_active().setSelected(product.getActive());
        panelProductsAdmin.getTxf_codeProduct().setEnabled(false);
        panelProductsAdmin.getTxf_codeProduct().setText(product.getCode());//It's necesary when is called from InternalFrame
        panelProductsAdmin.getTxf_codeProductOffer().setText(product.getCode());
        panelProductsAdmin.getTxf_descProductOffer().setText(product.getDescription());
        panelProductsAdmin.getTxf_codeProductRestoration().setText(product.getCode());
        panelProductsAdmin.getTxf_descProductRestoration().setText(product.getDescription());
        panelProductsAdmin.getTxf_codeProductStock().setText(product.getCode());
        panelProductsAdmin.getTxf_descProductStock().setText(product.getDescription());

        //Measures
        DefaultTableModel measureTableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();
        measureTableModel.setRowCount(0);

        product.getProductMeasures().stream().map((productMeasure) -> {
            Vector v = new Vector();
            v.add(measureTableModel.getRowCount() + 1);
            v.add(String.valueOf(productMeasure.getId()));
            v.add(productMeasure.getMeasure().getDescription());
            v.add(productMeasure.getQuantity());
            v.add(false);
            return v;
        }
        ).forEach((v) -> {
            measureTableModel.insertRow(measureTableModel.getRowCount(), v);
        }
        );

        //Offers 
        DefaultTableModel offerTableModel = (DefaultTableModel) panelProductsAdmin.getTbl_offer().getModel();
        offerTableModel.setRowCount(0);

        product.getOffers().stream().map((offer) -> {
            Vector v = new Vector();
            v.add(offerTableModel.getRowCount() + 1);
            v.add(String.valueOf(offer.getId()));
            v.add(offer.getDescription());
            v.add(offer.getDiscount());
            v.add(offer.getQuantity());
            v.add(offer.getMeasure().getDescription());
            v.add(false);
            return v;
        }
        ).forEach((v) -> {
            offerTableModel.insertRow(offerTableModel.getRowCount(), v);
        }
        );

        //Restorations
        DefaultTableModel restorationTableModel = (DefaultTableModel) panelProductsAdmin.getTbl_restoration().getModel();
        restorationTableModel.setRowCount(0);

        product.getRestorations().stream().map((restoration) -> {
            Vector v = new Vector();
            v.add(restorationTableModel.getRowCount() + 1);
            v.add(String.valueOf(restoration.getId()));
            v.add(restoration.getDescription());
            v.add(restoration.getPeak());
            v.add(restoration.getMidpoint());
            v.add(restoration.getLowpoint());
            v.add(restoration.getMeasure().getDescription());
            v.add(restoration.getStore().getDescription());
            v.add(false);
            return v;
        }
        ).forEach((v) -> {
            restorationTableModel.insertRow(restorationTableModel.getRowCount(), v);
        }
        );

        //Stocks
        DefaultTableModel stockTableModel = (DefaultTableModel) panelProductsAdmin.getTbl_stock().getModel();
        stockTableModel.setRowCount(0);

        product.getStocks().stream().map((stock) -> {
            Vector v = new Vector();
            v.add(restorationTableModel.getRowCount() + 1);
            v.add(String.valueOf(stock.getId()));
            v.add(stock.getDescription());
            v.add(stock.getQuantity());
            v.add(stock.getStore().getDescription());
            v.add(stock.getMeasure().getDescription());

            v.add(false);
            return v;
        }
        ).forEach((v) -> {
            stockTableModel.insertRow(stockTableModel.getRowCount(), v);
        }
        );
    }

    private boolean deleteProduct(PanelProductsAdmin panelProductsAdmin) {
        if (panelProductsAdmin.getLbl_idProduct().getText().trim().length() > 0) {
            String code = panelProductsAdmin.getTxf_codeProduct().getText();
            ProductOperation productOperation = ProductOperation.getInstance();
            Product product = productOperation.Find(new Product(code, 1));

            //Duplicate code
            Set<ProductMeasure> productMeasuresAux = getListAux(product.getProductMeasures());
            Set<Offer> productOffersAux = getListAux(product.getOffers());
            Set<Restoration> productRestorationsAux = getListAux(product.getRestorations());
            Set<Stock> productStocksAux = getListAux(product.getStocks());

            product.setProductMeasures(null);
            product.setOffers(null);
            product.setRestorations(null);
            product.setStocks(null);

            productOperation.Delete(product);

            this.deleteListAux(productMeasuresAux);
            this.deleteListAux(productOffersAux);
            this.deleteListAux(productRestorationsAux);
            this.deleteListAux(productStocksAux);

            JOptionPane.showMessageDialog(null, Message.Delete);

            //Reload panel
            UtilFrame.reloadPanel();
            panelProductsAdmin.repaint();

        } else {
            JOptionPane.showMessageDialog(null,
                Message.FirstSearchProduct, Message.Warning, JOptionPane.WARNING_MESSAGE);
        }
        return Boolean.TRUE;

    }

    private Boolean productListAndAdvancedSearch(JPanel panel) {

        javax.swing.JLayeredPane layeredPane = (javax.swing.JLayeredPane) panel.getParent().getParent().getParent().getParent().getParent();
        IntFrameProductSearch intFrameProductSearch = new IntFrameProductSearch(layeredPane);
        layeredPane.add(intFrameProductSearch);

        //In inFrameProductSearch verify wich is the active panel for operate . Could do it if see the TreePath
        return Boolean.TRUE;
    }

    private List getListOfTable(JTable table) {
        //Measure,Offer,Restorations,Stock
        int indexCod = table.getColumnModel().getColumnIndex("Cod");
        int indexMeasure = table.getColumnModel().getColumnIndex("Medida");

        int indexDesc;
        int indexQuantity;
        int indexStore;

        int indexEquivalent;

        int indexPeak;
        int indexMidPoint;
        int indexLowPoint;

        int indexDiscOffer;

        List<ProdRelEntity> list = new ArrayList<ProdRelEntity>();
        for (int i = 0; i < table.getRowCount(); i++) {

            switch (table.getName()) {
                case TableRules:
                    indexEquivalent = table.getColumnModel().getColumnIndex("Equivalente");
                    list.add(new ProductMeasure(
                        nifax.control.util.Number.stringToLong(table.getValueAt(i, indexCod).toString()),
                        Double.parseDouble(table.getValueAt(i, indexEquivalent).toString()),
                        MapDb.getMeasureList().get(table.getValueAt(i, indexMeasure).toString()))
                    );
                    break;
                case TableOffers:
                    indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                    indexQuantity = table.getColumnModel().getColumnIndex("Cantidad");
                    indexDiscOffer = table.getColumnModel().getColumnIndex("Descuento");

                    list.add(new Offer(
                        nifax.control.util.Number.stringToLong(table.getValueAt(i, indexCod).toString()),
                        table.getValueAt(i, indexDesc).toString(),
                        Double.parseDouble(table.getValueAt(i, indexDiscOffer).toString()),
                        Double.parseDouble(table.getValueAt(i, indexQuantity).toString()),
                        MapDb.getMeasureList().get(table.getValueAt(i, indexMeasure).toString()))
                    );
                    break;
                case TableRestorations:
                    indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                    indexStore = table.getColumnModel().getColumnIndex("Deposito");

                    indexPeak = table.getColumnModel().getColumnIndex("Punto Max");
                    indexMidPoint = table.getColumnModel().getColumnIndex("Punto Rep");
                    indexLowPoint = table.getColumnModel().getColumnIndex("Punto Min");

                    list.add(new Restoration(
                        nifax.control.util.Number.stringToLong(table.getValueAt(i, indexCod).toString()),
                        table.getValueAt(i, indexDesc).toString(),
                        Double.parseDouble(table.getValueAt(i, indexPeak).toString()),
                        Double.parseDouble(table.getValueAt(i, indexMidPoint).toString()),
                        Double.parseDouble(table.getValueAt(i, indexLowPoint).toString()),
                        MapDb.getMeasureList().get(table.getValueAt(i, indexMeasure).toString()),
                        MapDb.getStoreList().get(table.getValueAt(i, indexStore).toString())));
                    break;
                case TableStocks:
                    indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                    indexStore = table.getColumnModel().getColumnIndex("Deposito");
                    indexQuantity = table.getColumnModel().getColumnIndex("Cantidad");

                    list.add(new Stock(
                        nifax.control.util.Number.stringToLong(table.getValueAt(i, indexCod).toString()),
                        table.getValueAt(i, indexDesc).toString(),
                        Double.parseDouble(table.getValueAt(i, indexQuantity).toString()),
                        MapDb.getMeasureList().get(table.getValueAt(i, indexMeasure).toString()),
                        MapDb.getStoreList().get(table.getValueAt(i, indexStore).toString()))
                    );
                    break;

            }

        }
        return list;

    }

    private Set getListAux(Set list) {
        Set productListAux = new HashSet();
        list.stream().forEach((obj) -> {
            productListAux.add(obj);
        });
        return productListAux;
    }

    private Boolean deleteListAux(Set list) {
        list.stream().forEach((obj) -> {
            HQLOperation.getInstance().Delete(obj);
        });
        return Boolean.TRUE;
    }

    private Boolean cancel(String panelName) {
        int dialogResult = JOptionPane.showConfirmDialog(null,
            Message.DialogCancel, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            switch (panelName) {
                case Product:
                    Navigation.getInstance().setPanelProductsAdmin(new PanelProductsAdmin(), null);
                    break;
                default:
                    Navigation.getInstance().showPanel(null);
                    break;
            }
        }
        return Boolean.TRUE;

    }

    //Util.
    private void fillSimpleEntityTable(Map<String, SimpleEntity> list, JTable table) {
        list.entrySet().stream().map((entry) -> entry.getValue()).forEach((SimpleEntity obj) -> {
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

    //WW -----------
    public Boolean gralSave_WW(WWPanel panel, String panelName) {
        JTextField txf_desc;
        String desc;
        switch (panelName) {
            case Employee:
                String name,
                 lastname,
                 phone;

                JTextField txf_name = (JTextField) panel.getFilter().getMapFilterRow().get("name").getComponent();
                name = txf_name.getText();
                JTextField txf_lastname = (JTextField) panel.getFilter().getMapFilterRow().get("lastname").getComponent();
                lastname = txf_lastname.getText();
                JTextField txf_phone = (JTextField) panel.getFilter().getMapFilterRow().get("phone").getComponent();
                phone = txf_phone.getText();

                Employee employee = new Employee(name, lastname, phone);

                if (employee.getIdentifier().trim().length() <= 0) {
                    return Boolean.FALSE;
                }

                HQLOperation.getInstance().Insert(employee);

                MapDb.AddOrReplaceEmployee(employee);
                break;
            case User:
                String user,
                 password,
                 employee_id;

                JTextField txf_user = (JTextField) panel.getFilter().getMapFilterRow().get("user").getComponent();
                user = txf_user.getText();
                JPasswordField pss_password = (JPasswordField) panel.getFilter().getMapFilterRow().get("password").getComponent();
                password = pss_password.getText();
                JTextField txf_employee_id = (JTextField) panel.getFilter().getMapFilterRow().get("employee_id").getComponent();
                employee_id = txf_employee_id.getText();

                Employee empl = EmployeeOperation.getInstance().Find(new Employee(Long.parseLong(employee_id)));

                if (empl == null) {
                    return Boolean.FALSE;
                }

                UserEmployee userEmployee = new UserEmployee(
                    user,
                    password,
                    empl
                );

                HQLOperation.getInstance().Insert(userEmployee);

                MapDb.AddOrReplaceUser(userEmployee);

                break;
            case Category:
                txf_desc = (JTextField) panel.getFilter().getMapFilterRow().get("description").getComponent();
                desc = txf_desc.getText();
                if (desc != null) {
                    if (desc.trim().length() <= 0) {
                        return Boolean.FALSE;
                    }
                }
                Category category = new Category(desc);
                HQLOperation.getInstance().Insert(category);

                MapDb.AddOrReplaceCategory(category);
                break;
            case Price:
                txf_desc = (JTextField) panel.getFilter().getMapFilterRow().get("description").getComponent();
                desc = txf_desc.getText();
                JTextField txf_profit = (JTextField) panel.getFilter().getMapFilterRow().get("profit").getComponent();
                String profit = txf_profit.getText();
                if (desc != null) {
                    if (desc.trim().length() <= 0) {
                        return Boolean.FALSE;
                    }
                }
                if (profit != null) {
                    if (profit.trim().length() <= 0) {
                        return Boolean.FALSE;
                    }
                }
                Price price = new Price(desc, Double.parseDouble(profit));
                HQLOperation.getInstance().Insert(price);

                MapDb.AddOrReplacePrice(price);
                break;
            case Store:
                txf_desc = (JTextField) panel.getFilter().getMapFilterRow().get("description").getComponent();
                desc = txf_desc.getText();
                if (desc != null) {
                    if (desc.trim().length() <= 0) {
                        return Boolean.FALSE;
                    }
                }

                Store store = new Store(desc);
                HQLOperation.getInstance().Insert(store);

                MapDb.AddOrReplaceStore(store);
                break;
            case Measure:
                txf_desc = (JTextField) panel.getFilter().getMapFilterRow().get("description").getComponent();
                desc = txf_desc.getText();

                if (desc != null) {
                    if (desc.trim().length() <= 0) {
                        return Boolean.FALSE;
                    }
                }

                Measure measure = new Measure(desc);
                HQLOperation.getInstance().Insert(measure);

                MapDb.AddOrReplaceMeasure(measure);
                break;
        }

        UtilFrame.reloadPanel();
        panel.repaint();

        return Boolean.TRUE;
    }

    private Boolean gralList_WW(WWPanel panel, String panelName) {
        JTable table = panel.getTbl_gral();
        Table.clear(table);
        Map map;
        switch (panelName) {

            case Employee:
                //Clean list and reset
                MapDb.setEmployeeList(null);
                map = MapDb.getEmployeeList();

                for (Iterator it = map.values().iterator(); it.hasNext();) {
                    Object o = it.next();
                    Employee obj = (Employee) o;
                    DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
                    Vector v = new Vector();
                    v.add(false);
                    v.add(obj.getId());
                    v.add(obj.getFirstname());
                    v.add(obj.getLastname());
                    v.add(obj.getCellphone());
                    modelTable.insertRow(0, v);
                }

                //
                break;
            case User:
                //Clean list and reset
                MapDb.setUserList(null);
                map = MapDb.getUserList();
                for (Iterator it = map.values().iterator(); it.hasNext();) {
                    Object o = it.next();
                    UserEmployee obj = (UserEmployee) o;
                    DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
                    Vector v = new Vector();
                    v.add(false);
                    v.add(obj.getId());
                    v.add(obj.getUsername());
                    v.add(obj.getEmployee_id().getIdentifier());
                    modelTable.insertRow(0, v);
                }
                break;
            case Category:
                //Clean list and reset
                MapDb.setCategoryList(null);
                map = MapDb.getCategoryList();
                this.fillSimpleEntityTable(map, table);
                break;
            case Price:
                //Clean list and reset
                MapDb.setPriceList(null);
                map = MapDb.getPriceList();
                this.fillSimpleEntityTable(map, table);
                break;
            case Store:
                //Clean list and reset
                MapDb.setStoreList(null);
                map = MapDb.getStoreList();
                this.fillSimpleEntityTable(map, table);
                break;
            case Measure:
                //Clean list and reset
                MapDb.setMeasureList(null);
                map = MapDb.getMeasureList();
                this.fillSimpleEntityTable(map, table);
                break;
        }

        table.setAutoCreateColumnsFromModel(false);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Vector data = model.getDataVector();
        Collections.sort(data, new ColumnSorter(1));
        model.fireTableStructureChanged();

        panel.repaint();

        return Boolean.TRUE;

    }

    public Boolean gralDelete_WW(WWPanel panel, String panelName) {
        HQLOperation op = HQLOperation.getInstance();
        JTable table = panel.getTbl_gral();
        int indexDesc;
        String desc;
        int indexCheck = table.getColumnModel().getColumnIndex("");

        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, indexCheck).equals(true)) {
                switch (panelName) {
                    case Employee:
                        int indexFirstname = table.getColumnModel().getColumnIndex("Nombre");
                        int indexLastname = table.getColumnModel().getColumnIndex("Apellido");
                        String fn = table.getValueAt(i, indexFirstname).toString();
                        String ln = table.getValueAt(i, indexLastname).toString();
                        String identifier = new StringBuilder().append(fn).append(" ").append(ln).toString();
                        op.Delete(MapDb.getEmployeeList().get(identifier));
                        break;
                    case User:
                        int indexUsername = table.getColumnModel().getColumnIndex("Usuario");
                        String usr = table.getValueAt(i, indexUsername).toString();
                        op.Delete(MapDb.getUserList().get(usr));
                        break;
                    case Category:
                        indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                        desc = table.getValueAt(i, indexDesc).toString();
                        op.Delete(MapDb.getCategoryList().get(desc));
                        break;
                    case Price:
                        indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                        desc = table.getValueAt(i, indexDesc).toString();
                        op.Delete(MapDb.getPriceList().get(desc));
                        break;
                    case Store:
                        indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                        desc = table.getValueAt(i, indexDesc).toString();
                        op.Delete(MapDb.getStoreList().get(desc));
                        break;
                    case Measure:
                        indexDesc = table.getColumnModel().getColumnIndex("Descripcion");
                        desc = table.getValueAt(i, indexDesc).toString();
                        op.Delete(MapDb.getMeasureList().get(desc));
                        break;

                }
            }
        }

        gralList_WW(panel, panelName);
        return Boolean.TRUE;

    }

}
