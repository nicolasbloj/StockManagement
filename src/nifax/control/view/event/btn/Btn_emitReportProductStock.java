package nifax.control.view.event.btn;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import nifax.control.JRDataSource.StockDataSource;
import nifax.control.controller.Reporting;
import nifax.control.model.Stock;
import nifax.control.model.modeler.StockOperation;
import nifax.control.view.panel.PanelReportProductStock;

/**
 *
 * @author NB
 */
public class Btn_emitReportProductStock extends AbstractAction {

    private final PanelReportProductStock panelReportProductStock;

    public Btn_emitReportProductStock(PanelReportProductStock panelReportProductStock) {
        super("Generar Reporte");
        this.panelReportProductStock = panelReportProductStock;
        putValue(SHORT_DESCRIPTION, "Presionando este boton generará el reporte solicitado");
        putValue(MNEMONIC_KEY, KeyEvent.VK_R);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StockOperation stockOperation = StockOperation.getInstance();

        List<Stock> list = stockOperation.getListByParameter("quantity",
            Double.parseDouble(panelReportProductStock.getTxf_StockMin().
                getText()));

        StockDataSource stockDataSource = new StockDataSource(list);
        
        Reporting reporting = Reporting.getInstance();
        reporting.generateReport("ProductsStock", "Stock", stockDataSource);
        
        
    }
}
