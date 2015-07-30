package nifax.control.model.modeler;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nifax.control.data.IQueries;
import nifax.control.model.SaleDoc;
import nifax.control.model.SaleDocProduct;
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

    public Boolean add(Date date, UserEmployee user,TypeSaleDoc typeSaleDoc,List<SaleDocProduct> products) {
        try {
            SaleDoc saleDoc = new SaleDoc(date, user, typeSaleDoc);
            Set<SaleDocProduct> saleDocProducts= new HashSet<>();

            products.stream().map((SaleDocProduct saleDocProduct) -> {
                saleDocProduct.setSaleDoc(saleDoc);
                return saleDocProduct;
            }).forEach((saleDocProduct) -> {
                saleDocProducts.add(saleDocProduct);
            });

            saleDoc.setSaleDocProducts(saleDocProducts);

            return Insert(saleDoc);

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }
    }

 

}

