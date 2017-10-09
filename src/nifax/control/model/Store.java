package nifax.control.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "STORE")
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "store_id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
)
public class Store extends SimpleEntity implements Serializable {

    protected Store() {
    }

    public Store(String description) {
        super(description);
    }

    public Store(long id) {
        super(id);
    }

}
