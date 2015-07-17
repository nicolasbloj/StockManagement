package nifax.control.model.modeler;

import nifax.control.model.Product;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.Measure;
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
    Measure measure, Product product, Store store) {        
        try {
            return Insert(new Stock (
                    description, 
                    quantityValue, 
                    measure, 
                    product, 
                    store
                    )
                );
        } catch(NullPointerException ex) {
            return Boolean.FALSE;
        }
    }
    
    public Measure Find(Measure measure) {
        return (Measure) SelectUnique(MeasureFilteredByID, measure);        
    }
}
