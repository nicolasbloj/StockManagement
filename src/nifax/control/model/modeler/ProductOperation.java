package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nifax.control.model.Category;
import nifax.control.model.Product;
import nifax.control.data.IQueries;
import nifax.control.model.Iva;
import nifax.control.model.ProductMeasure;

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

    public Boolean Add(String productDesc, double cost, Category category,Iva iva,
            List<ProductMeasure> measures) {
        try {
            Product product = new Product(productDesc, cost, category,iva);
            Set<ProductMeasure> productMeasures = new HashSet<>();
            
            measures.stream().map((ProductMeasure productMeasure) -> {
                productMeasure.setProduct(product);
                return productMeasure;
            }).forEach((productMeasure) -> {
                productMeasures.add(productMeasure);
            });

            product.setProductMeasures(productMeasures);

            return Insert(product);

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
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
