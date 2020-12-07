package probe.smallProject.Controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import probe.smallProject.Model.Student;
import probe.smallProject.Model.Subject;
import probe.smallProject.Service.StudentService;
import probe.smallProject.Service.SubjectService;





@RestController
@RequestMapping(path = "/students") 
public class StudentController {
	
    @Autowired
    StudentService ss;
    @Autowired
    SubjectService sSub;

    @GetMapping(  path = "/allstudents", 
            produces = "application/json") 
    public Set<Student> allUsers() {

 
        return ss.findAll();
    }
    
    @GetMapping(  path = "/2", 
            produces = "application/json") 
    public String allSubject() {
    	
        return "TEST";
    }
    
    @GetMapping(  path = "/3", 
            produces = "application/json") 
    public Set<Subject> TEST() {
 
        return sSub.findAll();
    }
    
    
//    @GetMapping(  path = "/allStudents", 
//            produces = "application/json") 
//    public String allStudents() {
//    	//ss.findAll();
//        return "test";
//    }
  

	  //spring-boot:run
}