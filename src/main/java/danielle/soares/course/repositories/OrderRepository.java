package danielle.soares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import danielle.soares.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
