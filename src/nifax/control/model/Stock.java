package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author NB
 */
@Entity
@Table(name = "STOCK")
@AttributeOverrides(
    {
        @AttributeOverride(
            name = "id", column = @Column(name = "stock_id")
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
public class Stock extends ProdRelEntity implements Serializable {

    protected Stock() {
    }

    public Stock(Long id) {
        super(id);
    }

    public Stock(Long id, String description, double quantity, Measure measure,
        Store store) {
        super.id = id;
        super.description = description;
        this.quantity = quantity;
        this.quantityCommitted = 0.0;
        super.measure = measure;
        this.store = store;
    }

    public Stock(String description, double quantity, double quantityCommitted, Measure measure,
        Store store) {
        super.description = description;
        this.quantity = quantity;
        this.quantityCommitted = quantityCommitted;
        super.measure = measure;
        this.store = store;
    }
    

    @Column(name = "quantity")
    private double quantity;
    @Column(name = "quantitycommitted")
    private double quantityCommitted;
    @JoinColumn(name = "store_id")
    @OneToOne
    private Store store;

    public double getQuantity() {
        return quantity;
    }

    public double getQuantityCommitted() {
        return quantityCommitted;
    }

    public Store getStore() {
        return store;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setQuantityCommitted(double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    
}
