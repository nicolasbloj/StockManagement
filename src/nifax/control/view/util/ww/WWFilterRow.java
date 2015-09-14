package nifax.control.view.util.ww;

import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author nb
 */
public class WWFilterRow {

    private final JLabel label;
    private final JComponent component; //for example JTextField,JPasswordField.
    
    public WWFilterRow(final JLabel label,final JComponent component) {
        this.label = label;
        this.component = component;
        
    }

    public JLabel getLabel() {
        return label;
    }

    public JComponent getComponent() {
        return component;
    }

    

}
