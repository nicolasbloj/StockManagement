package nifax.control.start;

import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentials;
import nifax.control.hibernate.HibernateUtil;
import nifax.control.model.Employee;
import nifax.control.model.UserEmployee;
import nifax.control.model.handler.ModelOperation;
import nifax.control.model.handler.UserOperation;

/**
 *
 * @author faka
 */

public class NifaxControl {
        public static void main(String[] args) throws InvalidCredentials, InitializeSessionException {
        try {
            UserEmployee usr;
            ModelOperation a = new ModelOperation();
            UserOperation op = UserOperation.getInstance();
            usr = new UserEmployee(
                "f4ka", 
                "1234", 
                new Employee(
                    "Facundo", 
                    "Gomez Algazan", 
                    "+5493816534690"
                )
            );
            op.Insert(usr);       
            Authentication auth = Authentication.getInstance();
            auth.initSession((UserEmployee) op.Login("f4ka", "1234"));
            a.Insert(auth.getSession());
        } finally {
            HibernateUtil.getSessionFactory().close();
        }
    }
}
