package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "OFFER")
public class Offer implements Serializable {

    protected Offer() {
    }

    public Offer(String description, double discount, double quantity,
            TypeQuantity tipeQuantity, Product product) {
        this.description = description;
        this.discount = discount;
        this.quantity = quantity;
        this.tipeQuantity = tipeQuantity;
        this.product = product;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "offer_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "discount")
    private double discount;
    @Column(name = "quantity")
    private double quantity;
    @JoinColumn(name = "tyeQuantity_id")
    @OneToOne
    private TypeQuantity tipeQuantity;
    @JoinColumn(name = "product_id")
    @OneToOne
    private Product product;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }

    public double getQuantity() {
        return quantity;
    }

    public TypeQuantity getTipeQuantity() {
        return tipeQuantity;
    }

    public Product getProduct() {
        return product;
    }

}
