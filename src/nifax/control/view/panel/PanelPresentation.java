package nifax.control.view.panel;

import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelPresentation extends Pnl{

    public PanelPresentation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_presentation = new javax.swing.JLabel();

        setBorder(null);

        lbl_presentation.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_presentation.setForeground(new java.awt.Color(102, 102, 102));
        lbl_presentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_presentation.setText("Presentacion ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_presentation;
    // End of variables declaration//GEN-END:variables
}
