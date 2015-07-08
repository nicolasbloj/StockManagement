package nifax.control.model.modeler.operation;

/**
 *
 * @author faka
 */
public interface IQueries {
    final String userLogin = "from UserEmployee where username = :username and password = :password";
}
