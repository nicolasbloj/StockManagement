package nifax.control.model;

/**
 *
 * @author NB
 */
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProductMeasureId implements java.io.Serializable {

    private Product product;
    private Measure measure;

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductMeasureId that = (ProductMeasureId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) {
            return false;
        }
        if (measure != null ? !measure.equals(that.measure) : that.measure != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (measure != null ? measure.hashCode() : 0);
        return result;
    }

}
