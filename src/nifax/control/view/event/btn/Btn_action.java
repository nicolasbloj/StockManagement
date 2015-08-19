package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.ActionController;
import nifax.control.util.Message;
import nifax.control.view.util.Tbp;

/**
 *
 * @author NB
 */
public class Btn_action extends AbstractAction {

    private final int action;
    private final JPanel panel;
    
    private final ActionController actionController;

    public Btn_action(JPanel panel,int action,String btnTitle, ActionController actionController) {
        super(btnTitle);
        this.panel = panel;
        this.action = action;
        this.actionController = actionController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
            if (!actionController.operate(panel, panelName, action)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
