package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author NB
 */
@Entity
@Table(name = "OFFER")
@AttributeOverrides(
    {
        @AttributeOverride(
            name = "id", column = @Column(name = "offer_id")
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
public class Offer extends ProdRelEntity implements Serializable {

    public Offer() {
    }

    public Offer(Long id) {
        super(id);
    }

    public Offer(String description, double discount, double quantity,
        Measure measure) {
        super.description = description;
        this.discount = discount;
        this.quantity = quantity;
        super.measure = measure;
    }

    public Offer(Long id, String description, double discount, double quantity,
        Measure measure) {
        super.id = id;
        this.description = description;
        this.discount = discount;
        this.quantity = quantity;
        super.measure = measure;
    }

    @Column(name = "discount")
    private double discount;
    @Column(name = "quantity")
    private double quantity;

    public double getDiscount() {
        return discount;
    }

    public double getQuantity() {
        return quantity;
    }

}
