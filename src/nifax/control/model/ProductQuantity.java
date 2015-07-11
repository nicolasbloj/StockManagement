package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT_QUANTITY")
@AssociationOverrides (
        {
            @AssociationOverride(
                    name = "pk.product",
                    joinColumns = @JoinColumn(
                            name = "product_id"
                    )
            ),
            @AssociationOverride (
                    name = "pk.quantity",
                    joinColumns = @JoinColumn(
                            name = "quantity_id"
                    )
            )
        }
)
public class ProductQuantity implements Serializable {

    public ProductQuantity() {
    }

    private ProductQuantityId pk = new ProductQuantityId();
     private double quantity;

    @EmbeddedId
    public ProductQuantityId getPk() {
        return pk;
    }

    public void setPk(ProductQuantityId pk) {
        this.pk = pk;
    }

    @Transient
    public Product getProduct() {
        return getPk().getProduct();
    }

    public void setProduct(Product product) {
        getPk().setProduct(product);
    }

    @Transient
    public Quantity getTypeQuantity() {
        return getPk().getQuantity();
    }

    public void setTypeQuantity(Quantity typeQuantity) {
        getPk().setQuantity(typeQuantity);
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductQuantity that = (ProductQuantity) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
