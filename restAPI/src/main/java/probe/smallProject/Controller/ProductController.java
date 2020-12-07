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

import probe.smallProject.Model.Person;
import probe.smallProject.Model.Product;
import probe.smallProject.Service.ProductService;


@RestController
@RequestMapping(path = "/product") 
public class ProductController {
	
    @Autowired
    ProductService productService;
 

    @GetMapping(  path = "/all", 
            produces = "application/json") 
    public Set<Product> allUsers() {

 
        return productService.findAll();
    } 
    
    @GetMapping(  path = "/product", 
            produces = "application/json") 
    public Optional<Product> getOrderById(@RequestParam Long id) {
    
        return productService.findById(id);
    } 
    
    @DeleteMapping(path = "/product", 
            produces = "application/json")
    public void deleteById(@RequestParam Long id) {
    	productService.deleteById(id);
    }
    
    @PutMapping(path = "/product", 
            produces = "application/json")
    public void updatePerson(@RequestBody Product product) {
    	productService.updateProduct(product);
 
    }
    
    @PostMapping(path = "/product", 
            produces = "application/json")
    public void savePerson(@RequestBody Product  product) {   	
    	productService.saveProduct(product);
 
    }
    //https://jaxenter.de/spring-boot-tutorial-54020
   
}