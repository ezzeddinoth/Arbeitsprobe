package probe.smallProject.Controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import probe.smallProject.Service.LoginService;




@RestController
@RequestMapping(path = "/login1") 
public class LoginController {
	
    @Autowired
    LoginService loginService;
 

   
    
    @GetMapping(  path = "/credentials", 
            produces = "application/json") 
    public String getRolle(@RequestParam String email, @RequestParam String password) {
        System.out.println(email);
        return loginService.getRolle(email, password);
    } 
    
    
    @GetMapping(  path = "/login", 
            produces = "application/json") 
    public boolean emailexists(@RequestParam String email) {
    
        return loginService.emailExists(email);
    } 
    
   
   
}