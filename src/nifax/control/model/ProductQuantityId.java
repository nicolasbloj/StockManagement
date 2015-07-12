package nifax.control.model;

/**
 *
 * @author NB
 */
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProductQuantityId implements java.io.Serializable {

    private Product product;
    private Quantity quantity;

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductQuantityId that = (ProductQuantityId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) {
            return false;
        }
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

}
