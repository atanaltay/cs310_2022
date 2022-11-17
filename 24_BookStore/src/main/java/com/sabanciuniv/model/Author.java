package com.sabanciuniv.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Author {

	@Id private String id;
	
	private String name;
	private String lastName;
	private int age;
	
	
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Author(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}



	public Author(String id, String name, String lastName,int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}



	public Author(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
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



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
}
