package nifax.control.data;

/**
 *
 * @author faka
 */
public interface IQueries {

    //Not table's name. It is the CLASS ENTITY's name and its variables

    final String userLogin = "from UserEmployee where username = :username ";
       
    final String CategoryFilteredByID = "from Category where id = :id";
    
    final String CategoryFilteredByDescription = "from Category where description = :description";
    
    final String ProductFilteredByID = "from Product where id = :id";
    
    final String ProductFilteredByDescription = "from Product where description = :description";
    
    final String Product = "from Product";
       
    final String Category = "from Category";
    
    final String Quantity = "from Quantity";
    
    final String Stores = "from Store";
    
    final String QuantityFilteredByID = "from Quantity where id = :id";
    
    final String QuantityFilteredByDescription = "from Quantity where description = :description";
    
    final String StoreFilteredByID = "from Store where id = :id";
    
    final String StoreFilteredByDescription = "from Store where description = :description";
    
}
