package model;

import java.time.LocalDateTime;

public class Order {

	private int id;
	private OrderItem[] orderItems;
	private LocalDateTime date;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, OrderItem[] orderItems, LocalDateTime date) {
		super();
		this.id = id;
		this.orderItems = orderItems;
		this.date = date;
	}
	
	public String getInfo() {
		
		String retVal = "Order: " + id + "\n-----------\n"; 
		for (OrderItem orderItem : orderItems) {
			retVal += orderItem.getInfo();
		}
		
		retVal+="----------------\n";
		
		return retVal;
		
		
	}
	
	public double getTotalPrice() {
		
		double sum = 0;
		
		for (OrderItem orderItem : orderItems) {
			sum+=orderItem.getItemTotalPrice();
		}
		
		return sum;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
}
