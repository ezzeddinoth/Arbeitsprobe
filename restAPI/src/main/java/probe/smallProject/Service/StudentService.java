package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.Student;
import probe.smallProject.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository  sr;
	
    
    @PostConstruct
    public void init() {
    
    }   

    public Set<Student> findAll() {
    	System.out.println(sr);
    	Iterable<Student> iterable = sr.findAll();
    	Set<Student> studentSet = new HashSet<Student>();
        iterable.forEach(e-> studentSet.add(e));
    	return studentSet;
    }
    public void save(Student std) {
    	sr.save(std);
    	System.out.println(std.getName());
    	
    }
     
    public Optional<Student> findById(Long id){
        Optional<Student> std= sr.findById(id);
        return std;
    }
    
    public void deleteById(Long id){
         sr.deleteById(id);

    }

//    Student findEzz() {
//    	return sr.someQuery();
//    }
   
    

}
