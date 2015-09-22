package nifax.control.util;

/**
 *
 * @author NB
 */
public class Message {

    //Exception's messages
    public static final String ConstraintViolationException = "No se puede eliminar ya que existen otros elementos que usan este valor";
    public static final String ConstraintViolationExceptionTitle = "Excepcion - Relacion entre elementos";

    public static final String NumberFormatException = "Elementos ingresados incorrectamente";
    public static final String NumberFormatExceptionTitle = "Excepcion - Formato de numeros";

    public static final String NullPointerException = "No se cuenta con todos los elementos necesarios";
    public static final String NullPointerExceptionTitle = "Excepcion - Elementos nulos";

    public static final String ClassCastExceptionTitle = "Excepcion - Casting de elementos ";

    public static final String FileNotFoundException = "No se encuentra la ruta para guardar el archivo";
    public static final String FileNotFoundExceptionTitle = "Excepcion - Ruta de archivo";
    
    public static final String IOException = "No se encuentra el elemento";
    public static final String IOExceptionTitle = "Excepcion - Elemento de entrada";
    
    public static final String DocumentException = "No se puede generar el archivo pdf";
    public static final String DocumentExceptionTitle = "Excepcion - Generacion de archivo pdf";
    
    
    
    
    
    //Failure's messages
    public static final String FailuredOperation = "Operacion fallida";
    public static final String FailuredOperationTitle = "Error";
    public static final String invalidUserOrPassword = "Usuario o contraseña invalido";
    public static final String dbConnectionFailed = "No se pudo establecer conexión con Base de datos";
    
    //Generic messages
    public static final String Save = "Elemento cargado correctamente";
    public static final String Edit = "Elemento editado correctamente";
    public static final String Delete = "Elemento eliminado correctamente";

    public static final String Warning = "Advertencia";
    //Dialog's messages
    //For product's search in ticket
    public static final String DialogProductNotFound = "Producto no encontrado";
    public static final String DialogProductNotActive = "El producto no se encuentra habilitado";
    public static final String DialogProductNotActiveTitle = "Estado del producto";
    public static final String DialogCheck = new StringBuilder().append("Posibles causas del problema\n")
        .append("1 - La aplicacion ya esta en ejecución\n")
        .append("2 - La sesion fue cerrada hace 20 segundos, espere 20 segundos por favor \n")
        .append("y vuelva a ejecutar la aplicacion.").toString();
    public static final String DialogExit = "¿Esta seguro que desea salir?";
    public static final String DialogCancel = "¿Esta seguro que desea cancelar este panel?";

    //Dialog's generic messages 
    public static final String DialogSave = "Esta seguro que desea guardar ?";
    public static final String DialogDelete = "Esta seguro que desea eliminar ?";
    public static final String DialogConfirmationTitle = "Confirmacion";
    public static final String DialogEmit = "Esta seguro que desea emitir este documento ?";

    //Ticket's dialog.
    public static final String DialogEmitTicket = "Esta seguro que desea emitir ticket ?";

    //Extras messages
    public static final String MeasureAlreadyLoaded = "Este tipo de medida ya se encuentra agregado";
    public static final String StoreAlreadyLoaded = "Este deposito ya se encuentra agregado";
    public static final String ProductNotHasRule = "El producto no tiene cargado una regla para esta medida";
    public static final String FirstSearchProduct = "Primero deberia buscar el producto";
    public static final String CategoryInvalid = "Ingrese una categoria correcta";

    //Short descriptions
    public static final String ShorDescriptionSave = "Presionando este boton guardara el elemento";
    public static final String ShorDescriptionSearch = "Presionando este boton se buscara el elemento especificado";
    public static final String ShorDescriptionDelete = "Presionando este boton borrara el elemento especificado";
    public static final String ShorDescriptionListProduct = "Presionando este boton se abrira la pantalla de busqueda avanzada de listar";
    public static final String ShorDescriptionListGral = "Presionando este boton se listaran los elementos en la tabla derecha";
    public static final String ShorDescriptionEmit = "Presionando este boton se emitira el documento especificado";
    public static final String ShorDescriptionGenerate = "Presionando este boton se generara el documento especificado";
    public static final String ShorDescriptionPlus = "Presionando este boton se generara agregara elemento a tabla";
    public static final String ShorDescriptionLess = "Presionando este boton se eliminara el elemento seleccionado en la tabla";

}
