package probe.smallProject.Controller;


import java.util.Set;
import java.util.Optional;

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
import probe.smallProject.Service.OrderService;




@RestController
@RequestMapping(path = "/order") 
public class OrderController {
	
    @Autowired
    OrderService orderService;
 

    @GetMapping(  path = "/all", 
            produces = "application/json") 
    public Set<Order> allUsers() {

    	orderService.findAll().forEach(item->System.out.println(item));
        return orderService.findAll();
    } 
    
    @GetMapping(  path = "/order", 
            produces = "application/json") 
    public Optional<Order> getOrderById(@RequestParam Long id) {
    
        return orderService.findById( id);
    } 
    
    @DeleteMapping(path = "/order", 
            produces = "application/json")
    public void deleteById(@RequestParam Long id) {
    	orderService.deleteById(id);
 
    }
    
    @PutMapping(path = "/order", 
            produces = "application/json")
    public void updatePerson(@RequestBody Order order) {
    	System.out.println(order);
    	orderService.updateOrder(order);
 
    }
    
    @PostMapping(path = "/order", 
            produces = "application/json")
    public void savePerson(@RequestBody Order  order) {   	
    	System.out.println(order);
    	orderService.saveOrder(order);
 
    }
   
}