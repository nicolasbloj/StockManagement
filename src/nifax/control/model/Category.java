package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "CATEGORY")
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "category_id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
) 
public class Category extends EntityModel implements Serializable {

    protected Category() {
    }

    public Category(String description) {
        super(description);
    }
}
