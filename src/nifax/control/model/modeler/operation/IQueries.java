package nifax.control.model.modeler.operation;

/**
 *
 * @author faka
 */
public interface IQueries {
    //Not table's name. It is the CLASS ENTITY's name and its variables
    final  String userLogin = "from UserEmployee where username = :username ";    
    final  String CategoryProductFilteredByID = "from CategoryProduct "
            + "where id = :id";   
    final  String TypeQuantityFilteredByID = "from TypeQuantity where id = "
            + ":id";   
   
    
}
