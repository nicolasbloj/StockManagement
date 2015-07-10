package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "CategoryProduct")
public class CategoryProduct implements Serializable{

    protected CategoryProduct() {
    }

    public CategoryProduct(String description) {
         this.description = description;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "categoryProduct_id", unique = true, nullable = false)
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
