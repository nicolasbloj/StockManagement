package nifax.control.controller;

import java.util.List;
import nifax.control.model.Category;
import nifax.control.model.Product;
import nifax.control.model.modeler.ModelOperation;
import nifax.control.model.modeler.operation.IProductOperation;
import nifax.control.model.modeler.operation.IQueries;

/**
 *
 * @author NB
 */
public class Products extends ModelOperation
        implements IProductOperation, IQueries {

    private static Products instance = null;

    protected Products() {
    }

    public static Products getInstance() {
        if (instance == null) {
            instance = new Products();
        }
        return instance;
    }

    @Override
    public Category getCategory(long categoryId) {
        List obj = super.Select(CategoryFilteredByID)
                .setParameter("id", categoryId)
                .list();
        if (!obj.isEmpty()) {
            return (Category) obj.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Product buildProduct(String product, double cost, long categoryId) {
        Category category = getCategory(categoryId);
        if (category != null) {
            return new Product(product, cost, category);
        } else {
            return null;
        }
    }
    @Override
    public Product getProduct(long productId) {
        List obj = super.Select(ProductFilteredByID)
                .setParameter("id", productId)
                .list();
        if (!obj.isEmpty()) {
            return (Product) obj.get(0);
        } else {
            return null;
        }
    }

}
