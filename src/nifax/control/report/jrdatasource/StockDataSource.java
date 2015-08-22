package nifax.control.report.jrdatasource;

import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import nifax.control.model.Stock;

/**
 *
 * @author NB
 */
public class StockDataSource implements JRDataSource {

    private final List<Stock> listStock;

    private int indexStock = -1;

    public StockDataSource(List<Stock> listStock) {
        this.listStock = listStock;
    }

    @Override
    public boolean next() throws JRException {
        return ++indexStock < listStock.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {

        Object valor = null;

        if (null != jrf.getName()) {
            switch (jrf.getName()) {
                case "description":
                    valor = listStock.get(indexStock).getProduct().getDescription();
                    break;
                case "quantity":
                    valor = listStock.get(indexStock).getQuantity();
                    break;
                case "quantitycommitted":
                    valor = listStock.get(indexStock).getQuantityCommitted();
                    break;
                case "code":
                    valor = listStock.get(indexStock).getProduct().getCode();
                    break;
                case "cost":
                    valor = listStock.get(indexStock).getProduct().getCost();
                    break;
            }
        }

        return valor;

    }

}
