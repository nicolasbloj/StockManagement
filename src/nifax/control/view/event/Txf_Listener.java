package nifax.control.view.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author NB
 */
public class Txf_Listener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
e.consume();
    }
    
}