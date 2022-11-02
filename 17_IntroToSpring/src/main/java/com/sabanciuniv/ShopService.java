package com.sabanciuniv;

import java.util.List;

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
