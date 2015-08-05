package nifax.control.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author NB
 */
@MappedSuperclass
public class EntityModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "description")
    private String description;

    public EntityModel(String description) {
        this.description = description;
    }

    public EntityModel(Long id) {
        this.id = id;
    }

    protected EntityModel() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
