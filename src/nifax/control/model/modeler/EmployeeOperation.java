package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import nifax.control.model.Employee;

/**
 *
 * @author NB
 */
public class EmployeeOperation extends HQLOperation implements IQueries {

    private static EmployeeOperation instance = null;

    protected EmployeeOperation() {
    }

    public static EmployeeOperation getInstance() {
        if (instance == null) {
            instance = new EmployeeOperation();
        }
        return instance;
    }

    public Employee Find(Employee employee) {
        return (Employee) SelectUnique(EmployeeFilteredByID, employee);
    }

    public Map List() {
        Map<String, Employee> map = new HashMap<>();
        List<Employee> lsp = Select(Employee);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getIdentifier(), ls);
        });
        return map;
    }

}
