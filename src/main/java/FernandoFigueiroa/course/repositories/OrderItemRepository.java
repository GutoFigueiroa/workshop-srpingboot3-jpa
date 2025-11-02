package FernandoFigueiroa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import FernandoFigueiroa.course.entites.OrderItem;
import FernandoFigueiroa.course.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
