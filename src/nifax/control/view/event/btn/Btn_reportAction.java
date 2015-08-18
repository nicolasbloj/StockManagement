package nifax.control.view.event.btn;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import nifax.control.controller.Reporting;
import nifax.control.util.Message;
import nifax.control.view.panel.PanelReportProductStock;

/**
 *
 * @author NB
 */
public class Btn_reportAction extends AbstractAction {

    private final PanelReportProductStock panelReportProductStock;

    private final int report;

    public Btn_reportAction(PanelReportProductStock panelReportProductStock, int report) {
        super("Generar Reporte");
        this.report = report;
        this.panelReportProductStock = panelReportProductStock;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Reporting reporting = Reporting.getInstance();
        reporting.setPanelReportProductStock(panelReportProductStock);
        if (!reporting.operate(report)) {
            JOptionPane.showMessageDialog(null, Message.FailuredOperation, Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
        }

    }
}
