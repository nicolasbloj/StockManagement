package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.PlusLess;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Btn_PlusLess extends AbstractAction {

    private final int action;
    private final JPanel panel;

    public Btn_PlusLess(JPanel panel, int action, String btnTitle) {
        super(btnTitle);
        this.panel = panel;
        this.action = action;
        DescAndKey(action);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JButton btn = (JButton) e.getSource();
            String componentName = btn.getName();
            if (componentName != null) {
                if (!PlusLess.getInstance().operate(panel, componentName, action)) {
                    JOptionPane.showMessageDialog(null, Message.FailuredOperation,
                        Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (ClassCastException ex) {
            JOptionPane.showMessageDialog(null, Message.FailuredOperation,
                Message.ClassCastExceptionTitle, JOptionPane.ERROR_MESSAGE);
        }

    }

    private void DescAndKey(int action) {
        String text = null;
        switch (action) {
            case PlusLess.PLUS:
                text = Message.ShorDescriptionPlus;
                putValue(MNEMONIC_KEY, KeyEvent.VK_PLUS);
                break;
            case PlusLess.LESS:
                text = Message.ShorDescriptionLess;
                putValue(MNEMONIC_KEY, KeyEvent.VK_LESS);
                break;

        }
        putValue(SHORT_DESCRIPTION, text);
    }
}
