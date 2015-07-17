package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "STOCK")
public class Stock implements Serializable {

    protected Stock() {
    }

    public Stock(String description, double quantity, Measure measure,
            Product product, Store store) {
        this.description = description;
        this.quantity = quantity;
        this.measure = measure;
        this.product = product;
        this.store = store;
    }

    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "stock_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity")
    private double quantity;
    @JoinColumn(name = "measure_id")
    @OneToOne
    private Measure measure;
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

    public double getQuantity() {
        return quantity;
    }

    public Measure getMeure() {
        return measure;
    }

    public Product getProduct() {
        return product;
    }

}
