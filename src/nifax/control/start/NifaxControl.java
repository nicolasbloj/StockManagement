package nifax.control.start;

import java.util.Scanner;
import nifax.control.controller.Authentication;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.hibernate.HibernateUtil;
import nifax.control.model.Employee;
import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.ModelOperation;

/**
 *
 * @author faka
 */

public class NifaxControl {
    public static void main(String[] args) throws InvalidCredentialsException, InitializeSessionException {
        Authentication auth = Authentication.getInstance();
        try {
            UserEmployee usr;
            ModelOperation a = new ModelOperation();
            ModelOperation op = ModelOperation.getInstance();
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
            // the following lines will be added temporally til we have an UI to 
            // enter the required fields
            Scanner in = new Scanner(System.in);
            String user;
            String pass;
            do {
               user = in.next();
               pass = in.next();
            }while(!auth.LogIn(user, pass));
            a.Insert(auth.getSession()); 
        }
        finally {
            Authentication.getInstance().LogOut(Authentication.getInstance().getSession());
            HibernateUtil.getSessionFactory().close();
        }
    }
}
