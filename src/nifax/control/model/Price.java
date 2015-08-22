package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "PRICE")
@AttributeOverrides(
        {
            @AttributeOverride(
                    name = "id", column = @Column(name = "price_id")
            ),
            @AttributeOverride(
                    name = "description", column = @Column(name = "description")
            ),
        }
)
public class Price extends SimpleEntity implements Serializable {

    protected Price() {
    }

    public Price(String description, double profit) {
        super(description);
        this.profit = profit;
    }

    public Price(Long id) {
        super(id);
    }

    @Column(name = "profit")
    private double profit;

    public double getProfit() {
        return profit;
    }

}
