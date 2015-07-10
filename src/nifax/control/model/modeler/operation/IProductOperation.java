
package nifax.control.model.modeler.operation;

import java.util.Set;
import nifax.control.model.CategoryProduct;
import nifax.control.model.Product;
import nifax.control.model.ProductQuantity;

/**
 *
 * @author NB
 */

public interface IProductOperation {
    
    
   public CategoryProduct getCategoryProduct(long categoryId);
   
   public Product buildProduct(String product, double cost, long categoryId);

}
