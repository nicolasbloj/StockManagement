package nifax.control.view.panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelPresentation extends Pnl {

    public PanelPresentation() {
        initComponents();
    }

    public JButton getBtn_login() {
        return btn_login;
    }

    public JLabel getLbl_pass() {
        return lbl_pass;
    }

    public JLabel getLbl_presentation() {
        return lbl_presentation;
    }

    public JLabel getLbl_user() {
        return lbl_user;
    }

    public JPanel getPnl_btnLogin() {
        return pnl_btnLogin;
    }

    public JPanel getPnl_login() {
        return pnl_login;
    }

    public JPasswordField getPss_pass() {
        return pss_pass;
    }

    public JTextField getTxf_user() {
        return txf_user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_presentation = new javax.swing.JLabel();
        pnl_login = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txf_user = new javax.swing.JTextField();
        pnl_btnLogin = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        pss_pass = new javax.swing.JPasswordField();

        setBorder(null);

        lbl_presentation.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl_presentation.setForeground(new java.awt.Color(102, 102, 102));
        lbl_presentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_presentation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nifax/control/image/nf.png"))); // NOI18N

        pnl_login.setBackground(new java.awt.Color(255, 102, 102));
        pnl_login.setOpaque(false);

        lbl_user.setForeground(new java.awt.Color(204, 102, 0));
        lbl_user.setText("Usuario ");

        lbl_pass.setForeground(new java.awt.Color(204, 102, 0));
        lbl_pass.setText("Contraseña");

        pnl_btnLogin.setOpaque(false);

        btn_login.setText("Login");

        javax.swing.GroupLayout pnl_btnLoginLayout = new javax.swing.GroupLayout(pnl_btnLogin);
        pnl_btnLogin.setLayout(pnl_btnLoginLayout);
        pnl_btnLoginLayout.setHorizontalGroup(
            pnl_btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnLoginLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnl_btnLoginLayout.setVerticalGroup(
            pnl_btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnLoginLayout.createSequentialGroup()
                .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(lbl_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txf_user)
                        .addComponent(pss_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user)
                    .addComponent(txf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass)
                    .addComponent(pss_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(pnl_btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_presentation;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel pnl_btnLogin;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPasswordField pss_pass;
    private javax.swing.JTextField txf_user;
    // End of variables declaration//GEN-END:variables
}
