package nifax.control.model.modeler.operation;

import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.Quantity;

/**
 *
 * @author NB
 */
public interface IStockOperation {
        
   
   public Store getStore(long storeId);
   
   public Stock buildStock(String description, double quantity, 
   long tipeQuantityId,long productId, long storeId);
           
   public Quantity getTypeQuantity(long typeQuantitId);
}