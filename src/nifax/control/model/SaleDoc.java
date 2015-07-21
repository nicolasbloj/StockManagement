package nifax.control.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "SALEDOC")
public class SaleDoc implements Serializable {
    
    protected SaleDoc() {
    }

    public SaleDoc(Date ticketDate,UserEmployee user,TypeSaleDoc typeSaleDoc) {
        this.ticketDate = ticketDate;
        this.user=user;
        this.typeSaleDoc=typeSaleDoc;
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
    @JoinColumn(name = "typpeSaleDoc_id")
    private TypeSaleDoc typeSaleDoc;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.saleDoc", cascade=CascadeType.ALL)
    private Set<SaleDocProduct> saleDocProducts = new HashSet<SaleDocProduct>();

    
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

    public Set<SaleDocProduct> getSaleDocProducts() {
        return saleDocProducts;
    }

    public void setSaleDocProducts(Set<SaleDocProduct> saleDocProducts) {
        this.saleDocProducts = saleDocProducts;
    }
    
}
