package nifax.control.exception;

/**
 *
 * @author faka
 */
public class InvalidCredentials extends Exception {
    public InvalidCredentials(){
		super("Acceso denegado, Por favor verifique sus credenciales");
	}
}
