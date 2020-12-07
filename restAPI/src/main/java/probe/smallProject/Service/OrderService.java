package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.Order;
import probe.smallProject.Repository.OrderRepository;



@Service
public class OrderService {
	
	@Autowired
	private OrderRepository  orderRepository;
	
  

    public Set<Order> findAll() {
    	Iterable<Order> iterable = orderRepository.findAll();
    	Set<Order> personSet = new HashSet<Order>();
        iterable.forEach(e-> personSet.add(e));
    	return personSet;
    }
    
    
    public boolean  deleteById(Long id) {
    	//TODO check exists, check if needed
    	orderRepository.deleteById(id);	  
    	return true; //check
    }
    
    public boolean updateOrder(Order order) {
    	//TODO adjust return //Exception
    	if(orderRepository.existsById(order.getOrderId())) {
    		orderRepository.save(order); 
    		return true;
    	}
    	return false;
    }
    
    public boolean saveOrder(Order order) {
    	//TODO adjust return //Exception
    	if(!orderRepository.existsById(order.getOrderId())) {
    		orderRepository.save(order); 
    		return true;
    	}
    	return false;
    }
    


}