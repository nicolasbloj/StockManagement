package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import nifax.control.model.UserEmployee;

/**
 *
 * @author NB
 */
public class UserOperation extends HQLOperation implements IQueries {

    private static UserOperation instance = null;

    protected UserOperation() {
    }

    public static UserOperation getInstance() {
        if (instance == null) {
            instance = new UserOperation();
        }
        return instance;
    }

    public UserEmployee Find(UserEmployee user) {
        return (UserEmployee) SelectUnique(UserFilteredByID, user);
    }

    public Map List() {
        Map<String, UserEmployee> map = new HashMap<>();
        List<UserEmployee> lsp = Select(User);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getUsername(), ls);
        });
        return map;
    }

}
