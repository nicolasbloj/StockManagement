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

    public Stock(String description, double quantity, Quantity typeQuantity,
            Product product, Store store) {
        this.description = description;
        this.quantity = quantity;
        this.typeQuantity = typeQuantity;
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
    @JoinColumn(name = "quantity_id")
    @OneToOne
    private Quantity typeQuantity;
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

    public Quantity getTypeQuantity() {
        return typeQuantity;
    }

    public Product getProduct() {
        return product;
    }

}
