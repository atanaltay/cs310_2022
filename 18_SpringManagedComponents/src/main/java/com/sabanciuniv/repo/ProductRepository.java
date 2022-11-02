package com.sabanciuniv.repo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Product;

//DAO Object
@Repository
public class ProductRepository {

	private Logger logger = LoggerFactory.getLogger(ProductRepository.class);
	
	private List<Product> prods = new ArrayList<>();
	
	public ProductRepository() {
		logger.info("Product Repo Constructor Called");
	}
	
	@PostConstruct
	public void init() {
		
		logger.info("Product Repo Post Construct called");
		prods.add(new Product("TV", 5000, 100));
		prods.add(new Product("Laptop", 2000, 100));
		prods.add(new Product("Mouse", 100, 100));
		prods.add(new Product("Keyboard", 150, 100));
		prods.add(new Product("Stand", 50, 100));
		
		
	}
	
	public void saveProduct(Product p) {
		prods.add(p);
	}
	
	public List<Product> findAllProducts(){
		

		return prods;
		
	}
	
	
}
