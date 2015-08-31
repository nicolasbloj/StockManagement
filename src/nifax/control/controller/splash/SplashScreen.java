package nifax.control.controller.splash;

// SplashScreen.java
// A simple application to show a title screen in the center of the screen
// for the amount of time given in the constructor.  This class includes
// a sample main() method to test the splash screen, but it's meant for use
// with other applications.
//

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRootPane;
import javax.swing.Timer;

public class SplashScreen extends JFrame {
    private static JProgressBar progressBar;
    private static int count = 1;
    private static final int TIMER_PAUSE = 100;
    private static final int PROGBAR_MAX = 105;
    private static Timer progressBarTimer;
    private boolean loadEnded = false;

    public boolean isloadEnded() {
        return loadEnded;
    }

    public void setloadEnded(boolean splashEnded) {
        this.loadEnded = splashEnded;
    }
    public SplashScreen(){
        createSplash();
    }

    private void createSplash(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel splashImage = new JLabel(new ImageIcon(getClass().getResource("splash.png")));
        panel.add(splashImage);

        progressBar = new JProgressBar();
        progressBar.setMaximum(PROGBAR_MAX);
        progressBar.setForeground(new Color(2, 8, 54));
        progressBar.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(progressBar, BorderLayout.SOUTH);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        dispose();
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setVisible(true);

        startProgressBar();
    }

    private void startProgressBar(){
        progressBarTimer = new Timer(TIMER_PAUSE, (ActionEvent e) -> {
            progressBar.setValue(count);
            if(!isloadEnded()){
                if (PROGBAR_MAX == count){
                    SplashScreen.this.dispose();
                    progressBarTimer.stop();
                }
            }else{
                SplashScreen.this.dispose();
                progressBarTimer.stop();
            }


            count++;
        });
        progressBarTimer.start();
    }
}