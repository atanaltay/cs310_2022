package collections;

import java.util.HashSet;
import java.util.Set;

public class MainSetExample {

	public static void main(String[] args) {
		
		//Set -> HashSet
		//Unordered, unique elements
		
		//HashSet<String> names = new HashSet<>();
		
		Set<String> names = new HashSet<>();
		
		names.add("jack");
		names.add("henry");
		names.add("jack");
		names.add("william");
		names.add("jack");
		names.add("morris");
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------------");

		Product p1 = new Product(1,"TV",5000);
		Product p2 = new Product(2,"Laptop",2000);
		Product p3 = new Product(3,"Mouse",100);
		Product p4 = new Product(3,"Mouse",100);
		
		Set<Product> prods = new HashSet<>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		
		for (Product product : prods) {
			System.out.println(product);
		}
		
		// a note about equals
		System.out.println("---------------------");
		
		Product p10 = new Product(3,"Mouse",100);
		Product p11 = new Product(3,"Mouse",100);
		
		System.out.println(p10==p11);
		System.out.println(p10.equals(p11));
		
		
		Product p12 = p11;
		
		System.out.println(p12==p11);
		System.out.println(p12.equals(p11));
		
		
		
		
	}
	
	
	
	
}
