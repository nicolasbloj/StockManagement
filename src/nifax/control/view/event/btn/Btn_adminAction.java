package nifax.control.view.event.btn;

import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import nifax.control.controller.Administration;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Btn_adminAction extends Btn_action {

    public Btn_adminAction(JPanel panel, int action, String btnTitle) {
        super(panel, action, btnTitle, Administration.getInstance());
        DescAndKey(action);
    }

    private void DescAndKey(int action) {
        String text = null;
        switch (action) {
            case Administration.SAVE:
                text = Message.ShorDescriptionSave;
                putValue(MNEMONIC_KEY, KeyEvent.VK_G);
                break;
            case Administration.SEARCH:
                text = Message.ShorDescriptionSearch;
                putValue(MNEMONIC_KEY, KeyEvent.VK_B);
                break;
            case Administration.DELETE:
                text = Message.ShorDescriptionDelete;
                putValue(MNEMONIC_KEY, KeyEvent.VK_E);
                break;
            case Administration.LIST:
                text = Message.ShorDescriptionListProduct;
                putValue(MNEMONIC_KEY, KeyEvent.VK_L);
                break;
        }
        putValue(SHORT_DESCRIPTION, text);

    }
}
