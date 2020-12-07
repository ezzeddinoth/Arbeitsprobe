package probe.smallProject.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	//@GeneratedValue
	private Long productId;
	private String name;
	private int number;
	private String productType;
	private String describtion;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (!(o instanceof Product)) return false;            
        return productId != null && productId.equals(((Product) o).getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId());
    }
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", number=" + number + ", productType="
				+ productType + ", describtion=" + describtion + "]";
	}
    
    
}
