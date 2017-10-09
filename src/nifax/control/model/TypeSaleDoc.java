package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "TypeSaleDoc")
@AttributeOverrides(
    {
        @AttributeOverride(
            name = "id", column = @Column(name = "typeSaleDoc_id")
        ),
        @AttributeOverride(
            name = "description", column = @Column(name = "description")
        ),}
)
public class TypeSaleDoc extends SimpleEntity implements Serializable {

    protected TypeSaleDoc() {
    }

    public TypeSaleDoc(String description) {
        super(description);
    }

}
