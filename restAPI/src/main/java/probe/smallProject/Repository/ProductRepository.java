package probe.smallProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import probe.smallProject.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
