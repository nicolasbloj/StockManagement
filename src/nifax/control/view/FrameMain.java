package nifax.control.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import nifax.control.view.panel.PanelPresentation;

/**
 *
 * @author NB
 */
public final class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();

        this.getContentPane().setBackground(new Color(226,212,246));
        final PanelPresentation panelPresentation = new PanelPresentation();
        this.ContainerAddPanel(panelPresentation);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void ContainerAddPanel(JPanel jPanel) {
        this.jsp_container.setViewportView(jPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsp_tree = new javax.swing.JScrollPane();
        jtr_navigation = new nifax.control.view.util.Jtr_navigation(this);
        jp_title = new javax.swing.JPanel();
        jlbl_title = new javax.swing.JLabel();
        jsp_container = new javax.swing.JScrollPane();
        jmb_main = new javax.swing.JMenuBar();
        jm_system = new javax.swing.JMenu();
        jmi_exit = new javax.swing.JMenuItem();
        jm_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsp_tree.setBackground(new java.awt.Color(229, 220, 220));
        jsp_tree.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtr_navigation.setBackground(new java.awt.Color(226, 212, 246));
        jsp_tree.setViewportView(jtr_navigation);

        jp_title.setBackground(new java.awt.Color(226, 212, 246));

        jlbl_title.setBackground(new java.awt.Color(226, 212, 246));
        jlbl_title.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        jlbl_title.setForeground(new java.awt.Color(102, 102, 102));
        jlbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_title.setText("NiFax ");

        javax.swing.GroupLayout jp_titleLayout = new javax.swing.GroupLayout(jp_title);
        jp_title.setLayout(jp_titleLayout);
        jp_titleLayout.setHorizontalGroup(
            jp_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_titleLayout.createSequentialGroup()
                .addComponent(jlbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_titleLayout.setVerticalGroup(
            jp_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jsp_container.setBackground(new java.awt.Color(51, 51, 51));
        jsp_container.setOpaque(true);

        jm_system.setText("Sistema");

        jmi_exit.setText("Salir");
        jm_system.add(jmi_exit);

        jmb_main.add(jm_system);

        jm_help.setText("Ayuda");
        jmb_main.add(jm_help);

        setJMenuBar(jmb_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jsp_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jsp_container, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
            .addComponent(jp_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jp_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_tree, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jsp_container))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbl_title;
    private javax.swing.JMenu jm_help;
    private javax.swing.JMenu jm_system;
    private javax.swing.JMenuBar jmb_main;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JPanel jp_title;
    private javax.swing.JScrollPane jsp_container;
    private javax.swing.JScrollPane jsp_tree;
    private javax.swing.JTree jtr_navigation;
    // End of variables declaration//GEN-END:variables
}
