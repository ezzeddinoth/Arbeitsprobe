package probe.smallProject.Controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import probe.smallProject.Model.OrderContent;
import probe.smallProject.Service.OrderContentService;


@RestController
@RequestMapping(path = "/orderContent") 
public class OrderContentController {
	
    @Autowired
    OrderContentService orderContentService;
 

    @GetMapping(  path = "/all", 
            produces = "application/json") 
    public Set<OrderContent> allUsers() {

 
        return orderContentService.findAll();
    } 
   
}