package nifax.control.util;

/**
 *
 * @author NB
 */
public class Message {

    //Exception's messages
    public static final String ConstraintViolationException = "No se puede eliminar ya que existen otros elementos que usan este valor";
    public static final String ConstraintViolationExceptionTitle = "Relacion entre elementos";

    public static final String NumberFormatException = "Elementos ingresados incorrectamente";
    public static final String NumberFormatExceptionTitle = "Formato de numeros";

    public static final String NullPointerException = "No se cuenta con todos los elementos necesarios";
    public static final String NullPointerExceptionTitle = "Elementos nulos";

    //Failure's messages
    public static final String FailuredOperation = "Operacion fallida";
    public static final String FailuredOperationTitle = "Error";

    //Generic messages
    public static final String Save = "Elemento cargado correctamente";
    public static final String Edit = "Elemento editado correctamente";
    public static final String Delete = "Elemento eliminado correctamente";

    //Dialog's messages
    //For product's search in ticket
    public static final String DialogProductNotFound = "Producto no encontrado";
    public static final String DialogProductNotActive = "El producto no se encuentra habilitado";
    public static final String DialogProductNotActiveTitle = "Estado del producto";

    //Dialog's generic messages 
    public static final String DialogSave = "Esta seguro que desea guardar ?";
    public static final String DialogDelete = "Esta seguro que desea eliminar ?";
    public static final String DialogConfirmationTitle = "Confirmacion";
    public static final String DialogEmit = "Esta seguro que desea emitir este documento ?";

    //Ticket's dialog.
    public static String DialogEmitTicket = "Esta seguro que desea emitir ticket ?";

    //Extras messages
    public static final String MeasureAlreadyLoaded = "Este tipo de medida ya se encuentra agregado";

    //Short descriptions
    public static String ShorDescriptionSave = "Presionando este boton guardara el elemento";
    public static String ShorDescriptionSearch = "Presionando este boton se buscara el elemento especificado";
    public static String ShorDescriptionDelete = "Presionando este boton borrara el elemento especificado";
    public static String ShorDescriptionListProduct = "Presionando este boton se abrira la pantalla de busqueda avanzada de listar";
    public static String ShorDescriptionListGral = "Presionando este boton se listaran los elementos en la tabla derecha";
    public static String ShorDescriptionEmit = "Presionando este boton se emitira el documento especificado";
    public static String ShorDescriptionGenerate = "Presionando este boton se generara el documento especificado";
;
}
