package com.sabanciuniv;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
	@Id private String id;
	private String name;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name) {
		super();

		this.name = name;
	}
	
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
