package nifax.control.data;

import java.util.Map;
import nifax.control.model.Category;
import nifax.control.model.Employee;
import nifax.control.model.Iva;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.Store;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.CategoryOperation;
import nifax.control.model.modeler.EmployeeOperation;
import nifax.control.model.modeler.IvaOperation;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.PriceOperation;
import nifax.control.model.modeler.StoreOperation;
import nifax.control.model.modeler.UserOperation;

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
    private static Map<String, Employee> employeeList = null;
    private static Map<String, UserEmployee> userList = null;

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

    public static Map<String, Employee> getEmployeeList() {
        if (MapDb.employeeList == null) {
            MapDb.employeeList = EmployeeOperation.getInstance().List();

        }
        return MapDb.employeeList;
    }

    public static Map<String, UserEmployee> getUserList() {
        if (MapDb.userList == null) {
            MapDb.userList = UserOperation.getInstance().List();

        }
        return MapDb.userList;
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

    public static void setEmployeeList(Map<String, Employee> employeeList) {
        MapDb.employeeList = employeeList;
    }

    public static void setUserList(Map<String, UserEmployee> userList) {
        MapDb.userList = userList;
    }

    public static void AddOrReplaceCategory(Category category) {
        if (MapDb.categoryList != null) {
            MapDb.categoryList.replace(category.getDescription(), category);
        }
    }

    public static void AddOrReplacePrice(Price price) {
        if (MapDb.priceList != null) {
            MapDb.priceList.replace(price.getDescription(), price);
        }
    }

    public static void AddOrReplaceMeasure(Measure measure) {
        if (MapDb.measureList != null) {
            MapDb.measureList.replace(measure.getDescription(), measure);
        }
    }

    public static void AddOrReplaceStore(Store store) {
        if (MapDb.storeList != null) {
            MapDb.storeList.replace(store.getDescription(), store);
        }

    }

    public static void AddOrReplaceEmployee(Employee employee) {
        if (MapDb.employeeList != null) {
            MapDb.employeeList.replace(employee.getIdentifier(), employee);
        }
    }

    public static void AddOrReplaceUser(UserEmployee user) {
        if (MapDb.userList != null) {
            MapDb.userList.replace(user.getUsername(), user);
        }

    }

}
