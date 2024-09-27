package danielle.soares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import danielle.soares.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
