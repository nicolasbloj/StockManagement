package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "TYPE_QUANTITY")
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

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
