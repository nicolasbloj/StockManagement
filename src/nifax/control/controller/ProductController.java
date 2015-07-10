package nifax.control.controller;

import java.util.List;
import nifax.control.model.CategoryProduct;
import nifax.control.model.Product;
import nifax.control.model.modeler.ModelOperation;
import nifax.control.model.modeler.operation.IProductOperation;
import nifax.control.model.modeler.operation.IQueries;

/**
 *
 * @author NB
 */
public class ProductController extends ModelOperation
        implements IProductOperation, IQueries {

    private static ProductController instance = null;

    protected ProductController() {
    }

    public static ProductController getInstance() {
        if (instance == null) {
            instance = new ProductController();
        }
        return instance;
    }

    @Override
    public CategoryProduct getCategoryProduct(long categoryId) {
        List obj = super.Select(getCategoryProduct)
                .setParameter("id", categoryId)
                .list();
        if (!obj.isEmpty()) {
            return (CategoryProduct) obj.get(0);
        } else {
            return null;
        }
    }
    @Override
    public Product buildProduct(String product, double cost, long categoryId) {
        CategoryProduct categoryProduct = getCategoryProduct(categoryId);
        if (categoryProduct != null) {
            return new Product(product, cost, categoryProduct);
        } else {
            return null;
        }
    }
}
