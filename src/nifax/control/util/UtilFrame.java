package nifax.control.util;

import javax.swing.tree.TreePath;
import nifax.control.controller.Navigation;

/**
 *
 * @author NB
 */
public class Frame {

    public static void reloadPanel() {
        TreePath tp = Navigation.getInstance().getLastSelectedTreePath();
        Navigation.getInstance().showPanel(tp);
    }
}
