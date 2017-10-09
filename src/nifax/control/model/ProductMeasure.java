package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT_MEASURE")
@AttributeOverrides(
    {
        @AttributeOverride(
            name = "id", column = @Column(name = "product_measure_id")
        ),
        @AttributeOverride(
            name = "description", column = @Column(name = "description")
        ),
        @AttributeOverride(
            name = "product_id", column = @Column(name = "product_id")
        ),
        @AttributeOverride(
            name = "measure_id", column = @Column(name = "measure_id")
        )
    }
)
public class ProductMeasure extends ProdRelEntity implements Serializable {

    protected ProductMeasure() {
    }

    public ProductMeasure(Long id) {
        super(id);
    }

    public ProductMeasure(double quantity, Product product, Measure measure) {
        this.quantity = nifax.control.util.Number.round(quantity);
        this.product = product;
        this.measure = measure;
    }

    public ProductMeasure(Long id, double quantity, Measure measure) {
        super.id = id;
        this.quantity = nifax.control.util.Number.round(quantity);
        super.measure = measure;
    }

    public ProductMeasure(double quantity, Measure measure) {
        this.quantity = nifax.control.util.Number.round(quantity);
        super.measure = measure;
    }

    @Column(name = "quantity")
    private double quantity;

    public double getQuantity() {
        return quantity;
    }

}
