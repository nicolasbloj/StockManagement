package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable{

    protected Category() {
    }
    public Category(String description) {
         this.description = description;
    }
    public Category(Long id, String description) {
         this.description = description;
         this.id = id;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "category_id", unique = true, nullable = false)
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
