package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import nifax.control.model.Price;

/**
 *
 * @author NB
 */
public class PriceOperation extends HQLOperation implements IQueries {

    private static PriceOperation instance = null;

    protected PriceOperation() {
    }

    public static PriceOperation getInstance() {
        if (instance == null) {
            instance = new PriceOperation();
        }
        return instance;
    }

    public Price Find(Price price) {
        return (Price) SelectUnique(PriceFilteredById, price);
    }
    
    public Map List(){
        Map<String, Price> map = new HashMap<>();
        List<Price> lsp = Select(Price);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }
}
