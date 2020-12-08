package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import probe.smallProject.DTO.OrderDTO;
import probe.smallProject.Model.Order;
import probe.smallProject.Model.Person;
import probe.smallProject.Model.Product;
import probe.smallProject.Repository.OrderRepository;

@Service
public class OrderServiceUseDTO {

	@Autowired
	private OrderRepository orderRepository;

	public Set<OrderDTO> findAll() {
		Iterable<Order> iterable = orderRepository.findAll();
		Set<OrderDTO> orderSet = new HashSet<OrderDTO>();
		iterable.forEach(e -> orderSet.add(ConvertOrderOrderDTO(e)));
		return orderSet;
	}

	private OrderDTO ConvertOrderOrderDTO(Order order) {
		OrderDTO orderDTO = new OrderDTO();
		Person person = order.getPerson();
		Product product = order.getProduct();

		orderDTO.setFirstName(person.getFirstName());
		orderDTO.setLastName(person.getLastName());
		orderDTO.setName(product.getName());
		orderDTO.setProductType(product.getProductType());
		orderDTO.setNumberOfItems(order.getNumberOfItems());
		orderDTO.setPaid(order.getPaid());

		return orderDTO;
	}
}
