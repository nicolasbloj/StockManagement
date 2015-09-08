package nifax.control.view.frame;

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
import nifax.control.util.TreeRenderer;
import nifax.control.util.UtilColor;
import nifax.control.view.event.btn.Btn_Login;
import nifax.control.view.event.fra.Fra_frameMainListener;
import nifax.control.view.event.mei.Mei_exitListener;
import nifax.control.view.event.txf.Txf_Login;
import nifax.control.view.util.Fra;
import nifax.control.view.util.Tre;

/**
 *
 * @author NB
 */
public final class FrameMain extends Fra {

    public FrameMain() throws InitializeSessionException {
        initComponents();

        ClockLabel dateLabel = new ClockLabel("date");
        ClockLabel timeLabel = new ClockLabel("time");
        ClockLabel dayLabel = new ClockLabel("day");
        pnl_clock.add(dayLabel);
        pnl_clock.add(dateLabel);
        pnl_clock.add(new JLabel(""));
        pnl_clock.add(timeLabel);
        pnl_clock.setLayout(new GridLayout(2, 2));

        this.pnl_main.setVisible(false);
        this.pnl_login.setVisible(true);

        this.addWindowListener(new Fra_frameMainListener());

        this.getContentPane().setBackground(UtilColor.FrameColor);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public JTree getTre_navigation() {
        return tre_navigation;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        pnl_title = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        pnl_clock = new javax.swing.JPanel();
        lbl_usrname = new javax.swing.JLabel();
        scp_tree = new javax.swing.JScrollPane();
        tre_navigation = new nifax.control.view.util.Tre(this);
        scp_container = new javax.swing.JScrollPane();
        pnl_login = new javax.swing.JPanel();
        pnl_userPass = new javax.swing.JPanel();
        lbl_user2 = new javax.swing.JLabel();
        lbl_pass2 = new javax.swing.JLabel();
        txf_user2 = new javax.swing.JTextField();
        pss_pass = new javax.swing.JPasswordField();
        pnl_btnLogin2 = new javax.swing.JPanel();
        btn_login2 = new javax.swing.JButton(new Btn_Login(txf_user2, pss_pass, pnl_login, pnl_main, lbl_usrname));
        mbr_main = new javax.swing.JMenuBar();
        men_system = new javax.swing.JMenu();
        mei_exit = new javax.swing.JMenuItem();
        men_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(getIconImage());

        pnl_main.setBackground(new java.awt.Color(204, 102, 0));

        pnl_title.setBackground(new java.awt.Color(226, 212, 246));

        lbl_title.setBackground(new java.awt.Color(226, 212, 246));
        lbl_title.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(102, 102, 102));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Usuario:");

        pnl_clock.setOpaque(false);

        javax.swing.GroupLayout pnl_clockLayout = new javax.swing.GroupLayout(pnl_clock);
        pnl_clock.setLayout(pnl_clockLayout);
        pnl_clockLayout.setHorizontalGroup(
            pnl_clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        pnl_clockLayout.setVerticalGroup(
            pnl_clockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(pnl_clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_clock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(lbl_usrname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        scp_tree.setBackground(new java.awt.Color(229, 220, 220));
        scp_tree.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tre_navigation.setBackground(new java.awt.Color(226, 212, 246));
        tre_navigation.setCellRenderer(new TreeRenderer());
        Tre.expandAll(this.tre_navigation);
        scp_tree.setViewportView(tre_navigation);

        scp_container.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addComponent(scp_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scp_container))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scp_container, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
        );

        pnl_login.setOpaque(false);

        pnl_userPass.setOpaque(false);

        lbl_user2.setForeground(new java.awt.Color(204, 102, 0));
        lbl_user2.setText("Usuario ");

        lbl_pass2.setForeground(new java.awt.Color(204, 102, 0));
        lbl_pass2.setText("Contraseña");

        pss_pass.addKeyListener(new Txf_Login(txf_user2, pss_pass, pnl_login, pnl_main, lbl_usrname));

        pnl_btnLogin2.setOpaque(false);

        btn_login2.setText("Login");

        javax.swing.GroupLayout pnl_btnLogin2Layout = new javax.swing.GroupLayout(pnl_btnLogin2);
        pnl_btnLogin2.setLayout(pnl_btnLogin2Layout);
        pnl_btnLogin2Layout.setHorizontalGroup(
            pnl_btnLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnLogin2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btn_login2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnl_btnLogin2Layout.setVerticalGroup(
            pnl_btnLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnLogin2Layout.createSequentialGroup()
                .addComponent(btn_login2)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnl_userPassLayout = new javax.swing.GroupLayout(pnl_userPass);
        pnl_userPass.setLayout(pnl_userPassLayout);
        pnl_userPassLayout.setHorizontalGroup(
            pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userPassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(lbl_user2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_btnLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txf_user2)
                        .addComponent(pss_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
        );
        pnl_userPassLayout.setVerticalGroup(
            pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userPassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user2)
                    .addComponent(txf_user2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_userPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass2)
                    .addComponent(pss_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(pnl_btnLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(pnl_userPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loginLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_userPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

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
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnl_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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
    private javax.swing.JButton btn_login2;
    private javax.swing.JLabel lbl_pass2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_user2;
    private javax.swing.JLabel lbl_usrname;
    private javax.swing.JMenuBar mbr_main;
    private javax.swing.JMenuItem mei_exit;
    private javax.swing.JMenu men_help;
    private javax.swing.JMenu men_system;
    private javax.swing.JPanel pnl_btnLogin2;
    private javax.swing.JPanel pnl_clock;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JPanel pnl_userPass;
    private javax.swing.JPasswordField pss_pass;
    private javax.swing.JScrollPane scp_container;
    private javax.swing.JScrollPane scp_tree;
    private javax.swing.JTree tre_navigation;
    private javax.swing.JTextField txf_user2;
    // End of variables declaration//GEN-END:variables
}
