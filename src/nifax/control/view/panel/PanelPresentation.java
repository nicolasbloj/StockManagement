package nifax.control.view.panel;

/**
 *
 * @author NB
 */
public class PanelPresentation extends javax.swing.JPanel {

    public PanelPresentation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_presentation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(null);

        jlbl_presentation.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlbl_presentation.setForeground(new java.awt.Color(102, 102, 102));
        jlbl_presentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_presentation.setText("PRESENTATION ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jlbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbl_presentation;
    // End of variables declaration//GEN-END:variables
}
