package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
