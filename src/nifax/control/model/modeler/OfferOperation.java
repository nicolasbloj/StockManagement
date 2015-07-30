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

    //method list - not use Map<String,Stock> because the stock's description is not unique - use Map<Long,Offer>
    public Map List() {
        Map<Long, Offer> map = new HashMap<>();
        List<Offer> lsp = Select(Offer);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getId(), ls);
        });
        return map;
    }

    public Map ListByParameter(String parameter, Object value) {
        Map<Long, Offer> map = new HashMap<>();
        List<Offer> lsp = Select(OfferFilteredByProduct, parameter, value);
        lsp.stream().forEach((ls) -> {
            map.put(ls.getId(), ls);
        });
        return map;
    }

}
