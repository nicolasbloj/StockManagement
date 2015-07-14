package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Category;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.data.IQueries;
import static nifax.control.data.IQueries.CategoryFilteredByID;

/**
 *
 * @author faka
 */

public class CategoryOperation extends HQLOperation implements IQueries {

    private static CategoryOperation instance = null;

    protected CategoryOperation() {
    }

    public static CategoryOperation getInstance() {
        if (instance == null) {
            instance = new CategoryOperation();
        }
        return instance;
    }

    public Category Find(Category category) {
        return (Category) SelectUnique(CategoryFilteredByID, category);
    }

    public Map List(){
        Map<String, Category> map = new HashMap<>();
        List<Category> lsp = Select(Category);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }
}
