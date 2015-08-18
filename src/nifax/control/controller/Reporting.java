package nifax.control.controller;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import nifax.control.JRDataSource.StockDataSource;
import nifax.control.model.Stock;
import nifax.control.model.modeler.StockOperation;
import nifax.control.util.Path;
import nifax.control.view.event.btn.Btn_reportAction;
import nifax.control.view.panel.PanelReportProductStock;

/**
 *
 * @author NB
 */
public class Reporting {

    private static Reporting instance = null;

    private PanelReportProductStock panelReportProductStock;
    //Reports
    public static final int ProductStock = 0;

    protected Reporting() {
    }

    public static Reporting getInstance() {
        if (instance == null) {
            instance = new Reporting();
        }
        return instance;
    }

    public void setPanelReportProductStock(PanelReportProductStock panelReportProductStock) {
        this.panelReportProductStock = panelReportProductStock;
    }

    
    public Boolean operate(int report) {

        switch (report) {

            case ProductStock:
                StockOperation stockOperation = StockOperation.getInstance();
                List<Stock> list = stockOperation.getListByParameter("quantity", Double.parseDouble(panelReportProductStock.getTxf_StockMin().getText()));
                StockDataSource stockDataSource = new StockDataSource(list);
                return generateReport("ProductsStock", "Stock", stockDataSource);
                
        }
        return Boolean.FALSE;
    }

    private Boolean generateReport(String name, String title, JRDataSource dataSource) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            String absolutePath = new File("").getAbsolutePath();
            String path = stringBuilder.append(absolutePath).
                append(Path.PATH_REPORTS).
                append(name).
                append(".jasper").
                toString();

            JasperReport jasperReport;
            jasperReport = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            stringBuilder.setLength(0);
            jasperViewer.setTitle(stringBuilder.append("REPORTE : ").append(title).toString());

            jasperViewer.setVisible(true);
            return Boolean.TRUE;
                
        } catch (JRException ex) {
            Logger.getLogger(Btn_reportAction.class.getName()).log(Level.SEVERE, null, ex);
            return Boolean.FALSE;
        }

    }

}
