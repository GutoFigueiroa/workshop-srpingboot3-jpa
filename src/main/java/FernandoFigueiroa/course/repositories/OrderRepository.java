package FernandoFigueiroa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import FernandoFigueiroa.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
