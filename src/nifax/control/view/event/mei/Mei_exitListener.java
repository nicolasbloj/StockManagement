package nifax.control.view.event.mei;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.hibernate.HibernateUtil;

/**
 *
 * @author NB
 */
public class Mei_exitListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Authentication.getInstance().LogOut(Authentication.getInstance().getSession());
        } catch (InitializeSessionException ex) {
            Logger.getLogger(Mei_exitListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        HibernateUtil.getSessionFactory().close();

        System.exit(0);
    }

}
