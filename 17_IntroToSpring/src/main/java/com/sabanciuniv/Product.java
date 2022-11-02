package com.sabanciuniv;

//Entity / Domain / POJO / JavaBean
public class Product {

	private String name;
	private double price;
	private int stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
}
