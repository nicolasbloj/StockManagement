package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;

/**
 *
 * @author faka
 */
public class Btn_CancelAction extends AbstractAction {
   
    public Btn_CancelAction() {
        super("Cancelar");
        putValue(SHORT_DESCRIPTION, "Presionando este boton cerrara el panel actual");
        putValue(MNEMONIC_KEY, KeyEvent.VK_C);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Has presionado sobre el bton cancelar.");
    }

    
}
