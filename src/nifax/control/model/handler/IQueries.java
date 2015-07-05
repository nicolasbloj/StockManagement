package nifax.control.model.handler;

/**
 *
 * @author faka
 */
interface IQueries {
    final String userLogin = "from UserEmployee where username = :username and password = :password";
}
