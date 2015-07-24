package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "IVA")
public class Iva implements Serializable{

    protected Iva() {
    }
    
    public Iva(double iva) {
         this.iva = iva;
    }
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "iva_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "iva")
    private double iva;

    public Long getId() {
        return id;
    }
    
    public double getIva() {
        return iva;
    }
}
