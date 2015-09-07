package nifax.control.view.panel;

import nifax.control.util.UtilColor;
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
        scp_note = new javax.swing.JScrollPane();
        txa_note = new javax.swing.JTextArea();

        setBorder(null);

        lbl_presentation.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_presentation.setForeground(new java.awt.Color(102, 102, 102));
        lbl_presentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_presentation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nifax/control/image/nf.png"))); // NOI18N

        scp_note.setBackground(new java.awt.Color(255, 204, 102));
        scp_note.setOpaque(true);

        txa_note.setBackground(UtilColor.FrameColor);
        txa_note.setColumns(20);
        txa_note.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        txa_note.setForeground(new java.awt.Color(204, 102, 0));
        txa_note.setRows(5);
        txa_note.setText("BIENVENIDO...!");
        txa_note.setOpaque(true);
        scp_note.setViewportView(txa_note);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scp_note)
            .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scp_note, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_presentation, javax.swing.GroupLayout.PREFERRED_SIZE, 203, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_presentation;
    private javax.swing.JScrollPane scp_note;
    private javax.swing.JTextArea txa_note;
    // End of variables declaration//GEN-END:variables
}
