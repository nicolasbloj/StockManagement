package nifax.control.controller;

import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Session;
import nifax.control.model.UserEmployee;

/**
 *
 * @author faka
 */

public class Authentication {    
    private static Authentication instance = null;
    private static Session SID = null;
    protected Authentication() {
      // Exists only to defeat instantiation.
    }
    public void initSession(UserEmployee usr) {
        if(SID == null) {
           SID = new Session(true, usr);
        }
    }
    public static Authentication getInstance(){
        if(instance == null)
         instance = new Authentication();
        return instance;
    }
    public Session getSession() throws InitializeSessionException{
        if(SID != null)
            return SID;
        else
            throw new InitializeSessionException();
    }
    public void closeSession() throws InitializeSessionException{
        if(SID != null)
            SID = null;
    }    
}


 
   
