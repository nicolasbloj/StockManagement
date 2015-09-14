package nifax.control.view.util.ww;

/**
 *
 * @author nb
 */
public class WWTableColumn {

    //Column's propierties
    private final String identifier; 
    private final Class type;
    private final Boolean edit;

    public WWTableColumn(final String identifier,final Class type,final Boolean edit) {
        this.identifier = identifier;
        this.type = type;
        this.edit = edit;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Class getType() {
        return type;
    }

    public Boolean getEdit() {
        return edit;
    }

}
