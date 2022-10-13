package main;

import java.time.LocalDateTime;

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
		
		//Customer 1 from X company wants to order 
		//2 TV's 5 Laptop's
		
		//Customer 1 from X company later wants to order 
				//5 Tshirts's and 5 Shoes's
		
		OrderItem itemTV = new OrderItem(p1, 2);
		OrderItem itemLaptop = new OrderItem(p2,5);
		
		Order orderCustomer1 = new Order(1, new OrderItem[]{itemTV,itemLaptop},
				LocalDateTime.now());
		
		
		OrderItem itemTshirt = new OrderItem(p3, 5);
		OrderItem itemShoes = new OrderItem(p5,5);
		Order orderCustomerClothing = new Order(2, 
				new OrderItem[] {itemTshirt,itemShoes}, 
				LocalDateTime.of(2022, 1, 5, 0, 0));
		
		Customer customer1 = new Customer("X Company", 
				new Order[] {orderCustomer1,orderCustomerClothing});
		
		
		System.out.println(customer1.getInfo());
		
		
		
		
	}
	
	
}
