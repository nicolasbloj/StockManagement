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
    
    final String PriceFilteredById = "from Price where id = :id";
    
    final String Product = "from Product";
    
    final String Iva = "from Iva";
       
    final String Category = "from Category";
    
    final String Measure = "from Measure";
    
    final String Store = "from Store";

    final String Offer = "from Offer";
    
    final String Price = "from Price";
    
    final String Restoration = "from Restoration";
        
    final String TypeSaleDoc = "from TypeSaleDoc";
    
    final String MeasureFilteredByID = "from Measure where id = :id";
    
    final String MeasureFilteredByDescription = "from Measure where description = :description";
    
    final String StoreFilteredByID = "from Store where id = :id";
    
    final String StoreFilteredByDescription = "from Store where description = :description";
    
    final String OfferFilteredByID = "from Offer where id = :id";
    
    final String RestorationFilteredByID = "from Restoration where id = :id";
    
}
