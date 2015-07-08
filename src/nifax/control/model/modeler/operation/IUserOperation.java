package nifax.control.model.modeler.operation;

import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.Session;

/**
 *
 * @author faka
 */
public interface IUserOperation {
    Boolean LogIn(String username, String password) throws InvalidCredentialsException;
    Boolean LogOut(Session obj);
}
