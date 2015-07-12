
package nifax.control.model.modeler.operation;

import nifax.control.model.Category;
import nifax.control.model.Product;

/**
 *
 * @author NB
 */

public interface IProductOperation {
    
    
   public Category getCategory(long categoryId);
   
   public Product buildProduct(String product, double cost, long categoryId);

   public Product getProduct(long productId);
   
}
