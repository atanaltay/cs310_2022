package com.sabanciuniv.model;

//Entity
public class Plane {

	private String name;
	private String type;
	
	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
