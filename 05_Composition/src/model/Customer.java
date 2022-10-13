package model;

//A class with a default constructor and fields encapsulated
// is called a POJO -> Plain Old Java Object
// Java Bean
public class Customer {
	
	//Default values will be assigned:
	//String -> null
	//int, float, double -> 0
	//boolen -> false
	//Global fields
	private String name;
	private String task;
	private int hours;
	private double unitPrice;
	
	//Customer HAS A address
	//Customer is dependent on Address type
	//The control of address is inverted, who controls 
	//customer must control address too
	//one to one relationship
	private Adress headQuartedAddress;
	
	private Adress[] addresses;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String task, int hours, double unitPrice) {

		this.name = name;
		this.task = task;
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public Customer(String name, String task, int hours, double unitPrice,
			Adress address) {

		this.name = name;
		this.task = task;
		this.hours = hours;
		this.unitPrice = unitPrice;
		this.headQuartedAddress = address;
	}
	
	
	
	
	public Customer(String name, String task, int hours, double unitPrice, Adress headQuartedAddress,
			Adress[] addresses) {
		super();
		this.name = name;
		this.task = task;
		this.hours = hours;
		this.unitPrice = unitPrice;
		this.headQuartedAddress = headQuartedAddress;
		this.addresses = addresses;
	}
	
	public double getTotalPrice() {
		return this.hours*this.unitPrice;
	}
	
	public void getInfo() {
		System.out.println("Customer:" + name);
		System.out.println("City"+ this.headQuartedAddress.getCity());
		System.out.println("Branch 1"+ this.addresses[0].getCity());
	}

	//Encapsulation
	//Setters and Getters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public Adress getHeadQuartedAddress() {
		return headQuartedAddress;
	}
	public void setHeadQuartedAddress(Adress headQuartedAddress) {
		this.headQuartedAddress = headQuartedAddress;
	}
	

}
