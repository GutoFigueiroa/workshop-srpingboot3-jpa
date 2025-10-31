package FernandoFigueiroa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import FernandoFigueiroa.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
