package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.Operation;
import nifax.control.util.Message;
import nifax.control.view.util.Tbp;

/**
 *
 * @author NB
 */
public class Btn_operationAction extends AbstractAction {

    private final int action;
    JPanel panel;

    public Btn_operationAction(JPanel panel, int action, String btnTitle) {
        super(btnTitle);
        this.panel = panel;
        this.action = action;
        DescAndKey();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Operation operation = Operation.getInstance();

        String panelName = null;

        for (int i = 0; i < panel.getComponentCount(); i++) {
            panelName = panel.getComponent(i).getName();

            if (panelName != null) {
                if (panelName.equals("Container")) {
                    Tbp tbp = (Tbp) panel.getComponent(i);
                    panelName = tbp.getSelectedComponent().getName();
                    break;
                }
            }
        }
        if (panelName != null) {
            if (!operation.operate(panel, panelName, action)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void DescAndKey() {
        String text = null;
        switch (action) {
            case Operation.EMIT:
                text = Message.ShorDescriptionEmit;
                putValue(MNEMONIC_KEY, java.awt.event.KeyEvent.VK_G);
                break;
        }
        putValue(SHORT_DESCRIPTION, text);

    }

}
