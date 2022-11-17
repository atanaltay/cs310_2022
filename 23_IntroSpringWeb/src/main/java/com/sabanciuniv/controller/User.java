package com.sabanciuniv.controller;

public class User {

	String username;
	String city;
	
	public User() {}
	
	public User(String username, String city) {
		super();
		this.username = username;
		this.city = city;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
