package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import nifax.control.view.internalframe.IntFrameProductSearch;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class Btn_ticketProductSearchAction extends AbstractAction {

    private final PanelSalesTicket panelSalesTicket;

    public Btn_ticketProductSearchAction(PanelSalesTicket panelSalesTicket) {
        super("...");
        this.panelSalesTicket = panelSalesTicket;
        putValue(SHORT_DESCRIPTION, "Presionando este boton abrira la busqueda de productos");
        putValue(MNEMONIC_KEY, KeyEvent.VK_B);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        javax.swing.JLayeredPane layeredPane = (javax.swing.JLayeredPane) this.panelSalesTicket.getParent().getParent().getParent().getParent();

        IntFrameProductSearch intFrameProductSearch
                = new IntFrameProductSearch(layeredPane);

        layeredPane.add(intFrameProductSearch);

    }

}
