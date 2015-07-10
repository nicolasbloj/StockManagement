
package nifax.control.model;

/**
 *
 * @author NB
 */

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
 
@Embeddable
public class ProductQuantityId implements java.io.Serializable {
 
    private Product product;
    private TypeQuantity typeQuantity;
 
	@ManyToOne
	public Product getProduct() {
		return product;
	}
 
	public void setProduct(Product product) {
		this.product = product;
	}
 
	@ManyToOne
	public TypeQuantity getTypeQuantity() {
		return typeQuantity;
	}
 
	public void setTypeQuantity(TypeQuantity typeQuantity) {
		this.typeQuantity = typeQuantity;
	}
 
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        ProductQuantityId that = (ProductQuantityId) o;
 
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (typeQuantity != null ? !typeQuantity.equals(that.typeQuantity) : that.typeQuantity != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (typeQuantity != null ? typeQuantity.hashCode() : 0);
        return result;
    }
 
}