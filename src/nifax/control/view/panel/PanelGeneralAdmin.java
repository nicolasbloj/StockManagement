package nifax.control.view.panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import nifax.control.view.event.btn.Btn_saveGralAction;
import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelGeneralAdmin extends Pnl {

    public PanelGeneralAdmin() {
        initComponents();
    }

    public JButton getBtn_saveGral() {
        return btn_saveGral;
    }

    public JLabel getLbl_descGral() {
        return lbl_descGral;
    }

    public JLabel getLbl_profitGral() {
        return lbl_profitGral;
    }

    public JPanel getPnl_loadGral() {
        return pnl_loadGral;
    }

    public JPanel getPnl_menuGral() {
        return pnl_menuGral;
    }

    public JTabbedPane getTbp_gral() {
        return tbp_gral;
    }

    public JTextField getTxf_descGral() {
        return txf_descGral;
    }

    public JTextField getTxf_profitGral() {
        return txf_profitGral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_gral = new javax.swing.JTabbedPane();
        pnl_loadGral = new nifax.control.view.util.Pnl_Tab();
        lbl_profitGral = new javax.swing.JLabel();
        lbl_descGral = new javax.swing.JLabel();
        txf_profitGral = new javax.swing.JTextField();
        txf_descGral = new javax.swing.JTextField();
        pnl_menuGral = new javax.swing.JPanel();
        btn_saveGral = new javax.swing.JButton(new Btn_saveGralAction(this));

        lbl_profitGral.setVisible(false);
        lbl_profitGral.setText("Rentabilidad :");

        lbl_descGral.setText("Descripcion : ");

        txf_profitGral.setVisible(false);

        javax.swing.GroupLayout pnl_loadGralLayout = new javax.swing.GroupLayout(pnl_loadGral);
        pnl_loadGral.setLayout(pnl_loadGralLayout);
        pnl_loadGralLayout.setHorizontalGroup(
            pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loadGralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_loadGralLayout.createSequentialGroup()
                        .addComponent(lbl_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_loadGralLayout.createSequentialGroup()
                        .addComponent(lbl_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        pnl_loadGralLayout.setVerticalGroup(
            pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loadGralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        tbp_gral.addTab("Gral", pnl_loadGral);

        pnl_menuGral.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menuGral.setBorder(null);

        btn_saveGral.setText("Guardar");

        javax.swing.GroupLayout pnl_menuGralLayout = new javax.swing.GroupLayout(pnl_menuGral);
        pnl_menuGral.setLayout(pnl_menuGralLayout);
        pnl_menuGralLayout.setHorizontalGroup(
            pnl_menuGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuGralLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_saveGral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuGralLayout.setVerticalGroup(
            pnl_menuGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuGralLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btn_saveGral))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbp_gral)
            .addComponent(pnl_menuGral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbp_gral)
                .addGap(0, 0, 0)
                .addComponent(pnl_menuGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saveGral;
    private javax.swing.JLabel lbl_descGral;
    private javax.swing.JLabel lbl_profitGral;
    private javax.swing.JPanel pnl_loadGral;
    private javax.swing.JPanel pnl_menuGral;
    private javax.swing.JTabbedPane tbp_gral;
    private javax.swing.JTextField txf_descGral;
    private javax.swing.JTextField txf_profitGral;
    // End of variables declaration//GEN-END:variables
}
