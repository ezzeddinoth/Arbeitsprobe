package probe.smallProject.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import probe.smallProject.DTO.OrderDTO;
import probe.smallProject.Service.OrderServiceUseDTO;

@RestController
@RequestMapping(path = "/orderDTO")
public class OrderDTOController {

	@Autowired
	OrderServiceUseDTO orderDTOService;

	@GetMapping(path = "/all", produces = "application/json")
	public Set<OrderDTO> allUsers() {
		return orderDTOService.findAll();
	}

}