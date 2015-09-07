package nifax.control.view.panel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import nifax.control.controller.Reporting;
import nifax.control.validate.MyIntFilter;
import nifax.control.view.util.Pnl;
import nifax.control.view.util.Tbp;

/**
 *
 * @author NB
 */
public class PanelReportProductStock extends Pnl {

  
    public PanelReportProductStock() {
        initComponents();
    }

    public JTextField getTxf_StockMin() {
        return txf_stockMin;
    }

    public JPanel getPnl_reportProductStock() {
        return pnl_reportProductStock;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_menuReportProductStock = new javax.swing.JPanel();
        btn_generateReport = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_reportAction(this,Reporting.GENERATE,"Generar"));
        btn_cancel = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_reportAction(this,Reporting.CANCEL,"Cancelar"));
        tbp_reportProductStock = new Tbp();
        pnl_reportProductStock = new javax.swing.JPanel();
        lbl_stockMin = new javax.swing.JLabel();
        txf_stockMin = new javax.swing.JTextField();

        pnl_menuReportProductStock.setBackground(new java.awt.Color(51, 51, 51));

        btn_generateReport.setText("Generar");

        btn_cancel.setText("Cancelar");

        javax.swing.GroupLayout pnl_menuReportProductStockLayout = new javax.swing.GroupLayout(pnl_menuReportProductStock);
        pnl_menuReportProductStock.setLayout(pnl_menuReportProductStockLayout);
        pnl_menuReportProductStockLayout.setHorizontalGroup(
            pnl_menuReportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuReportProductStockLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_generateReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuReportProductStockLayout.setVerticalGroup(
            pnl_menuReportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuReportProductStockLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_menuReportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generateReport)
                    .addComponent(btn_cancel)))
        );

        lbl_stockMin.setText("Stock minimo");

        ((PlainDocument) txf_stockMin.getDocument()).setDocumentFilter(new MyIntFilter());

        javax.swing.GroupLayout pnl_reportProductStockLayout = new javax.swing.GroupLayout(pnl_reportProductStock);
        pnl_reportProductStock.setLayout(pnl_reportProductStockLayout);
        pnl_reportProductStockLayout.setHorizontalGroup(
            pnl_reportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_reportProductStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_stockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_stockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        pnl_reportProductStockLayout.setVerticalGroup(
            pnl_reportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_reportProductStockLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_reportProductStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_stockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_stockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        tbp_reportProductStock.addTab("Stock", pnl_reportProductStock);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_menuReportProductStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbp_reportProductStock)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tbp_reportProductStock)
                .addGap(0, 0, 0)
                .addComponent(pnl_menuReportProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_generateReport;
    private javax.swing.JLabel lbl_stockMin;
    private javax.swing.JPanel pnl_menuReportProductStock;
    private javax.swing.JPanel pnl_reportProductStock;
    private javax.swing.JTabbedPane tbp_reportProductStock;
    private javax.swing.JTextField txf_stockMin;
    // End of variables declaration//GEN-END:variables
}
