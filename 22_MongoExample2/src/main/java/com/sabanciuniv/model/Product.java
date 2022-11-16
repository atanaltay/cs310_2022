package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private String id;
	//Normalized model
	@DBRef
	private Supplier supplier;
	private String name;
	private double price;
	
	public Product() {
		
	}
	
	public Product(String id, Supplier supplier, String name, double price) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.name = name;
		this.price = price;
	}
	public Product(Supplier supplier, String name, double price) {
		super();
		this.supplier = supplier;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
