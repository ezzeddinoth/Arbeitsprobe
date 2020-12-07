package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.OrderContent;

@Repository
public interface OrderContentRepository extends CrudRepository<OrderContent, Long> {

}
