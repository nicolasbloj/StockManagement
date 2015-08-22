package nifax.control.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author NB
 */
@MappedSuperclass
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
)

public class ProdRelEntity extends SimpleEntity{

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "measure_id")
    @OneToOne
    protected Measure measure;
    @ManyToOne
    @JoinColumn(name = "product_id", updatable = false, insertable = false)
    protected Product product;

    public ProdRelEntity(Long id) {
        super(id);
    }
    
    protected ProdRelEntity() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Measure getMeasure() {
        return measure;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
    
    
}
