package nifax.control.model.modeler;

import java.util.Date;
import java.util.Set;
import nifax.control.data.IQueries;
import nifax.control.model.Item;
import nifax.control.model.SaleDoc;
import nifax.control.model.TypeSaleDoc;
import nifax.control.model.UserEmployee;

/**
 *
 * @author NB
 */
public class SaleDocOperation extends HQLOperation implements IQueries {

    private static SaleDocOperation instance = null;

    protected SaleDocOperation() {
    }

    public static SaleDocOperation getInstance() {
        if (instance == null) {
            instance = new SaleDocOperation();
        }
        return instance;
    }

    public Boolean add(Date date, UserEmployee user, TypeSaleDoc typeSaleDoc, Set<Item> items) {
        try {
            return Insert(new SaleDoc(date, user, typeSaleDoc, items));
        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }
}
