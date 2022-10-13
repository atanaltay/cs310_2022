package model;

public class Consultant {
	
	private String name;
	private Customer[] customers;
	
	
	public Consultant() {
		// TODO Auto-generated constructor stub
	}

	

	public Consultant(String name, Customer[] customers) {
		super();
		this.name = name;
		this.customers = customers;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Customer[] getCustomers() {
		return customers;
	}

	public double getTotalAmountDue() {
		
		double sum = 0;
		
		for (Customer customer : customers) {
			sum+= customer.getTotalPrice();
		}
		
		return sum;
		
	}


	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	

}
