package nifax.control.model;

import java.io.Serializable;
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

    public Product(String description, double cost, Category categoryProduct, Iva iva) {
        this.description = description.toUpperCase();
        this.cost = cost;
        this.category = categoryProduct;
        this.iva = iva;

        //generate code
        CodeGenerator codeGenerator = new CodeGenerator(categoryProduct.getDescription());
        code = codeGenerator.createProductCode();
    }

    public Product(Long id, String code, String description, double cost, Category categoryProduct, Iva iva) {
        this.description = description.toUpperCase();
        this.cost = cost;
        this.category = categoryProduct;
        this.iva = iva;
        
        this.id=id;
        this.code=code;
        //CodeGenerator codeGenerator = new CodeGenerator(categoryProduct.getDescription());
        //code = codeGenerator.createProductCode(Integer.parseInt(id.toString()));
        
    }

    public Product(String str, int i) {
        switch (i) {
            case 0:
                this.description = str.toUpperCase();
            case 1:
                this.code = str.toUpperCase();
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<ProductMeasure> productMeasures ;

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

    public void setId(Long id) {
        this.id = id;
    }

}
