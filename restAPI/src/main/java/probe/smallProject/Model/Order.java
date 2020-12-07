package probe.smallProject.Model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_")
public class Order {
	@Id
	//@GeneratedValue
	private Long orderId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Person person;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private  Product product;

	public Long getOrderId() {
		return orderId;
	}
	
	private String paid;
	
	private int numberOfItems;

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (!(o instanceof Order)) return false;            
        return orderId != null && orderId.equals(((Order) o).getOrderId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId());
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", person=" + person + ", product=" + product + ", paid=" + paid
				+ ", numberOfItems=" + numberOfItems + "]";
	}

}
