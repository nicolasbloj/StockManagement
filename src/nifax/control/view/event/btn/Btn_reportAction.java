package nifax.control.view.event.btn;

import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import nifax.control.controller.Reporting;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Btn_reportAction extends Btn_action {

    public Btn_reportAction(JPanel panel, int action, String btnTitle) {
        super(panel, action, btnTitle, Reporting.getInstance());
        DescAndKey(action);
    }

    private void DescAndKey(int action) {
        String text = null;
        switch (action) {
            case Reporting.GENERATE:
                text = Message.ShorDescriptionGenerate;
                putValue(MNEMONIC_KEY, KeyEvent.VK_G);
                break;
        }
        putValue(SHORT_DESCRIPTION, text);

    }
}
