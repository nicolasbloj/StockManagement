package nifax.control.model.modeler.operation;

/**
 *
 * @author faka
 */
public interface IQueries {

    //Not table's name. It is the CLASS ENTITY's name and its variables

    final String userLogin = "from UserEmployee where username = :username ";
    
    
    final String CategoryFilteredByID = "from Category "
            + "where id = :id";
    final String ProductFilteredByID = "from Product "
            + "where id = :id";
    final String QuantityFilteredByID = "from Quantity where id = "
            + ":id";
    final String StoreFilteredByID = "from Store where id = "
            + ":id";

    
}
