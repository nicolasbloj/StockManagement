package nifax.control.start;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;
import nifax.control.controller.Authentication;
import nifax.control.controller.ProductController;
import nifax.control.controller.UtilController;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.hibernate.HibernateUtil;
import nifax.control.model.*;
import nifax.control.model.modeler.ModelOperation;

/**
 *
 * @author faka
 */
public class NifaxControl {

    private static final Logger logger = Logger.getLogger(NifaxControl.class.getName());

    public static void main(String[] args) throws InvalidCredentialsException, InitializeSessionException {
        Authentication auth = Authentication.getInstance();
        try {
            UserEmployee usr;
            ModelOperation modelOperation = ModelOperation.getInstance();
            usr = new UserEmployee(
                    "f4ka",
                    "1234",
                    new Employee(
                            "Facundo",
                            "Gomez Algazan",
                            "+5493816534690"
                    )
            );
            modelOperation.Insert(usr);
            // the following lines will be added temporally til we have an UI to 
            // enter the required fields
            Scanner in = new Scanner(System.in);
            String user;
            String pass;
            do {
                logger.info("Ingresar Usuario");
                user = in.next();
                logger.info("Ingresar Password");
                pass = in.next();
            } while (!auth.LogIn(user, pass));
            logger.info("El Usuario fue logueado con éxito");
            modelOperation.Insert(auth.getSession());

            ProductController productController = ProductController.getInstance();
            UtilController utilController = UtilController.getInstance();

            //              --SIMPLE LOADS--
            //CATEGORIES
            modelOperation.Insert(new CategoryProduct("Audio"));
            modelOperation.Insert(new CategoryProduct("Iluminacion"));
            //PRICE LISTS
            modelOperation.Insert(new PriceList("Lista1", 1.85));
            modelOperation.Insert(new PriceList("Lista2", 1.75));
            modelOperation.Insert(new PriceList("Lista3", 1.55));
            modelOperation.Insert(new PriceList("Lista4", 1.25));
            modelOperation.Insert(new PriceList("Lista5", 1.05));
            //STORES
            modelOperation.Insert(new Store("Deposito central"));
            modelOperation.Insert(new Store("Deposito alternativo"));
            //TYPES QUANTITIES
            modelOperation.Insert(new TypeQuantity("Bulto"));
            modelOperation.Insert(new TypeQuantity("Unidad"));

            //PRODUCT
            String productDesc = "Foco 12V";
            double cost = 12.4;
            long categoryId = 1;

            long typeQuantityId = 1;
            long quantity = 12;

            Product product = productController.buildProduct(productDesc, cost, categoryId);

            if (product != null) {
                TypeQuantity typeQuantity = utilController.getTypeQuantity(typeQuantityId);
                if (typeQuantity != null) {

                    Set<ProductQuantity> productQuantities = new HashSet<ProductQuantity>();
                    ProductQuantity productQuantity = new ProductQuantity();
                    productQuantity.setProduct(product);
                    productQuantity.setTypeQuantity(typeQuantity);
                    productQuantity.setQuantity(quantity);
                    productQuantities.add(productQuantity);
                    product.setProductQuantities(productQuantities);

                    if (modelOperation.Insert(product)) {
                        logger.info("Producto insertado correctamente");
                    } else {
                        logger.info("Error al insertar producto");
                    }
                } else {
                    logger.info("Error al traer tipo de cantidad");
                }
            } else {
                logger.info("Error al generar el producto");
            }
        } finally {
            Authentication.getInstance().LogOut(Authentication.getInstance().getSession());
            HibernateUtil.getSessionFactory().close();
        }
    }
}
