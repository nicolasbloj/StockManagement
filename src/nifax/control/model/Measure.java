package nifax.control.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "MEASURE")
public class Measure implements Serializable{

    protected Measure() {
    }

    public Measure(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "measure_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.measure", cascade=CascadeType.ALL)
    private Set<ProductMeasure> productMeasures = new HashSet<ProductMeasure>();

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
        
    public void setProductMeasures(Set<ProductMeasure> productMeasures) {
        this.productMeasures = productMeasures;
    }

    public Set<ProductMeasure> getProductMeasures() {
        return productMeasures;
    }
    
}
