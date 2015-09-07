package nifax.control.view.panel;

import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelPresentation extends Pnl {

    public PanelPresentation() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_presentation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBorder(null);

        lbl_presentation.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_presentation.setForeground(new java.awt.Color(102, 102, 102));
        lbl_presentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_presentation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nifax/control/image/nf.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setOpaque(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_presentation, javax.swing.GroupLayout.PREFERRED_SIZE, 203, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_presentation;
    // End of variables declaration//GEN-END:variables
}
