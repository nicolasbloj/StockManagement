package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Category;
import nifax.control.data.IQueries;
import static nifax.control.data.IQueries.CategoryFilteredByID;
import nifax.control.model.Iva;

/**
 *
 * @author 
 */
public class IvaOperation extends HQLOperation implements IQueries {

    private static IvaOperation instance = null;

    protected IvaOperation() {
    }

    public static IvaOperation getInstance() {
        if (instance == null) {
            instance = new IvaOperation();
        }
        return instance;
    }

    public Category Find(Category category) {
        return (Category) SelectUnique(CategoryFilteredByID, category);
    }

    public Map List(){
        Map<Double, Iva> map = new HashMap<>();
        List<Iva> lsp = Select(Iva);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getIva(), ls);
        });
        return map;
    }
}
