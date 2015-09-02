package nifax.control.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.model.SimpleEntity;

public class Listing {

    public static Map ListToMapKeyString(List list) {
        List<SimpleEntity> lsp = list;
        Map<String, SimpleEntity> map = new HashMap();

        lsp.stream().forEach((obj) -> {
            map.put(obj.getDescription(), obj);
        });

        return map;
    }
}
