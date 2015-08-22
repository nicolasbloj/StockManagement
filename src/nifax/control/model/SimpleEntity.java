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
public class SimpleEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    protected Long id;
    @Column(name = "description")
    protected String description;

    public SimpleEntity(String description) {
        this.description = description.toUpperCase();
    }

    public SimpleEntity(Long id) {
        this.id = id;
    }

    protected SimpleEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
