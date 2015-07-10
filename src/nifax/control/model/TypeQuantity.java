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
@Table(name = "TYPEQUANTITY")
public class TypeQuantity implements Serializable{

    protected TypeQuantity() {
    }

    public TypeQuantity(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "typeQuantity_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.typeQuantity", cascade=CascadeType.ALL)
    private Set<ProductQuantity> productQuantities = new HashSet<ProductQuantity>();

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    
    public void setProductQuantities(Set<ProductQuantity> productQuantities) {
        this.productQuantities = productQuantities;
    }


}
