package nifax.control.model.modeler;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nifax.control.model.Product;
import nifax.control.model.Stock;
import nifax.control.model.Store;
import nifax.control.model.Measure;
import nifax.control.data.IQueries;
import nifax.control.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author NB
 */
public class StockOperation extends HQLOperation implements IQueries {

    private static final Logger logger = Logger.getLogger(StockOperation.class.getName());

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

    public Stock Find(long product_id, long store_id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            logger.info("Listando registros");
            List list = session.createQuery(StockFilteredByProductAndStore)
                    .setParameter("product_id", product_id)
                    .setParameter("store_id", store_id).list();

            if (!list.isEmpty()) {
                return (Stock) list.get(0);
            } else {
                return null;
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            return null;
        }
    }

    public Boolean Add(String description, double quantity,double quantityCommitted,
            Measure measure, Product product, Store store) {
        try {
            return Insert(new Stock(
                    description,
                    quantity,
                    quantityCommitted,
                    measure,
                    product,
                    store
            )
            );
        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }

    //method list - no use Map<String,Stock> because the stock's description is not unique
    
    
}
