package nifax.control.controller;

import java.util.Map;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nifax.control.data.MapDb;
import nifax.control.model.Offer;
import nifax.control.model.Product;
import nifax.control.model.Stock;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.util.Listing;
import nifax.control.util.Table;
import nifax.control.view.internalframe.IntFrameProductSearch;
import org.hibernate.criterion.MatchMode;

/**
 *
 * @author NB
 */
public class Searching {

    public Searching() {
    }

    private static Map<String, Product> productList = null;

    //Search
    public static final int SEARCH_PRODUCT = 0;

    //SearchBy : 
    public static final int CODE = 0;
    public static final int DESCRIPTION = 1;
    public static final int CATEGORY = 2;

    //show in tables
    public static final int SHOW_OFFER = 0;
    public static final int SHOW_STOCK = 1;

    public boolean search(JInternalFrame internalFrame, int searchBy, int search) {

        switch (search) {
            case SEARCH_PRODUCT:
                return search((IntFrameProductSearch) internalFrame, searchBy);
        }
        return Boolean.FALSE;

    }

    private boolean search(IntFrameProductSearch internalFrame, int searchBy) {
        switch (searchBy) {
            case CODE:
                productList = this.select("code", internalFrame.getTxf_codeProduct().getText().toUpperCase());
                break;
            case DESCRIPTION:
                productList = this.selectLikes("description", internalFrame.getTxf_descProduct().getText().toUpperCase());
                break;
            case CATEGORY:
                productList = this.select("category", MapDb.getCategoryList().get(internalFrame.getTxf_catProduct().getText().toUpperCase()));
                break;
        }
        if (productList != null) {
            Table.clear(internalFrame.getTbl_products());
            if (!productList.isEmpty()) {
                return fillTable(internalFrame.getTbl_products());
            }
        }
        return Boolean.FALSE;
    }

    //separate the text  for  word between simbols '+' for concatenate en selectLike
    private Map<String, Product> selectLikes(String parameter, String value) {
        String[] values;//By concatenate Like. 
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '+') {
                count++;
            }
        }
        values = new String[count + 1];
        count = 0;
        String aux = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '+') {
                values[count] = aux;
                aux = "";
                count++;
            } else {
                aux = aux + value.charAt(i);
            }

        }
        values[count] = aux;

        return Listing.ListToMapKeyString(
            HQLOperation.getInstance().SelectLike(
                Product.class,
                parameter,
                values,
                MatchMode.ANYWHERE));
    }

    private Map<String, Product> select(String parameter, Object value) {
        return ProductOperation.getInstance().ListByParameter(parameter, value);
    }

    private boolean fillTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //Clean table.
        productList.keySet().stream().map((key) -> productList.get(key)).map((product) -> {
            Vector v = new Vector();
            v.add(product.getCode());
            v.add(product.getDescription());
            v.add(product.getCategory().getDescription());
            v.add(product.getCost());
            v.add(product.getIva().getIva());
            return v;
        }).forEach((v) -> {
            model.insertRow(model.getRowCount(), v);
        });
        return Boolean.TRUE;
    }

    public static void showInTable(IntFrameProductSearch internalFrame, int ATtable) {

        JTable table = null;

        switch (ATtable) {
            case SHOW_OFFER:
                table = internalFrame.getTbl_offer();
                break;
            case SHOW_STOCK:
                table = internalFrame.getTbl_availability();
        }

        if (productList != null) {
            if (table != null) {
                Table.clear(table);
                if (!productList.isEmpty()) {
                    int row = internalFrame.getTbl_products().getSelectedRow();
                    int col = internalFrame.getTbl_products().getColumnModel().getColumnIndex("Descripcion");
                    Product product = productList.get(internalFrame.getTbl_products().getValueAt(row, col).toString());
                    DefaultTableModel model = (DefaultTableModel) table.getModel();

                    if (product != null) {

                        int count;
                        Vector v;

                        switch (ATtable) {
                            case SHOW_OFFER:
                                count = 0;
                                for (Offer offer : product.getOffers()) {
                                    v = new Vector();
                                    v.add(offer.getQuantity());
                                    v.add(offer.getDiscount());
                                    model.insertRow(count, v);
                                    count++;
                                }

                                break;
                            case SHOW_STOCK:
                                count = 0;
                                for (Stock stock : product.getStocks()) {
                                    v = new Vector();
                                    v.add(stock.getQuantity());
                                    v.add(stock.getQuantity() - stock.getQuantityCommitted());
                                    v.add(stock.getQuantityCommitted());
                                    v.add(stock.getMeasure().getId());
                                    v.add(stock.getStore().getId());

                                    model.insertRow(count, v);
                                    count++;
                                }
                        }
                    }
                }
            }
        }
    }
}
