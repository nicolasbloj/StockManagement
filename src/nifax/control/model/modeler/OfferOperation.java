package nifax.control.model.modeler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nifax.control.data.IQueries;
import nifax.control.model.Measure;
import nifax.control.model.Offer;
import nifax.control.model.Product;

/**
 *
 * @author NB
 */
public class OfferOperation extends HQLOperation implements IQueries {

    private static OfferOperation instance = null;

    protected OfferOperation() {
    }

    public static OfferOperation getInstance() {
        if (instance == null) {
            instance = new OfferOperation();
        }
        return instance;
    }

    public Boolean add(String description, double discount, double quantity,
            Measure measure, Product product) {
        try {

            return Insert(new Offer(description, discount, quantity, measure, product));

        } catch (NullPointerException ex) {
            return Boolean.FALSE;
        }

    }

    public Offer Find(Offer offer) {
        return (Offer) SelectUnique(OfferFilteredByID, offer);
    }

    public Map List() {
        Map<String, Offer> map = new HashMap<>();
        List<Offer> lsp = Select(Offer);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getDescription(), ls);
        });
        return map;
    }

}
