package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import nifax.control.controller.TableGralController;
import nifax.control.view.panel.PanelGeneralAdmin;

/**
 *
 * @author NB
 */
public class Btn_deleteGralAction extends AbstractAction {

    private final PanelGeneralAdmin panelGeneralAdmin;

    public Btn_deleteGralAction(PanelGeneralAdmin panelGeneralAdmin) {
        super("Eliminar");
        this.panelGeneralAdmin = panelGeneralAdmin;
        putValue(SHORT_DESCRIPTION, "Presionando este boton se eliminaran los elementos seleccionados en la tabla");
        putValue(MNEMONIC_KEY, KeyEvent.VK_D);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String titleTab = panelGeneralAdmin.getTbp_gral().getTitleAt(0);

        TableGralController.getInstance().delete(titleTab);

    }

}
