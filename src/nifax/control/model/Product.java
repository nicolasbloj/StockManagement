package nifax.control.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import nifax.control.controller.CodeGenerator;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    protected Product() {
    }

    public Product(String description, double cost, Category categoryProduct, Iva iva ) {
        this.description = description;
        this.cost = cost;
        this.category = categoryProduct;
        this.iva = iva;

        //generate code
        CodeGenerator codeGenerator = new CodeGenerator(categoryProduct.getDescription());
        code = codeGenerator.createProductCode();
    }

    public Product(String str, int i) {
        switch (i) {
            case 0:
                this.description = str;
            case 1:
                this.code = str;
        }
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "product_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "code")
    private String code;
    @Column(name = "cost")
    private double cost;
    @JoinColumn(name = "category_id")
    @OneToOne
    private Category category;
    @JoinColumn(name = "iva_id")
    @OneToOne
    private Iva iva;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product", cascade=CascadeType.ALL)
    private Set<ProductMeasure> productMeasures = new HashSet<ProductMeasure>();

    public Long getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }

    public Iva getIva() {
        return iva;
    }

    public Set<ProductMeasure> getMeasures() {
        return productMeasures;
    }

    public void setProductMeasures(Set<ProductMeasure> productMeasures) {
        this.productMeasures = productMeasures;
    }

    public String getCode() {
        return code;
    }

    
}
