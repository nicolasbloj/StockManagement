/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.view.event;

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
public class btn_CancelAction extends AbstractAction implements KeyListener{
   
    public btn_CancelAction() {
        super("Cancelar");
        putValue(SHORT_DESCRIPTION, "Presionando este boton cerrara el panel actual");
        putValue(MNEMONIC_KEY, KeyEvent.VK_C);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Has presionado sobre el bton cancelar.");
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
    }
  
}
