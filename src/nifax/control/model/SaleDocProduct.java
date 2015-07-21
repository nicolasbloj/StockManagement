package nifax.control.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author NB
 */
@Entity
@Table(name = "SALEDOC_PRODUCT")
@AssociationOverrides(
        {
            @AssociationOverride(
                    name = "pk.product",
                    joinColumns = @JoinColumn(
                            name = "product_id"
                    )
            ),
            @AssociationOverride(
                    name = "pk.saleDoc",
                    joinColumns = @JoinColumn(
                            name = "saledoc_id"
                    )
            )
        }
)

public class SaleDocProduct {

    public SaleDocProduct() {
    }

    private SaleDocProductId pk = new SaleDocProductId();
    private double quantity;
    private double price;

    @EmbeddedId
    public SaleDocProductId getPk() {
        return pk;
    }

    public void setPk(SaleDocProductId pk) {
        this.pk = pk;
    }

    @Transient
    public Product getProduct() {
        return getPk().getProduct();
    }

    public void setProduct(Product product) {
        getPk().setProduct(product);
    }

    @Transient
    public SaleDoc getSaleDoc() {
        return getPk().getSaleDoc();
    }

    public void setSaleDoc(SaleDoc saleDoc) {
        getPk().setSaleDoc(saleDoc);
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductMeasure that = (ProductMeasure) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
