package nifax.control.view.event;

import java.awt.event.WindowEvent;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelPresentation;

/**
 *
 * @author NB
 */
public class Fra_frameMainListener extends Fra_Listener{
    
    @Override
    public void windowOpened(WindowEvent e) {
        FrameMain frameMain = (FrameMain) e.getSource();
        frameMain.getScp_container().setViewportView(new PanelPresentation());
    }

}
