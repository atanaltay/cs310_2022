package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Supplier {
	
	@Id
	private String id;
	private String title;
	//Address will be embedded
	private Address address;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(String title, Address address) {
		super();
		this.title = title;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
