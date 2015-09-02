package nifax.control.view.event.txf;

import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import nifax.control.controller.Searching;
import nifax.control.util.Message;

/**
 *
 * @author NB
 */
public class Txf_searchProduct extends Txf_Listener {

    private final JInternalFrame internalFrame;
    private final int searchBy;
    private final int search;
    
    public Txf_searchProduct(JInternalFrame internalFrame, int searchBy,int search) {
        this.internalFrame = internalFrame;
        this.searchBy = searchBy;
        this.search=search;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!new Searching().search(internalFrame, searchBy,search)) {
                JOptionPane.showMessageDialog(null, Message.FailuredOperation,
                    Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
