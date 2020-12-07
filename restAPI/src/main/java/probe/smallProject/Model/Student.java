package probe.smallProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "student")
public class Student {
	

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	
	

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o)
	            return true;
	             
	        if (!(o instanceof Student))
	            return false;
	             
	        return
	            id != null &&
	           id.equals(((Student) o).getId());
	    }
	    @Override
	    public int hashCode() {
	        return getClass().hashCode();
	    }
	
	

}
