package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.ActionController;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Btn_action extends AbstractAction {

    private final int action;
    private final JPanel panel;

    private final ActionController actionController;

    public Btn_action(final JPanel panel, final int action, final String btnTitle, final ActionController actionController) {
        super(btnTitle);
        this.panel = panel;
        this.action = action;
        this.actionController = actionController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String panelName = panel.getName();
        if (panelName != null) {
            if (!actionController.operate(panel, panelName, action)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
