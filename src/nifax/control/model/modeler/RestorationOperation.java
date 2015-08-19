package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import nifax.control.model.Measure;
import nifax.control.model.Product;
import nifax.control.model.Restoration;
import nifax.control.model.Store;

/**
 *
 * @author NB
 */
public class RestorationOperation extends HQLOperation implements IQueries {

    private static RestorationOperation instance = null;

    protected RestorationOperation() {
    }

    public static RestorationOperation getInstance() {
        if (instance == null) {
            instance = new RestorationOperation();
        }
        return instance;
    }

    public Boolean add(String description, double peak, double midpoint,
            double lowpoint, Measure measure,
             Store store) {
        try {

            return Insert(new Restoration(description, peak, midpoint, lowpoint, measure,
                    store));

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }

    }

    public Restoration Find(Restoration restoration) {
        return (Restoration) SelectUnique(RestorationFilteredByID, restoration);
    }

    public Map List() {
        Map<String, Restoration> map = new HashMap<>();
        List<Restoration> lsp = Select(Restoration);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }
//method list - no use Map<String,Stock> because the stock's description is not unique
    
}
