package nifax.control.controller;

import java.util.List;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.Session;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.ModelOperation;
import nifax.control.model.modeler.operation.IUserOperation;
import nifax.control.model.modeler.operation.IQueries;

/**
 *
 * @author faka
 */

public class Authentication extends ModelOperation implements IUserOperation, IQueries {    
    private static Authentication instance = null;
    private static Session SID = null;
    protected Authentication() {
      // Exists only to defeat instantiation.
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

    @Override
    public Boolean LogIn(String username, String password) throws InvalidCredentialsException{
        List obj = Select(userLogin)
            .setParameter("username", username)
            .setParameter("password", password)
            .list();
        if(!obj.isEmpty()){
            SID = new Session(Boolean.TRUE, (UserEmployee) obj.get(0));
            return Boolean.TRUE;            
        } else
            return Boolean.FALSE;
    }

    @Override
    public Boolean LogOut(Session obj) {
        obj.setOpen(Boolean.FALSE);
        Update(obj);
        return Boolean.TRUE;
    }
    
    public void NullifySession(){
        SID = null;
    }

}


 
   
