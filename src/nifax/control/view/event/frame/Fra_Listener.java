package nifax.control.view.event.frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.hibernate.HibernateUtil;
import nifax.control.util.Control;

/**
 *
 * @author NB
 */
public class Fra_Listener implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(JOptionPane.showConfirmDialog(new JFrame(),"¿Esta seguro que desea salir?", "Aviso",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JFrame frame = (JFrame)e.getSource();
            frame.removeAll();
            try {
                Authentication.getInstance().LogOut(Authentication.getInstance().getSession());
            } catch (InitializeSessionException ex) {
                Logger.getLogger(Fra_Listener.class.getName()).log(Level.SEVERE, null, ex);
            }
            HibernateUtil.getSessionFactory().close();
            new Control().closeApp();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {        
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {    
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
