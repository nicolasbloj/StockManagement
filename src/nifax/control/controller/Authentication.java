package nifax.control.controller;

import java.sql.Timestamp;
import java.util.List;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.UserSession;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.model.modeler.operation.IUserOperation;
import nifax.control.data.IQueries;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author faka
 */
public class Authentication extends HQLOperation implements IUserOperation, IQueries {

    private static Authentication instance = null;
    private static UserSession SID = null;

    protected Authentication() {
        // Exists only to defeat instantiation.
    }

    public static Authentication getInstance() {
        if (instance == null) {
            instance = new Authentication();
        }
        return instance;
    }

    public UserSession getSession() throws InitializeSessionException {
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
                cleanInvalidSessions(obj);
                SID = new UserSession(Boolean.TRUE, obj);
                HQLOperation.getInstance().Insert(SID);
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        } else {
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean LogOut(UserSession obj) {
        obj.setOpen(Boolean.FALSE);        
        return Update(obj);
    }

    public void NullifySession() {
        SID = null;
    }
    
    public boolean cleanInvalidSessions(UserEmployee ue){
        int resultCount = SelectCount(UserSessionInvalid, "user_id", ue);
        if(resultCount > 0){
            long threeDays = 3 * 24 * 60 * 60 * 1000;
            Criterion user = Restrictions.eq("userEmployee", ue);
            Criterion open = Restrictions.eq("open",false);
            Criterion date = Restrictions.lt("login_date", new Timestamp(System.currentTimeMillis()-threeDays));
            LogicalExpression orExp = Restrictions.or(user, open);
            LogicalExpression orEx = Restrictions.or(date, open);
            List<UserSession> toDelete = session.createCriteria(UserSession.class)  
                   .add(orExp)
                   .add(orEx)
                   .list();
            toDelete.stream().forEach((o) -> {
                Delete(o);
            });
        }
        return true;
    }

}
