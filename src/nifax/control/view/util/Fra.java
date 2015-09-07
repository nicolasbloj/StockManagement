package nifax.control.view.util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author NB
 */
public class Fra extends JFrame {

    public Fra() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/nifax/control/image/nf_icon.png"));
        this.setIconImage(icon);
    }
/*
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
            getImage(getClass().getResource("/nifax/control/image/nf.png"));

        return retValue;
    }*/
}
