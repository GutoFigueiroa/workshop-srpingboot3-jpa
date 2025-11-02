package FernandoFigueiroa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FernandoFigueiroa.course.entites.Product;
import FernandoFigueiroa.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> finAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj= repository.findById(id);
		return obj.get();
	}

}
