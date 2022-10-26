package onetomany;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		Address add1 = new Address();
		Address add2 = new Address();
		
		List<Address> addresses = 
				new ArrayList<>();
		
		addresses.add(add1);
		addresses.add(add2);
		
		Customer cust1 
		= new Customer(addresses);
		
		
		
		
	}
	
	
}
