package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.Measure;
import nifax.control.data.IQueries;

/**
 *
 * @author faka
 */
public class MeasureOperation extends HQLOperation implements IQueries {

    private static MeasureOperation instance = null;

    protected MeasureOperation() {
    }

    public static MeasureOperation getInstance() {
        if (instance == null) {
            instance = new MeasureOperation();
        }
        return instance;
    }

    public Measure Find(Measure measure) {
        return (Measure) SelectUnique(MeasureFilteredByID, measure);
    }
    
    public Map List(){
        Map<String, Measure> map = new HashMap<>();
        List<Measure> lsp = Select(Measure);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

}
