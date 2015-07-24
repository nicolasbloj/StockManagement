package nifax.control.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import nifax.control.view.event.Fra_frameMainListener;
import nifax.control.view.event.Mei_exitListener;

/**
 *
 * @author NB
 */
public final class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();

        this.addWindowListener(new Fra_frameMainListener());
        
        this.getContentPane().setBackground(new Color(226,212,246));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scp_tree = new javax.swing.JScrollPane();
        tre_navigation = new nifax.control.view.util.Tre(this);
        pnl_title = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        scp_container = new javax.swing.JScrollPane();
        mbr_main = new javax.swing.JMenuBar();
        men_system = new javax.swing.JMenu();
        mei_exit = new javax.swing.JMenuItem();
        men_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scp_tree.setBackground(new java.awt.Color(229, 220, 220));
        scp_tree.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tre_navigation.setBackground(new java.awt.Color(226, 212, 246));
        scp_tree.setViewportView(tre_navigation);

        pnl_title.setBackground(new java.awt.Color(226, 212, 246));

        lbl_title.setBackground(new java.awt.Color(226, 212, 246));
        lbl_title.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(102, 102, 102));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("NiFax ");

        javax.swing.GroupLayout pnl_titleLayout = new javax.swing.GroupLayout(pnl_title);
        pnl_title.setLayout(pnl_titleLayout);
        pnl_titleLayout.setHorizontalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_titleLayout.createSequentialGroup()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        scp_container.setBackground(new java.awt.Color(51, 51, 51));
        scp_container.setOpaque(true);

        men_system.setText("Sistema");

        mei_exit.addActionListener(new Mei_exitListener());
        mei_exit.setText("Salir");
        men_system.add(mei_exit);

        mbr_main.add(men_system);

        men_help.setText("Ayuda");
        mbr_main.add(men_help);

        setJMenuBar(mbr_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scp_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scp_container, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
            .addComponent(pnl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_tree, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(scp_container))
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

    public JScrollPane getScp_container() {
        return scp_container;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_title;
    private javax.swing.JMenuBar mbr_main;
    private javax.swing.JMenuItem mei_exit;
    private javax.swing.JMenu men_help;
    private javax.swing.JMenu men_system;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JScrollPane scp_container;
    private javax.swing.JScrollPane scp_tree;
    private javax.swing.JTree tre_navigation;
    // End of variables declaration//GEN-END:variables
}
