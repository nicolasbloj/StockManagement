package nifax.control.exception;

/**
 *
 * @author faka
 */
public class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(){
		super("Acceso denegado, Por favor verifique sus credenciales");
	}
}
