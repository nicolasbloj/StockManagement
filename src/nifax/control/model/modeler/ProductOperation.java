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

            //dubplicate code : 
            //measures
            Set<ProductMeasure> productMeasures = new HashSet<>();
            if (measures != null) {
                measures.stream().map((ProductMeasure productMeasure) -> {
                    productMeasure.setProduct(product);
                    return productMeasure;
                }).forEach((productMeasure) -> {
                    productMeasures.add(productMeasure);
                });
            }
            product.setProductMeasures(productMeasures);

            //offers
            Set<Offer> productOffers = new HashSet<>();

            if (offers != null) {
                offers.stream().map((offer) -> {
                    offer.setProduct(product);
                    return offer;
                }).forEach((offer) -> {
                    productOffers.add(offer);
                });
            }
            product.setOffers(productOffers);

            //stocks
            Set<Stock> productStocks = new HashSet<>();
            if (stocks != null) {
                stocks.stream().map((stock) -> {
                    stock.setProduct(product);
                    return stock;
                }).forEach((stock) -> {
                    productStocks.add(stock);
                });
            }
            product.setStocks(productStocks);

            //restorations
            Set<Restoration> productRestorations = new HashSet<>();
            if (restorations != null) {
                restorations.stream().map((restoration) -> {
                    restoration.setProduct(product);
                    return restoration;
                }).forEach((restoration) -> {
                    productRestorations.add(restoration);
                });
            }
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

}
