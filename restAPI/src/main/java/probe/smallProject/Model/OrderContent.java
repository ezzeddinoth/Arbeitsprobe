package probe.smallProject.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_content")
public class OrderContent {
	
	@Id
	private Long orderContentId;
	
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;
	

	@ManyToOne
	private  Product product;
	
	private int numberOfItems;
	

	
	public Long getOrderContentId() {
		return orderContentId;
	}

	public void setOrderContentId(Long orderContentId) {
		this.orderContentId = orderContentId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderContent )) return false;
        return (orderContentId != null) && orderContentId.equals(((OrderContent) o).getOrderContentId());
    }
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
	

}
