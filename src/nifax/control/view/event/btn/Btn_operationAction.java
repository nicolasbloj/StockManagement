package nifax.control.view.event.btn;

import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JPanel;
import nifax.control.controller.Operation;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Btn_operationAction extends Btn_action {

    public Btn_operationAction(JPanel panel, int action, String btnTitle) {
        super(panel,action,btnTitle,Operation.getInstance());
        DescAndKey(action);
    }

    private void DescAndKey(int action) {
        String text = null;
        switch (action) {
            case Operation.EMIT:
                text = Message.ShorDescriptionEmit;
                putValue(MNEMONIC_KEY, java.awt.event.KeyEvent.VK_G);
                break;
            case Operation.DELETEROW:
                text = Message.ShorDescriptionEmit;
                putValue(MNEMONIC_KEY, java.awt.event.KeyEvent.VK_D);
                break;
        }
        putValue(SHORT_DESCRIPTION, text);

    }

}
