package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Order;
import model.OrderItem;
import model.Product;

public class MainClass {

	public static void main(String[] args) {
		
		
		Product p1 = new Product("TV", 1000, 0.18);
		Product p2 = new Product("Laptop", 1500, 0.18);
		Product p3 = new Product("Tshirt", 100, 0.18);
		Product p4 = new Product("Trousers", 50, 0.18);
		Product p5 = new Product("Shoes", 50, 0.18);
		
		OrderItem itemTV = new OrderItem(p1, 2);
		OrderItem itemLaptop = new OrderItem(p2,5);
		
		
		List<OrderItem> itemsOrder1 = new ArrayList<>();
		itemsOrder1.add(itemTV);
		itemsOrder1.add(itemLaptop);
		
		
		Order order1 = new Order(1, itemsOrder1, LocalDateTime.now());
		
		OrderItem itemTshirt = new OrderItem(p3, 5);
		OrderItem itemShoes = new OrderItem(p5,5);
		
		List<OrderItem> itemsOrder2 = new ArrayList<>();
		itemsOrder2.add(itemTshirt);
		itemsOrder2.add(itemShoes);
		
		Order order2 = new Order(2, 
				itemsOrder2, 
				LocalDateTime.of(2022, 1, 5, 0, 0));
		
		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		
		
		Customer customer = new Customer("jack", orders);
		
		System.out.println(customer.getInfo());
		
		
	}
	
	
	
	
}
