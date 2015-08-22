package nifax.control.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "RESTORATION")
@AttributeOverrides(
    {
        @AttributeOverride(
            name = "id", column = @Column(name = "restoration_id")
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
public class Restoration extends ProdRelEntity implements Serializable {

    protected Restoration() {
    }

    public Restoration(Long id) {
        super(id);
    }

    public Restoration(Long id, String description, double peak, double midpoint,
        double lowpoint, Measure measure,
        Store store) {
        super.id=id;
        super.description = description;
        this.peak = peak;
        this.midpoint = midpoint;
        this.lowpoint = lowpoint;
        super.measure = measure;
        this.store = store;
    }

    public Restoration(String description, double peak, double midpoint,
        double lowpoint, Measure measure,
        Store store) {
        super.description = description;
        this.peak = peak;
        this.midpoint = midpoint;
        this.lowpoint = lowpoint;
        super.measure = measure;
        this.store = store;
    }

    @Column(name = "peak")
    private double peak;
    @Column(name = "midpoint")
    private double midpoint;
    @Column(name = "lowpoint")
    private double lowpoint;
    @JoinColumn(name = "store_id")
    @OneToOne
    private Store store;

    public double getPeak() {
        return peak;
    }

    public double getMidpoint() {
        return midpoint;
    }

    public double getLowpoint() {
        return lowpoint;
    }

    public Store getStore() {
        return store;
    }

}
