package com.sabanciuniv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.repo.ProductRepository;

@Service
public class ShopService {

	private ProductRepository prodRepo;

	public ShopService(ProductRepository prodRepo) {

		this.prodRepo = prodRepo;
	}
	
	
	public List<Product> getAllProducts(){
		return prodRepo.findAllProducts();
	}
	
	
	public void addProduct(Product p) {
		prodRepo.saveProduct(p);
	}
	
	
	
}
