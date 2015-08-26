package nifax.control.util;

import javax.swing.tree.TreePath;
import nifax.control.controller.Navigation;
import nifax.control.view.frame.FrameMain;

/**
 *
 * @author NB
 */
public class Frame {

    public static void reloadPanel() {
        FrameMain f = Navigation.getInstance().getFrameMain();
        TreePath tp = Navigation.getInstance().getLastSelected();
        Navigation.getInstance().showPanel(tp);
    }
}
