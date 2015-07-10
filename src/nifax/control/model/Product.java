package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    protected Product(){
    }
    
    public Product(String description, double cost, 
            CategoryProduct categoryProduct) {
        this.description = description;
        this.cost = cost;
        this.categoryProduct = categoryProduct;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "product_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "cost")
    private double cost;
    @JoinColumn(name = "categoryProduct_id")
    @OneToOne
    private CategoryProduct categoryProduct;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public CategoryProduct getCategoryProduct() {
        return categoryProduct;
    }

    
}
