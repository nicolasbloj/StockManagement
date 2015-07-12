package nifax.control.start;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;
import nifax.control.controller.Authentication;
import nifax.control.controller.Products;
import nifax.control.controller.Stocks;

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

            Products productController = Products.getInstance();

            Stocks stockController  =  Stocks.getInstance();
            
            //              --SIMPLE LOADS--
            //CATEGORIES
            modelOperation.Insert(new Category("Audio"));
            modelOperation.Insert(new Category("Iluminacion"));
            //PRICE LISTS
            modelOperation.Insert(new Price("Lista1", 1.85));
            modelOperation.Insert(new Price("Lista2", 1.75));
            modelOperation.Insert(new Price("Lista3", 1.55));
            modelOperation.Insert(new Price("Lista4", 1.25));
            modelOperation.Insert(new Price("Lista5", 1.05));
            //STORES
            modelOperation.Insert(new Store("Deposito central"));
            modelOperation.Insert(new Store("Deposito alternativo"));
            //TYPES QUANTITIES
            modelOperation.Insert(new Quantity("Bulto"));
            modelOperation.Insert(new Quantity("Paquete"));

            //PRODUCT
            String productDesc = "Foco 12V";
            double cost = 76.40;
            long categoryId = 1;

            Product product = productController.buildProduct(productDesc, cost, categoryId);

            if (product != null) {
                long quantityId = 1;
                Quantity typeQuantity = stockController.getTypeQuantity(quantityId);
                if (typeQuantity != null) {
                    long quantity = 12;
                    Set<ProductQuantity> productQuantities = new HashSet<ProductQuantity>();
                    ProductQuantity productQuantity = new ProductQuantity();
                    productQuantity.setProduct(product);
                    productQuantity.setTypeQuantity(typeQuantity);
                    productQuantity.setQuantity(quantity);
                    productQuantities.add(productQuantity);
                    product.setProductQuantities(productQuantities);

                    if (modelOperation.Insert(product)) {
                        logger.info("Producto insertado correctamente");
                        //STOCK
                        String description="STOCK";
                        long productId=1;
                        double quantityStock=500;
                        long typeQuantityStock=1;
                        long store=1;
                        
                        quantityId=1;
                        
                        Stock stock = stockController.buildStock(description, 
                        quantityStock, quantityId, productId, store);
                        
                        if(modelOperation.Insert(stock)){
                        logger.info("Stock insertado correctamente");
                        }else
                            logger.info("Stock insertado correctamente");
                        
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
