package nifax.control.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Control {

    //TMP file
    private final String appPath = System.getProperties().getProperty("java.io.tmpdir");
    private final File file = new File( appPath + "/myApp.tmp");    
    //time required to update tmp file
    private final int seconds = 20;

    public Control(){};

    /**
     * Check if the tmp file exists, and if it doesn't exist create one and initialize values
     * @return 
    */
    public boolean check()
    {           
        if (file.exists()){           
            long currentTime = read();//Time read of File
            long res = diffTime(currentTime );           
            if( res < seconds ){              
                JOptionPane.showMessageDialog(null,
                    Message.DialogCheck,
                    Message.FailuredOperation,
                    JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else{        
                scheduleTask();
                return true;
            }
        }
        else{// the file doesn't exist
            createTMP();   
            scheduleTask();
            return true;
        }            
    }

    /**
     * Read the tmp file and return his value
     * @return LONG 
    */
    public long read(){
        String line = "0";        
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader( new FileReader( file ) );            
            while(bufferedReader.ready()){
                line = bufferedReader.readLine();            
            }
        }catch (IOException e) {
            System.err.println( e.getMessage() );
        }
        return Long.valueOf(line);
    }

    /**
    * Schedule a process that is executed for each period
    */
    public void scheduleTask(){
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            createTMP();
        }, 1000, seconds * 1000 , TimeUnit.MILLISECONDS );
    }

    /**
    * Create a tmp file using a unique value, the currentTime 
    */
    public void createTMP(){
        Date currentDate=new Date();        
        try {            
            BufferedWriter writer = new BufferedWriter(new FileWriter( file ));                        
            writer.write(String.valueOf(currentDate.getTime() ) );                        
            writer.close();            
        } catch (IOException e) {
            System.err.println( e.getMessage() );
        }        
    }

 
    public long diffTime( long currentTime ){
        Date date =new Date();        
        long timeTMP = date.getTime();        
        long time = timeTMP - currentTime;        
        time = time /1000;        
        return time;
    }

    /**
    * Delete tmp file if it exists
    */
    public void closeApp(){   
        if ( file.exists() ) { file.delete(); }
        System.exit(0);
    }
}

