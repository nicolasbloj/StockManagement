package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT_MEASURE")
@AssociationOverrides (
        {
            @AssociationOverride(
                    name = "pk.product",
                    joinColumns = @JoinColumn(
                            name = "product_id"
                    )
            ),
            @AssociationOverride (
                    name = "pk.measure",
                    joinColumns = @JoinColumn(
                            name = "measure_id"
                    )
            )
        }
)
public class ProductMeasure implements Serializable {

    public ProductMeasure() {
    }

    private ProductMeasureId pk = new ProductMeasureId();
     private double quantity;

    @EmbeddedId
    public ProductMeasureId getPk() {
        return pk;
    }

    public void setPk(ProductMeasureId pk) {
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
    public Measure getMeasure() {
        return getPk().getMeasure();
    }

    public void setMeasure(Measure measure) {
        getPk().setMeasure(measure);
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

        ProductMeasure that = (ProductMeasure) o;

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
