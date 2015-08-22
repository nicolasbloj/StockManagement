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
import nifax.control.model.Offer;
import nifax.control.model.ProdRelEntity;
import nifax.control.model.ProductMeasure;
import nifax.control.model.Restoration;
import nifax.control.model.Stock;

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

    public Boolean AddOrUpdate(String id, String code, String productDesc, double cost, Category category, Iva iva, Boolean active,
        List<ProductMeasure> measures, List<Offer> offers, List<Stock> stocks, List<Restoration> restorations) {
        try {
            boolean update = false;
            Product product;
            if (id != null) {
                if (id.trim().length() > 0) {
                    product = new Product(Long.parseLong(id), code, productDesc, cost, category, iva, active);
                    update = true;
                } else {
                    product = new Product(productDesc, cost, category, iva, active);
                }
            } else {
                product = new Product(productDesc, cost, category, iva, active);
            }

            //measures
            Set<ProductMeasure> productMeasures = (Set<ProductMeasure>) this.generateSet(measures, product);
            product.setProductMeasures(productMeasures);

            //offers
            Set<Offer> productOffers = (Set<Offer>) this.generateSet(offers, product);
            product.setOffers(productOffers);

            //stocks
            Set<Stock> productStocks = (Set<Stock>) this.generateSet(stocks, product);
            product.setStocks(productStocks);

            //restorations
            Set<Restoration> productRestorations = (Set<Restoration>) this.generateSet(restorations, product);
            product.setRestorations(productRestorations);

            if (update) {
                return Update(product);
            }

            return Insert(product);

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }

    public Product Find(Product product) {
        return (Product) SelectUnique(ProductFilteredByCode, product);
    }

    public Map List() {
        Map<String, Product> map = new HashMap<>();
        List<Product> lsp = Select(Product);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

    private Set generateSet(List list, Product product) {
        List<ProdRelEntity> list1 = list;
        Set<ProdRelEntity> listProdRelEntity = new HashSet<>();
        if (list1 != null) {
            list1.stream().map((obj) -> {
                obj.setProduct(product);
                return obj;
            }).forEach((obj) -> {
                listProdRelEntity.add(obj);
            });
        }
        return listProdRelEntity;

    }

}
