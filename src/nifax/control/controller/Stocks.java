package nifax.control.controller;

import java.util.List;
import nifax.control.model.Product;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.Quantity;
import nifax.control.model.modeler.ModelOperation;
import nifax.control.model.modeler.operation.IQueries;
import nifax.control.model.modeler.operation.IStockOperation;

/**
 *
 * @author NB
 */
public class Stocks extends ModelOperation
        implements IStockOperation, IQueries {

    private static Stocks instance = null;

    protected Stocks() {
    }

    public static Stocks getInstance() {
        if (instance == null) {
            instance = new Stocks();
        }
        return instance;
    }

    @Override
    public Store getStore(long storeId) {
        List obj = super.Select(StoreFilteredByID)
                .setParameter("id", storeId)
                .list();
        if (!obj.isEmpty()) {
            return (Store) obj.get(0);
        } else {
            return null;
        }

    }

    @Override
    public Stock buildStock(String description, double quantity,
            long quantityId, long productId, long storeId) {
        
        Store store = getStore(storeId);
        if (store != null) {
            Products products = Products.getInstance();
            Product product = products.getProduct(productId);
            if (product != null) {
                Quantity typeQuantity = getTypeQuantity(quantityId);
                if(typeQuantity!=null)
                {
                   return new Stock (description, quantity, 
                   typeQuantity,product,store);
                
                }else return null;
            
            } else {
                return null;
            }
        } else {
            return null;
        }

    }
    
    @Override
    public Quantity getTypeQuantity(long quantitId) {
        List obj = super.Select(QuantityFilteredByID)
                .setParameter("id", quantitId)
                .list();
        if (!obj.isEmpty()) {
            return (Quantity) obj.get(0);
        } else {
            return null;
        }
        
    }
}
