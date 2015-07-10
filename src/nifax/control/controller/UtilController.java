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
public class UtilController extends ModelOperation
        implements IUtilOperation, IQueries {

    private static UtilController instance = null;
    
    protected UtilController(){
    }
    
    public static UtilController getInstance(){
    if(instance == null)
            instance = new UtilController();
        return instance;
    }

    @Override
    public TypeQuantity getTypeQuantity(long typeQuantitId) {
        List obj = super.Select(getTypeQuantity)
                .setParameter("id", typeQuantitId)
                .list();
        if (!obj.isEmpty()) {
            return (TypeQuantity) obj.get(0);
        } else {
            return null;
        }
        
    }   
}
