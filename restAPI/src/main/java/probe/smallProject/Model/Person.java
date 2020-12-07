package probe.smallProject.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "person")
public class Person {
	

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long personId;
	private String firstName;
	private String lastName;
    
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	@Override
	    public boolean equals(Object o) {
	        if (this == o) return true;             
	        if (!(o instanceof Person)) return false;            
	        return personId != null && personId.equals(((Person) o).getPersonId());
	    }

	@Override
	public int hashCode() {
	        return Objects.hash(getPersonId());
	    }
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
