package nifax.control.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author NB
 */
@Entity(name = "ForeignKeyAssoAccountEntity")
@Table(name = "ITEM", uniqueConstraints = {
            @UniqueConstraint(columnNames = "item_id")
        }
)
public class Item implements Serializable {

    protected Item() {
    }

    public Item(double quantity, double price, SaleDoc saleDoc, Product product,int it) {
        this.quantity = nifax.control.util.Number.round(quantity);
        this.price = nifax.control.util.Number.round(price);
        this.saleDoc = saleDoc;
        this.product = product;
        this.it=it;
    }

    public Item(double quantity, double price, Product product,int it) {
        this.quantity = nifax.control.util.Number.round(quantity);
        this.price = nifax.control.util.Number.round(price);
        this.product = product;
        this.it=it;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "it")
    private int it;
    
    @ManyToOne
    @JoinColumn(name = "saledoc_id", updatable = false, insertable = false)
    private SaleDoc saleDoc;

    @JoinColumn(name = "product_id")
    @OneToOne
    private Product product;
    
    public Long getId() {
        return id;
    }
    
    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public SaleDoc getSaleDoc() {
        return saleDoc;
    }

    public Product getProduct() {
        return product;
    }

    public int getIt() {
        return it;
    }

}
