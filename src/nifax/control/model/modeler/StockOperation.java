package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public Boolean Add(String description, double quantity, double quantityCommitted,
        Measure measure,Store store) {
        try {
            return Insert(new Stock(
                description,
                quantity,
                quantityCommitted,
                measure,
                store
            )
            );
        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }

    public Map ListByParameter(String parameter, Object value) {
        Map<Long, Stock> map = new HashMap<>();
        List<Stock> lsp = Select(StockFilteredByQuantity, parameter, value);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getId(), ls);
        });
        return map;
    }

    public List getListByParameter(String parameter, Object value) {
        return SelectCacheable(StockFilteredByQuantity, parameter, value);
    }

}
