package probe.smallProject.Model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name = "subject")
public class Subject {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String note;
	
	@ManyToOne
	private Student student;
	
	
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Subject )) return false;
	        return id != null && id.equals(((Subject) o).getId());
	    }
	 
	    @Override
	    public int hashCode() {
	        return getClass().hashCode();
	    }

}
