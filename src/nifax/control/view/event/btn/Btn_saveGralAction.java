package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import nifax.control.controller.Navigation;
import nifax.control.controller.TableGralController;
import nifax.control.model.Category;
import nifax.control.model.Measure;
import nifax.control.model.Price;
import nifax.control.model.Store;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.view.FrameMain;
import nifax.control.view.panel.PanelGeneralAdmin;

/**
 *
 * @author NB
 */
public class Btn_saveGralAction extends AbstractAction {

    private final PanelGeneralAdmin panelGeneralAdmin;

    public Btn_saveGralAction(PanelGeneralAdmin panelGeneralAdmin) {
        super("Guardar");
        this.panelGeneralAdmin = panelGeneralAdmin;
        putValue(SHORT_DESCRIPTION, "Presionando este boton se insertará el elemento");
        putValue(MNEMONIC_KEY, KeyEvent.VK_G);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea guardar ?", "Confirmacion",
                    JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                String titleTab = panelGeneralAdmin.getTbp_gral().getTitleAt(0);
                String desc = panelGeneralAdmin.getTxf_descGral().getText();
                double profit;

                HQLOperation hqlOperation = HQLOperation.getInstance();
                switch (titleTab) {

                    case TableGralController.Category:
                        hqlOperation.Insert(new Category(desc));
                        break;
                    case TableGralController.Store:
                        hqlOperation.Insert(new Store(desc));
                        break;
                    case TableGralController.Measure:
                        hqlOperation.Insert(new Measure(desc));
                        break;
                    case TableGralController.Price:
                        profit = Double.parseDouble(panelGeneralAdmin.getTxf_profitGral().getText());
                        hqlOperation.Insert(new Price(desc, profit));
                        break;

                }

                //Reload panel
                FrameMain f = Navigation.getInstance().getFrameMain();
                TreePath tp = Navigation.getInstance().getLastSelected();
                Navigation.getInstance().showPanel(tp);

                this.panelGeneralAdmin.repaint();

            }
        } catch (java.lang.NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(null, "Formato incorrecto en algun campo");
            
        }
    }
}
