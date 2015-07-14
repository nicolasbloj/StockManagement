package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Category;
import nifax.control.model.Product;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.data.IQueries;

/**
 *
 * @author NB
 */

public class ProductOperation extends HQLOperation implements IQueries {

    private static ProductOperation instance = null;

    protected ProductOperation() {
    }

    public static ProductOperation getInstance() {
        if (instance == null) {
            instance = new ProductOperation();
        }
        return instance;
    }

    public Product Add(String product, double cost, Category cat) {
        return new Product(product, cost, cat);
    }
    
    public Product Find(Product product) {
        return (Product) SelectUnique(ProductFilteredByID, product);
    }
    
    public Map List(){
        Map<String, Product> map = new HashMap<>();
        List<Product> lsp = Select(Product);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

}
