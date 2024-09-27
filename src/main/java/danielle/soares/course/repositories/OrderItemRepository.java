package danielle.soares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import danielle.soares.course.entities.OrderItem;
import danielle.soares.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
