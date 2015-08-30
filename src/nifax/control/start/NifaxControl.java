package nifax.control.start;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nifax.control.controller.Authentication;
import nifax.control.model.modeler.CategoryOperation;
import nifax.control.model.modeler.ProductOperation;
import nifax.control.model.modeler.MeasureOperation;
import nifax.control.model.modeler.StoreOperation;
import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.*;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.data.IQueries;
import nifax.control.model.modeler.IvaOperation;
import nifax.control.model.modeler.SaleDocOperation;
import nifax.control.model.modeler.TypeSaleDocOperation;
import nifax.control.util.Control;
import nifax.control.view.frame.FrameMain;

/**
 *
 * @author faka
 */
public class NifaxControl implements IQueries {

    private static final Logger logger = Logger.getLogger(NifaxControl.class.getName());

    public static void main(String[] args) throws InvalidCredentialsException, InitializeSessionException {
        if(new Control().check()){
            Authentication auth = Authentication.getInstance();
            try {
                UserEmployee usr;
                HQLOperation modelOperation = HQLOperation.getInstance();
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

                //Scanner in = new Scanner(System.in);
                String user;
                String pass;
                do {
                    logger.info("Ingresar Usuario");
                    //user = in.next();
                    user = "f4ka";
                    logger.info("Ingresar Password");
                    //pass = in.next();
                    pass="1234";
                } while (!auth.LogIn(new UserEmployee(user, pass)));
                logger.info("El Usuario fue logueado con éxito");
                modelOperation.Insert(auth.getSession());

                //Loading scenario
                //Add Iva
                modelOperation.Insert(new Iva(21));
                modelOperation.Insert(new Iva(10.5));
                //Add categories
                modelOperation.Insert(new Category("AUDIO"));
                modelOperation.Insert(new Category("ILUMINACION"));
                //Add prices
                modelOperation.Insert(new Price("LISTA1", 85));
                modelOperation.Insert(new Price("LISTA2", 75));
                modelOperation.Insert(new Price("LISTA3", 55));
                modelOperation.Insert(new Price("LISTA4", 25));
                modelOperation.Insert(new Price("LISTA5", 5));
                //Add stores
                modelOperation.Insert(new Store("DEPOSITO CENTRAL"));
                modelOperation.Insert(new Store("DEPOSITO ALTERNATIVO"));
                //Add measures
                modelOperation.Insert(new Measure("BULTO"));
                modelOperation.Insert(new Measure("PAQUETE"));
                modelOperation.Insert(new Measure("UNIDAD"));

                //Add type of sale's document
                TypeSaleDocOperation.getInstance().add("TICKET");
                TypeSaleDocOperation.getInstance().add("FACTURA ");
                TypeSaleDocOperation.getInstance().add("FACTURA ELECTRONICA");

                //Get category list from db
                Map<String, Category> CategoryList = CategoryOperation.getInstance().List();
                //Get quantity list from db
                Map<String, Measure> measureList = MeasureOperation.getInstance().List();

                //Get store list from db for stock
                Map<String, Store> storeList = StoreOperation.getInstance().List();

                //Genering ProductMeasure for product - rules.
                List<ProductMeasure> measures = new ArrayList<>();

                //Genering Offers for product 
                List<Offer> offers = new ArrayList<>();

                //Genering Offers for product 
                List<Stock> stocks = new ArrayList<>();

                //Genering Offers for product 
                List<Restoration> restorations = new ArrayList<>();

                measures.add(new ProductMeasure(12, measureList.get("BULTO")));
                measures.add(new ProductMeasure(22, measureList.get("PAQUETE")));

                offers.add(new Offer("Oferta mes mayo", 10, 20, measureList.get("UNIDAD")));
                offers.add(new Offer("Oferta mes mayo", 10, 2, measureList.get("PAQUETE")));

                stocks.add(new Stock("Stock casa central", 200, 0,
                    measureList.get("UNIDAD"),
                    storeList.get("DEPOSITO CENTRAL")));

                stocks.add(new Stock("Stock centro de distribucion", 2, 0,
                    measureList.get("BULTO"),
                    storeList.get("DEPOSITO ALTERNATIVO")));

                restorations.add(new Restoration(
                    "Rep al mes de abril",
                    900.0,
                    560.0,
                    140.0,
                    measureList.get("UNIDAD"),
                    storeList.get("DEPOSITO CENTRAL")
                ));

                restorations.add(new Restoration(
                    "Rep al mes de abril",
                    200.0,
                    160.0,
                    40.0,
                    measureList.get("PAQUETE"),
                    storeList.get("DEPOSITO ALTERNATIVO")
                ));

                //Genering Ivas
                Map<Double, Iva> IvaList = IvaOperation.getInstance().List();

                //Add product
                ProductOperation.getInstance().AddOrUpdate(
                    null,
                    null,
                    "FOCO 12V",
                    12.2,
                    CategoryList.get("AUDIO"),
                    IvaList.get(21.0),
                    true,
                    measures,
                    offers,
                    stocks,
                    restorations);

                //Get category list from db
                Map<String, Product> productList = ProductOperation.getInstance().List();

                //Add Sale.
                double itemQuantity;
                double itemPrice;
                Product itemProduct;

                Set<Item> items = new HashSet<>();

                // Sale Product 1   
                itemQuantity = 240;
                itemPrice = 3.5;
                itemProduct = productList.get("FOCO 12V");

                Item item = new Item(itemQuantity, itemPrice, itemProduct, 0);
                items.add(item);

                Calendar calendar = Calendar.getInstance();

                //Get typSaleDoc list from db
                Map<String, TypeSaleDoc> typeSaleDocList = TypeSaleDocOperation.getInstance().List();

                SaleDocOperation.getInstance().add(calendar.getTime(),
                    usr,
                    typeSaleDocList.get("TICKET"),
                    items
                );

                FrameMain.main(null);

            }catch(InvalidCredentialsException | InitializeSessionException e){
                JOptionPane.showMessageDialog(null, "Algo paso!");
            }
        }else {
            System.exit(0);
        }
    }
}
