package nifax.control.model.modeler.operation;

/**
 *
 * @author faka
 */
public interface IQueries {
    //Not table's name. It is the CLASS ENTITY's name and its variables
    final  String getUser = "from UserEmployee where username = :username ";    
    final  String getCategoryProduct = "from CategoryProduct "
            + "where id = :id";   
    final  String getTypeQuantity = "from TypeQuantity where id = "
            + ":id";   
   
    
}
