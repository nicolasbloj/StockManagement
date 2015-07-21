
package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import static nifax.control.data.IQueries.OfferFilteredByID;
import nifax.control.model.TypeSaleDoc;

/**
 *
 * @author NB
 */
public class TypeSaleDocOperation extends HQLOperation implements IQueries {

    private static TypeSaleDocOperation instance = null;

    protected TypeSaleDocOperation() {
    }

    public static TypeSaleDocOperation getInstance() {
        if (instance == null) {
            instance = new TypeSaleDocOperation();
        }
        return instance;
    }

    public Boolean add(String desc) {
        try {
            
            return Insert(new TypeSaleDoc(desc));

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }
    
      public TypeSaleDoc Find(TypeSaleDoc typeSaleDoc) {
        return (TypeSaleDoc) SelectUnique(OfferFilteredByID, typeSaleDoc);
    }

    public Map List() {
        Map<String, TypeSaleDoc> map = new HashMap<>();
        List<TypeSaleDoc> lsp = Select(TypeSaleDoc);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }
    
}

