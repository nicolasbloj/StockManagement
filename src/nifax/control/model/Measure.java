package nifax.control.model;

import java.io.Serializable;
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

}
