package nifax.control.data;

/**
 *
 * @author faka
 */
public interface IQueries {

    //Not table's name. It is the CLASS ENTITY's name and its variables
    final String userLogin = "from UserEmployee where username = :username ";

    final String CategoryFilteredByID = "from Category where id = :id";
    
    final String EmployeeFilteredByID = "from Employee where id = :id";
    
    final String UserFilteredByID = "from UserEmployee where id = :id";

    final String StockFilteredByProductAndStore = "from Stock where product_id = :product_id AND store_id = :store_id";

    final String CategoryFilteredByDescription = "from Category where description = :description";

    final String TypeSaleDocFilteredByDescription = "from TypeSaleDoc where description = :description";

    final String ProductFilteredByCode = "from Product where code = :code";

    final String ProductFilteredByDescription = "from Product where description = :description";

    final String ProductFilteredByCategory = "from Product where category = :category";

    final String StockFilteredByQuantity = "from Stock where quantity <= :quantity";//Group By

    final String PriceFilteredById = "from Price where id = :id";

    final String Product = "from Product";

    final String Iva = "from Iva";

    final String Category = "from Category";

    final String Measure = "from Measure";

    final String Store = "from Store";

    final String Offer = "from Offer";

    final String UserSession = "from UserSession";

    final String UserSessionInvalid = "from UserSession where user_id=:user_id";

    final String Price = "from Price";
    
    final String Employee = "from Employee";
    
    final String User = "from UserEmployee";

    final String Restoration = "from Restoration";

    final String TypeSaleDoc = "from TypeSaleDoc";

    final String OfferFilteredByProduct = "from Offer where product_id = :product_id";

    final String MeasureFilteredByID = "from Measure where id = :id";

    final String MeasureFilteredByDescription = "from Measure where description = :description";

    final String StoreFilteredByID = "from Store where id = :id";

    final String StoreFilteredByDescription = "from Store where description = :description";

    final String OfferFilteredByID = "from Offer where id = :id";

    final String RestorationFilteredByID = "from Restoration where id = :id";

}
