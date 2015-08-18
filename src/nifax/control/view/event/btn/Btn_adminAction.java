package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import nifax.control.controller.Administration;
import nifax.control.util.Message;
import nifax.control.view.util.Tbp;

/**
 *
 * @author NB
 */
public class Btn_adminAction extends AbstractAction {

    private final int action;
    JPanel panel;

    public Btn_adminAction(JPanel panel, int action, String btnTitle) {
        super(btnTitle);
        this.action = action;
        this.panel = panel;

        DescAndKey();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Administration administration = Administration.getInstance();

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
            if (!administration.operate(panel, panelName, action)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void DescAndKey() {
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
