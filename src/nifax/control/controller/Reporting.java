package nifax.control.controller;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import nifax.control.report.jrdatasource.StockDataSource;
import nifax.control.model.Stock;
import nifax.control.model.modeler.StockOperation;
import nifax.control.util.Message;
import nifax.control.util.Path;
import nifax.control.view.event.btn.Btn_reportAction;
import nifax.control.view.panel.PanelReportProductStock;

/**
 *
 * @author NB
 */
public class Reporting implements ActionController {

    private static Reporting instance = null;

    public static final int GENERATE = 0;
    public static final int CANCEL = 1;

    //Panels name - Reports
    public static final String ProductStock = "ProductStock";

    protected Reporting() {
    }

    public static Reporting getInstance() {
        if (instance == null) {
            instance = new Reporting();
        }
        return instance;
    }

    @Override
    public Boolean operate(JPanel panel, String panelName, int ACTION) {
        switch (ACTION) {
            case GENERATE:
                return generate(panel, panelName);
            case CANCEL:
                return cancel(panelName);

        }
        return Boolean.FALSE;
    }

    private Boolean generate(JPanel panel, String panelName) {
        switch (panelName) {
            case ProductStock:
                return generateReportProductStock((PanelReportProductStock) panel);
        }
        return Boolean.FALSE;
    }

    public Boolean generateReportProductStock(PanelReportProductStock panelReportProductStock) {
        StockOperation stockOperation = StockOperation.getInstance();
        List<Stock> list = stockOperation.getListByParameter("quantity", Double.parseDouble(panelReportProductStock.getTxf_StockMin().getText()));
        StockDataSource stockDataSource = new StockDataSource(list);
        return generateReport("ProductsStock", "Stock", stockDataSource);
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

    private Boolean cancel(String panelName) {
        int dialogResult = JOptionPane.showConfirmDialog(null,
            Message.DialogCancel, Message.DialogConfirmationTitle, JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {

            switch (panelName) {
                case ProductStock:
                    Navigation.getInstance().setPanelReportProductStock(new PanelReportProductStock(),null);
                    break;

            }
        }
        return Boolean.TRUE;

    }

}
