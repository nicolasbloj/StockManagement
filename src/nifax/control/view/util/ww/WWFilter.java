package nifax.control.view.util.ww;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author nb
 */
public class WWFilter {

    private final String title; //panel's title --> TitledBorder
    private final Map<String, WWFilterRow> mapFilterRow;//Key -> to indentificar panel's components
    private final ArrayList<WWFilterRow> listFilterRow; //For filter panel, 

    public WWFilter(final String title,final Map<String, WWFilterRow> mapFilterRow,final ArrayList<WWFilterRow> listFilterRow) {
        this.title = title;
        this.mapFilterRow = mapFilterRow;
        this.listFilterRow = listFilterRow;
    }

    public String getTitle() {
        return title;
    }

    public Map<String, WWFilterRow> getMapFilterRow() {
        return mapFilterRow;
    }

    public ArrayList<WWFilterRow> getListFilterRow() {
        return listFilterRow;
    }

}
