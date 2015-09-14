package nifax.control.validate;

import java.awt.Toolkit;

/**
 *
 * @author NB
 */
public class MyIntegerFilter extends MyNumberFilter {

    @Override
    public boolean test(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            Toolkit.getDefaultToolkit().beep();
            return false;
        }
    }
}
