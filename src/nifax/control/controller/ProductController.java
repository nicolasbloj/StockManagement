package nifax.control.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.Product;
import nifax.control.model.ProductMeasure;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class ProductController {

    public static final int SAVE = 0;
    public static final int SEARCH = 1;

    private PanelProductsAdmin panelProductsAdmin;

    private static ProductController instance = null;

    protected ProductController() {
    }

    public static ProductController getInstance() {
        if (instance == null) {
            instance = new ProductController();
        }
        return instance;
    }

    public void setPanelProductsAdmin(PanelProductsAdmin panelProductsAdmin) {
        this.panelProductsAdmin = panelProductsAdmin;
    }

    public void Operation(String title, int Op) {
        switch (title) {
            case "Product":
                switch (Op) {
                    case SAVE:
                        saveProduct();
                        break;
                    case SEARCH:
                        searchProduct();
                        break;
                }
                break;
            case "Offer":
                break;
            case "Restoration":
                break;
            case "Stock":
                break;
        }

    }

    private void saveProduct() {

        String id = panelProductsAdmin.getLbl_idProduct().getText();
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        String category = panelProductsAdmin.getCbx_category().getSelectedItem().toString();
        String description = panelProductsAdmin.getTxf_descProduct().getText();
        double cost = Double.parseDouble(panelProductsAdmin.getTxf_cost().getText());
        double iva = Double.parseDouble(panelProductsAdmin.getCbx_iva().getSelectedItem().toString());

        int indexMeasure = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Medida");
        int indexEquivalent = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Equivalente");

        //Measures.
        List<ProductMeasure> measures = new ArrayList<ProductMeasure>();
        for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {
            measures.add(new ProductMeasure(
                Double.parseDouble(panelProductsAdmin.getTbl_rules().getValueAt(i, indexEquivalent).toString()),
                MapDb.measureList.get(panelProductsAdmin.getTbl_rules().getValueAt(i, indexMeasure).toString()))
            );
        }

        
        if (ProductOperation.getInstance().AddOrUpdate(id,code, description, cost, MapDb.categoryList.get(category), MapDb.ivaList.get(iva), measures));
        JOptionPane.showMessageDialog(null, "Producto cargado correctamente");

    }

    private void searchProduct() {
        //Search by code
        String code = panelProductsAdmin.getTxf_codeProduct().getText();
        Product product = ProductOperation.getInstance().Find(new Product(code, 1));

        panelProductsAdmin.getLbl_idProduct().setText(String.valueOf(product.getId()));
        panelProductsAdmin.getCbx_category().setSelectedItem(product.getCategory().getDescription());
        panelProductsAdmin.getTxf_descProduct().setText(product.getDescription());
        panelProductsAdmin.getTxf_cost().setText(Double.toString(product.getCost()));
        panelProductsAdmin.getTxf_codeProduct().setText(product.getCode());
        panelProductsAdmin.getCbx_iva().setSelectedItem(product.getIva().getIva());

        //Measures
        DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();
        tableModel.setRowCount(0);

        product.getMeasures().stream().map((productMeasure) -> {
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

    }

}
