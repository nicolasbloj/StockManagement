package nifax.control.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author NB
 */
@Entity(name = "ForeignKeyAssoEntity")
@Table(name = "SALEDOC",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "saledoc_id"),
            @UniqueConstraint(columnNames = "date")
        }
)
public class SaleDoc implements Serializable {

    protected SaleDoc() {
    }

    public SaleDoc(Date ticketDate, UserEmployee user, TypeSaleDoc typeSaleDoc) {
        this.ticketDate = ticketDate;
        this.user = user;
        this.typeSaleDoc = typeSaleDoc;
    }

    public SaleDoc(Date ticketDate, UserEmployee user, TypeSaleDoc typeSaleDoc, Set<Item> items) {
        this.ticketDate = ticketDate;
        this.user = user;
        this.typeSaleDoc = typeSaleDoc;
        this.items = items;
    }

        
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "saledoc_id", unique = true, nullable = false)
    private long id;
    @Column(name = "date")
    private Date ticketDate;
    @JoinColumn(name = "user_id")
    @OneToOne
    private UserEmployee user;
    @OneToOne
    @JoinColumn(name = "typeSaleDoc_id")
    private TypeSaleDoc typeSaleDoc;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "saledoc_id")
    private Set<Item> items ;

    public long getId() {
        return id;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public UserEmployee getUser() {
        return user;
    }

    public TypeSaleDoc getTypeSaleDoc() {
        return typeSaleDoc;
    }

    public Set<Item> getItems() {
        return items;
    }

}
