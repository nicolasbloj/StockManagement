package nifax.control.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "STORE")
public class Store implements Serializable {

    protected Store() {
    }

    public Store(String descriptio){
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "store_id", unique = true, nullable = false)
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

