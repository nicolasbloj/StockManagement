package nifax.control.data;

import java.util.Map;
import nifax.control.model.Category;
import nifax.control.model.Iva;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.Store;
import nifax.control.model.modeler.CategoryOperation;
import nifax.control.model.modeler.IvaOperation;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.StoreOperation;

/**
 *
 * @author NB
 */
public final class MapDb {

    //Data base's Fixed Lists 
    private static Map<String, Price> priceList = null;
    private static Map<String, Store> storeList = null;
    private static Map<String, Measure> measureList = null;
    private static Map<String, Category> categoryList = null;
    private static Map<Double, Iva> ivaList = null;

    public static Map<String, Price> getPriceList() {
        if (MapDb.priceList == null) {
            MapDb.priceList = PriceOperation.getInstance().List();

        }
        return MapDb.priceList;
    }

    public static Map<String, Store> getStoreList() {
        if (MapDb.storeList == null) {
            MapDb.storeList = StoreOperation.getInstance().List();

        }
        return MapDb.storeList;
    }

    public static Map<String, Measure> getMeasureList() {
        if (MapDb.measureList == null) {
            MapDb.measureList = MeasureOperation.getInstance().List();

        }
        return MapDb.measureList;
    }

    public static Map<String, Category> getCategoryList() {
        if (MapDb.categoryList == null) {
            MapDb.categoryList = CategoryOperation.getInstance().List();

        }
        return MapDb.categoryList;
    }

    public static Map<Double, Iva> getIvaList() {
        if (MapDb.ivaList == null) {
            MapDb.ivaList = IvaOperation.getInstance().List();

        }
        return MapDb.ivaList;
    }

    public static void setPriceList(Map<String, Price> priceList) {
        MapDb.priceList = priceList;
    }

    public static void setStoreList(Map<String, Store> storeList) {
        MapDb.storeList = storeList;
    }

    public static void setMeasureList(Map<String, Measure> measureList) {
        MapDb.measureList = measureList;
    }

    public static void setCategoryList(Map<String, Category> categoryList) {
        MapDb.categoryList = categoryList;
    }

    public static void setIvaList(Map<Double, Iva> ivaList) {
        MapDb.ivaList = ivaList;
    }
    
    public static void addCategory(Category category) {
        if (MapDb.categoryList != null) {
            MapDb.categoryList.put(category.getDescription(), category);
        }
    }

    public static void addPrice(Price price) {
        if (MapDb.priceList != null) {
            MapDb.priceList.put(price.getDescription(), price);
        }
    }

    public static void addMeasure(Measure measure) {
        if (MapDb.measureList != null) {
            MapDb.measureList.put(measure.getDescription(), measure);
        }
    }

    public static void addStore(Store store) {
        if (MapDb.storeList != null) {
            MapDb.storeList.put(store.getDescription(), store);
        }

    }
}
