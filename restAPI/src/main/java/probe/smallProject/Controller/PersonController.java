package probe.smallProject.Controller;


import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import probe.smallProject.Model.Order;
import probe.smallProject.Model.Person;
import probe.smallProject.Service.PersonService;



@RestController
@RequestMapping(path = "/person") 
public class PersonController {
	
    @Autowired
    PersonService personService;
 

    @GetMapping(  path = "/all", 
            produces = "application/json") 
    public Set<Person> allUsers() { 
        return personService.findAll();
    } 
    
    @GetMapping(  path = "/person", 
            produces = "application/json") 
    public Optional<Person> getOrderById(@RequestParam Long id) {

        return personService.findById(id);
    } 
    @DeleteMapping(path = "/person", 
            produces = "application/json")
    public void deleteById(@RequestParam Long id) {
    	personService.deleteById(id);
 
    }
    
    @PutMapping(path = "/person", 
            produces = "application/json")
    public void updatePerson(@RequestBody Person person) {
    	personService.updatePerson(person);
 
    }
    
    @PostMapping(path = "/person", 
            produces = "application/json")
    public void savePerson(@RequestBody Person  person) {   	
    	personService.savePerson(person);
 
    }
   
   
}