package nifax.control.controller;

import java.util.List;
import nifax.control.model.TypeQuantity;
import nifax.control.model.modeler.ModelOperation;
import nifax.control.model.modeler.operation.IUtilOperation;
import nifax.control.model.modeler.operation.IQueries;

/**
 *
 * @author NB
 */
public class Util extends ModelOperation
        implements IUtilOperation, IQueries {

    private static Util instance = null;
    
    protected Util(){
    }
    
    public static Util getInstance(){
    if(instance == null)
            instance = new Util();
        return instance;
    }

    @Override
    public TypeQuantity getTypeQuantity(long typeQuantitId) {
        List obj = super.Select(TypeQuantityFilteredByID)
                .setParameter("id", typeQuantitId)
                .list();
        if (!obj.isEmpty()) {
            return (TypeQuantity) obj.get(0);
        } else {
            return null;
        }
        
    }   
}
