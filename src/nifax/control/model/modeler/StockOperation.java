package nifax.control.model.modeler;

import nifax.control.model.Product;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.Quantity;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.data.IQueries;

/**
 *
 * @author NB
 */

public class StockOperation extends HQLOperation
    implements IQueries {

    private static StockOperation instance = null;

    protected StockOperation() {
    }

    public static StockOperation getInstance() {
        if (instance == null) {
            instance = new StockOperation();
        }
        return instance;
    }

    public Store Find(Store store) {
        return (Store) SelectUnique(StoreFilteredByID, store);
    }

    public Boolean Add(String description, double quantityValue, 
    Quantity quantity, Product product, Store store) {        
        try {
            return Insert(
                new Stock (
                    description, 
                    quantityValue, 
                    quantity, 
                    product, 
                    store
                    )
                );
        } catch(NullPointerException ex) {
            return Boolean.FALSE;
        }
    }
    
    public Quantity Find(Quantity quantity) {
        return (Quantity) SelectUnique(QuantityFilteredByID, quantity);        
    }
}
