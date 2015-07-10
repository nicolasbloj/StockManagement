
package nifax.control.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "RESTORATION")
public class Restoration implements Serializable {

    protected Restoration() {
    }

    public Restoration(String description, double peak, double midpoint,
            double lowpoint, TypeQuantity tipeQuantity, 
            Product product, Store store) {
        this.description = description;
        this.peak = peak;
        this.midpoint = midpoint;
        this.lowpoint = lowpoint;
        this.tipeQuantity = tipeQuantity;
        this.product = product;
        this.store = store;
    }

    

    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "restoration_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    
    @Column(name = "peak")
    private double peak;
    @Column(name = "midpoint")
    private double midpoint;
    @Column(name = "lowpoint")
    private double lowpoint;
    
    @JoinColumn(name = "tyeQuantity_id")
    @OneToOne
    private TypeQuantity tipeQuantity;
    @JoinColumn(name = "product_id")
    @OneToOne
    private Product product;
    @JoinColumn(name = "store_id")
    @OneToOne
    private Store store;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPeak() {
        return peak;
    }

    public double getMidpoint() {
        return midpoint;
    }

    public double getLowpoint() {
        return lowpoint;
    }

    public TypeQuantity getTipeQuantity() {
        return tipeQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public Store getStore() {
        return store;
    }

    
    
    
}
