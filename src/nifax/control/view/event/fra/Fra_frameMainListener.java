package nifax.control.view.event.fra;

import java.awt.event.WindowEvent;
import nifax.control.controller.Navigation;
import nifax.control.view.frame.FrameMain;

/**
 *
 * @author NB
 */
public class Fra_frameMainListener extends Fra_Listener{
    
    @Override
    public void windowOpened(WindowEvent e) {
        FrameMain frameMain = (FrameMain) e.getSource();
        Navigation.setFrameMain(frameMain);
        Navigation.getInstance().showPanel(null);
    }

}
