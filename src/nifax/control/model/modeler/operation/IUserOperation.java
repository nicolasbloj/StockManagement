package nifax.control.model.modeler.operation;

import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.Session;
import nifax.control.model.UserEmployee;

/**
 *
 * @author faka
 */
public interface IUserOperation {
    Boolean LogIn(UserEmployee usr) throws InvalidCredentialsException;
    Boolean LogOut(Session obj);
}
