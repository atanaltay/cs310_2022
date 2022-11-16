package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	@Id
	private String id;
	private String name;
	//Address will be embedded inside Customer documents
	private Address address;
	private int age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String name, Address address,int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Customer(String name, Address address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
