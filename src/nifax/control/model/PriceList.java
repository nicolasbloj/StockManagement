package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author NB
 */

@Entity
@Table(name = "PRICE_LIST")
public class PriceList implements Serializable{

    protected PriceList() {
    }

    public PriceList(String description,double profit) {
        this.description = description;
        this.profit=profit;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "proceList_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "profit")
    private double profit;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getProfit() {
        return profit;
    }

}
