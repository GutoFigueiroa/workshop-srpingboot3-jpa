package FernandoFigueiroa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import FernandoFigueiroa.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
