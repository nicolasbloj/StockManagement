package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT_MEASURE")
public class ProductMeasure implements Serializable {

    public ProductMeasure() {
    }

    public ProductMeasure(Long id) {
        this.id = id;
    }

    public ProductMeasure(double quantity, Product product, Measure measure) {
        this.quantity = quantity;
        this.product = product;
        this.measure = measure;
    }

    public ProductMeasure(double quantity, Measure measure) {
        this.quantity = quantity;
        this.measure = measure;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_measure_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "quantity")
    private double quantity;
    @ManyToOne
    @JoinColumn(name = "product_id", updatable = false, insertable = false)
    private Product product;
    @JoinColumn(name = "measure_id")
    @OneToOne
    private Measure measure;

    public Long getId() {
        return id;
    }

    public double getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
