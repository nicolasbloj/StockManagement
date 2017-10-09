package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Store;
import nifax.control.data.IQueries;
import static nifax.control.data.IQueries.StoreFilteredByID;

/**
 *
 * @author faka
 */
public class StoreOperation extends HQLOperation implements IQueries {

    private static StoreOperation instance = null;

    protected StoreOperation() {
    }

    public static StoreOperation getInstance() {
        if (instance == null) {
            instance = new StoreOperation();
        }
        return instance;
    }

    public Store Find(Store store) {
        return (Store) SelectUnique(StoreFilteredByID, store);
    }
    
    public Map List(){
        Map<String, Store> map = new HashMap<>();
        List<Store> lsp = Select(Store);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

}
