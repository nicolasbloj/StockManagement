package nifax.control.controller;

import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.Session;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.operation.IUserOperation;
import nifax.control.data.IQueries;

/**
 *
 * @author faka
 */
public class Authentication extends HQLOperation implements IUserOperation, IQueries {

    private static Authentication instance = null;
    private static Session SID = null;

    protected Authentication() {
        // Exists only to defeat instantiation.
    }

    public static Authentication getInstance() {
        if (instance == null) {
            instance = new Authentication();
        }
        return instance;
    }

    public Session getSession() throws InitializeSessionException {
        if (SID != null) {
            return SID;
        } else {
            throw new InitializeSessionException();
        }
    }

    @Override
    public Boolean LogIn(UserEmployee usr) throws InvalidCredentialsException {
        UserEmployee obj = (UserEmployee) SelectUnique(userLogin, usr);
        if (obj!=null) {
            if (obj.getPassword().equals(usr.getPassword())) {
                SID = new Session(Boolean.TRUE, obj);
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        } else {
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean LogOut(Session obj) {
        obj.setOpen(Boolean.FALSE);        
        return Update(obj);
    }

    public void NullifySession() {
        SID = null;
    }

}
