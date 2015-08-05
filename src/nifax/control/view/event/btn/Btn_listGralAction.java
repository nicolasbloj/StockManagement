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
public class Btn_listGralAction extends AbstractAction {
    
    private final PanelGeneralAdmin panelGeneralAdmin;
    
    public Btn_listGralAction(PanelGeneralAdmin panelGeneralAdmin) {
        super("Listar");
        this.panelGeneralAdmin = panelGeneralAdmin;
        putValue(SHORT_DESCRIPTION, "Presionando este boton se listaran los elementos en la tabla");
        putValue(MNEMONIC_KEY, KeyEvent.VK_L);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        TableGralController tableController = TableGralController.getInstance();
        tableController.setPanelGeneralAdmin(panelGeneralAdmin);
        tableController.list(panelGeneralAdmin.getTbp_gral().getTitleAt(0));
        
    }
    
}
