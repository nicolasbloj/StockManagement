package nifax.control.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "MEASURE")
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "measure_id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
)
public class Measure extends EntityModel implements Serializable {

    protected Measure() {
    }

    public Measure(String description) {
        super(description);
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.measure", cascade = CascadeType.ALL)
    private Set<ProductMeasure> productMeasures = new HashSet<ProductMeasure>();

    public void setProductMeasures(Set<ProductMeasure> productMeasures) {
        this.productMeasures = productMeasures;
    }

    public Set<ProductMeasure> getProductMeasures() {
        return productMeasures;
    }

}
