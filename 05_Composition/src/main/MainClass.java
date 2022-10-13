package main;

import model.Adress;
import model.Consultant;
import model.Customer;

public class MainClass {

	public static void main(String[] args) {
		
		Adress cust1Address = new Adress("IST","Bagdat","12");
		
		Adress cust2Address = new Adress("IST","Bagdat","30");
		Adress cust3Address = new Adress("ANK","Esat","30");
		
		Adress[] additionalAddressesCust1 = {cust2Address,cust3Address};
		
		Customer cust1 = new Customer("X Company",
				"Software Debugging", 5, 100,cust1Address,
				additionalAddressesCust1);
		
		Customer cust2 = new Customer("X Company",
				"Network Check", 10, 50,cust1Address,
				additionalAddressesCust1);
		
		cust1.getInfo();
		
		Customer[] customers = {cust1,cust2};
		
		Consultant consultant1 = new Consultant("JAck", customers);
		
		System.out.println("Total Amount Due: " + consultant1.getTotalAmountDue());
		
		
		
	}
	
	
	
}
