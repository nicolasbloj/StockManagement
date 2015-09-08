/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.view.event.txf;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.UserEmployee;
import nifax.control.util.Message;
import nifax.control.view.event.btn.Btn_Login;

/**
 *
 * @author faka
 */
public class Txf_Login extends Txf_Listener{
    
    private JTextField usrname;
    private JPasswordField password;
    
    private JPanel login;
    private JPanel frame;
    
    private JLabel lbl_usrname;

    public Txf_Login(JTextField usrname, JPasswordField password, JPanel login, JPanel frame, JLabel lbl_usrname) {
        this.usrname = usrname;
        this.password = password;
        this.login = login;
        this.frame = frame;
        this.lbl_usrname = lbl_usrname;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            login(usrname.getText(), new String(password.getPassword()));
        }   
    }
    
    private void login(final String usrname, final String password){
        try {
            if(Authentication.getInstance().LogIn(new UserEmployee(usrname, password))){
                login.setVisible(false);
                frame.setVisible(true);
                lbl_usrname.setText(Authentication.getInstance().getSession().getUserEmployee().getUsername());
            }else{
                JOptionPane.showMessageDialog(null, Message.invalidUserOrPassword,
                    Message.FailuredOperationTitle, JOptionPane.ERROR_MESSAGE);
                this.usrname.requestFocus();
            }
        } catch (InvalidCredentialsException | InitializeSessionException ex) {
            Logger.getLogger(Btn_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
