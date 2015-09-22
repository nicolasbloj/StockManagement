package nifax.control.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import nifax.control.controller.CodeGenerator;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRODUCT")
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "product_id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
)
public class Product extends SimpleEntity implements Serializable {

    protected Product() {
    }
    
    public Product(Long id) {
        super.id = id;
    }

    public Product(String description, double cost, Category categoryProduct, Iva iva,Boolean active) {
        this.description = description.toUpperCase();
        this.cost = nifax.control.util.Number.round(cost);
        this.category = categoryProduct;
        this.iva = iva;
        this.active=active;

        //generate code
        CodeGenerator codeGenerator = new CodeGenerator(categoryProduct.getDescription());
        code = codeGenerator.createProductCode();
    }

    public Product(Long id, String code, String description, double cost, Category categoryProduct, Iva iva,Boolean active) {
        this.description = description.toUpperCase();
        this.cost = nifax.control.util.Number.round(cost);
        this.category = categoryProduct;
        this.iva = iva;
        this.active=active;
        this.id = id;
        this.code = code;
        
    }

    public Product(String str, int i) {
        switch (i) {
            case 0:
                this.description = str.toUpperCase();
            case 1:
                this.code = str.toUpperCase();
        }
    }

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
    private Set<ProductMeasure> productMeasures;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<Offer> offers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<Stock> stocks;

    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Set<Restoration> restorations;

    @Column(name="active")
    private Boolean active;
    
    public double getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }

    public Iva getIva() {
        return iva;
    }

    public Set<ProductMeasure> getProductMeasures() {
        return productMeasures;
    }

    public void setProductMeasures(Set<ProductMeasure> productMeasures) {
        this.productMeasures = productMeasures;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    public Set<Restoration> getRestorations() {
        return restorations;
    }

    public void setRestorations(Set<Restoration> restorations) {
        this.restorations = restorations;
    }

    public String getCode() {
        return code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    
}
