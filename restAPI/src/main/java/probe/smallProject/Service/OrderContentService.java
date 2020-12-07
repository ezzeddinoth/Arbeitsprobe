package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.OrderContent;
import probe.smallProject.Repository.OrderContentRepository;



@Service
public class OrderContentService {
	
	@Autowired
	private OrderContentRepository  orderContentRepository;
	
  

    public Set<OrderContent> findAll() {
    	Iterable<OrderContent> iterable = orderContentRepository.findAll();
    	Set<OrderContent> personSet = new HashSet<OrderContent>();
        iterable.forEach(e-> personSet.add(e));
    	return personSet;
    }

}