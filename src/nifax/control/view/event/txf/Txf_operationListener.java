package nifax.control.view.event.txf;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.Operation;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Txf_operationListener extends Txf_Listener {

    private final JPanel panel;
    private final int action;

    public Txf_operationListener(JPanel panel, int action) {
        this.panel = panel;
        this.action = action;

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Operation.getInstance().operate(panel,"", action)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation,
                    Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
