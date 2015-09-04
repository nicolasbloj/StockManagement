package nifax.control.view.event.tbl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import nifax.control.controller.Searching;
import nifax.control.view.internalframe.IntFrameProductSearch;

/**
 *
 * @author NB
 */
public class Tbl_productListener implements KeyListener {

    private final IntFrameProductSearch intFrame;

    public Tbl_productListener(IntFrameProductSearch intFrame) {
        this.intFrame = intFrame;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_O:
                Searching.showInTable(intFrame, Searching.SHOW_OFFER);
                break;
            case KeyEvent.VK_S:
                Searching.showInTable(intFrame, Searching.SHOW_STOCK);
                break;
            case KeyEvent.VK_ENTER:
                Searching.insertProductInForm(intFrame);
                intFrame.dispose();
                break;
            case KeyEvent.VK_CONTROL:
                Searching.insertProductInForm(intFrame);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
