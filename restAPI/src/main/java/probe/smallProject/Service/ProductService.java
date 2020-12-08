package probe.smallProject.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import probe.smallProject.Model.Product;

import probe.smallProject.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Set<Product> findAll() {
		Iterable<Product> iterable = productRepository.findAll();
		Set<Product> productSet = new HashSet<Product>();
		iterable.forEach(e -> productSet.add(e));
		return productSet;
	}

	public void deleteById(Long id) {
		// TODO check exists, check no orders for this product
		productRepository.deleteById(id);
	}

	public boolean updateProduct(Product product) {
		// TODO adjust return //Exception
		if (productRepository.existsById(product.getProductId())) {
			productRepository.save(product);
			return true;
		}
		return false;
	}

	public boolean saveProduct(Product product) {
		// TODO adjust return //Exception
		if (!productRepository.existsById(product.getProductId())) {
			productRepository.save(product);
			return true;
		}
		return false;
	}
}
