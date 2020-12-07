package probe.smallProject.Service;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.Subject;
import probe.smallProject.Repository.SubjectRepository;

@Service
public class SubjectService {
	
	@PersistenceContext
    EntityManager em;
	
	@Autowired
	private SubjectRepository  sr;
	
    
    @PostConstruct
    public void init() {
    	
    
    }   

    public Set<Subject> findAll() {
    	Iterable<Subject> iterable = sr.findAll();
    	Set<Subject> studentSet = new HashSet<Subject>();
        iterable.forEach(e-> studentSet.add(e));
    	return studentSet;
    }
    public void save(Subject sbj) {
    	sr.save(sbj);
    	System.out.println(sbj.getName());
    	
    }
     
    public Optional<Subject> findById(Long id){
        Optional<Subject> sbj= sr.findById(id);
        return sbj;
    }
    
    public void deleteById(Long id){
         sr.deleteById(id);

    }

}