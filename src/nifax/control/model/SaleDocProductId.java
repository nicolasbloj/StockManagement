package nifax.control.model;

/**
 *
 * @author NB
 */
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class SaleDocProductId implements java.io.Serializable {

    private Product product;
    private SaleDoc saleDoc;

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    public SaleDoc getSaleDoc() {
        return saleDoc;
    }

    public void setSaleDoc(SaleDoc saleDoc) {
        this.saleDoc = saleDoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SaleDocProductId that = (SaleDocProductId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) {
            return false;
        }
        if (saleDoc != null ? !saleDoc.equals(that.saleDoc) : that.saleDoc != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (saleDoc != null ? saleDoc.hashCode() : 0);
        return result;
    }

}
