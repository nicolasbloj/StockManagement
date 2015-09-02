package nifax.control.view.frame;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.util.ClockLabel;
import nifax.control.view.event.fra.Fra_frameMainListener;
import nifax.control.view.event.mei.Mei_exitListener;

/**
 *
 * @author NB
 */
public final class FrameMain extends javax.swing.JFrame {

    public FrameMain() throws InitializeSessionException {
        initComponents();
        
        lbl_usrname.setText(Authentication.getInstance().getSession().getUserEmployee().getUsername());
        ClockLabel dateLabel = new ClockLabel("date");
        ClockLabel timeLabel = new ClockLabel("time");
        ClockLabel dayLabel = new ClockLabel("day");
        pnl_clock.add(dayLabel);        
        pnl_clock.add(dateLabel);
        pnl_clock.add(new JLabel(""));
        pnl_clock.add(timeLabel);
        pnl_clock.setLayout(new GridLayout(2, 2));
        
        this.addWindowListener(new Fra_frameMainListener());

        this.getContentPane().setBackground(new Color(226,212,246));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public JTree getTre_navigation() {
        return tre_navigation;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scp_tree = new javax.swing.JScrollPane();
        tre_navigation = new nifax.control.view.util.Tre(this);
        pnl_title = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        pnl_clock = new javax.swing.JPanel();
        lbl_usrname = new javax.swing.JLabel();
        scp_container = new javax.swing.JScrollPane();
        mbr_main = new javax.swing.JMenuBar();
        men_system = new javax.swing.JMenu();
        mei_exit = new javax.swing.JMenuItem();
        men_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        scp_tree.setBackground(new java.awt.Color(229, 220, 220));
        scp_tree.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tre_navigation.setBackground(new java.awt.Color(226, 212, 246));
        scp_tree.setViewportView(tre_navigation);

        pnl_title.setBackground(new java.awt.Color(226, 212, 246));

        lbl_title.setBackground(new java.awt.Color(226, 212, 246));
        lbl_title.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(102, 102, 102));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Usuario:");

        javax.swing.GroupLayout pnl_clockLayout = new javax.swing.GroupLayout(pnl_clock);
        pnl_clock.setLayout(pnl_clockLayout);
        pnl_clockLayout.setHorizontalGroup(
            pnl_clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        pnl_clockLayout.setVerticalGroup(
            pnl_clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lbl_usrname.setBackground(new java.awt.Color(226, 212, 246));
        lbl_usrname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_usrname.setForeground(new java.awt.Color(102, 102, 102));
        lbl_usrname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usrname.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnl_titleLayout = new javax.swing.GroupLayout(pnl_title);
        pnl_title.setLayout(pnl_titleLayout);
        pnl_titleLayout.setHorizontalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(pnl_clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_titleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scp_container.setBackground(new java.awt.Color(51, 51, 51));

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
                .addComponent(scp_container))
            .addComponent(pnl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_tree, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FrameMain().setVisible(true);
            } catch (InitializeSessionException ex) {
                Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public JScrollPane getScp_container() {
        return scp_container;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_usrname;
    private javax.swing.JMenuBar mbr_main;
    private javax.swing.JMenuItem mei_exit;
    private javax.swing.JMenu men_help;
    private javax.swing.JMenu men_system;
    private javax.swing.JPanel pnl_clock;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JScrollPane scp_container;
    private javax.swing.JScrollPane scp_tree;
    private javax.swing.JTree tre_navigation;
    // End of variables declaration//GEN-END:variables
}
