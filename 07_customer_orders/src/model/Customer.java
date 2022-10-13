package model;

public class Customer {
	
	private String name;
	private Order[] orders;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, Order[] orders) {
		super();
		this.name = name;
		this.orders = orders;
	}
	
	public String getInfo() {
		String retVal = "Customer:\n";
		retVal += "Orders:\n";
		
		for (Order order : orders) {
			
			retVal+= order.getInfo();
			
		}
		
		retVal+="The total of all orders is " + getTotalOrdersAmount();
		
		return retVal;
	}

	public double getTotalOrdersAmount() {
		
		double sum = 0;
		for (Order order : orders) {
			sum+=order.getTotalPrice();
		}
		
		return sum;
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	

}
