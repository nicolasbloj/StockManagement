package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Quantity;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.data.IQueries;

/**
 *
 * @author faka
 */
public class QuantityOperation extends HQLOperation implements IQueries {

    private static QuantityOperation instance = null;

    protected QuantityOperation() {
    }

    public static QuantityOperation getInstance() {
        if (instance == null) {
            instance = new QuantityOperation();
        }
        return instance;
    }

    public Quantity Find(Quantity quantity) {
        return (Quantity) SelectUnique(QuantityFilteredByID, quantity);
    }
    
    public Map List(){
        Map<String, Quantity> map = new HashMap<>();
        List<Quantity> lsp = Select(Quantity);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

}
