package nifax.control.view.event.tre;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import nifax.control.controller.Navigation;
import nifax.control.view.frame.FrameMain;

/**
 *
 * @author NB
 */
public class Tre_Listener implements MouseListener, KeyListener {

    private final FrameMain frameMain;
    private final Navigation navigation;
    
    public Tre_Listener(FrameMain jFrameMain) {
        
        this.frameMain = jFrameMain;

        navigation = Navigation.getInstance();
        Navigation.setFrameMain(jFrameMain);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {

        if (me.getButton() == MouseEvent.BUTTON1 && me.getClickCount() == 2) {
            JTree jTree = (JTree) me.getSource();
            TreePath tp = jTree.getPathForLocation(me.getX(), me.getY());

            navigation.showPanel(tp);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent me) {

        JTree jTree = (JTree) me.getSource();

        if (me.getKeyCode() == KeyEvent.VK_ENTER) {

            TreePath tp = jTree.getSelectionPath();

            navigation.showPanel(tp);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
