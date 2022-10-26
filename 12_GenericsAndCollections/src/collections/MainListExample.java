package collections;

import java.util.ArrayList;
import java.util.List;

public class MainListExample {

	public static void main(String[] args) {
		
		
		//Lists are ordered data structures
		//ArrayList -> Supertype s List
		//Similar to Python List
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("jack");
		names.add("john");
		names.add("william");
		names.add("henry");
		
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		System.out.println("-------------------------");
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----------------------------");
		names.remove(0);
		names.remove("john");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("------------------------------");
		//Suggestion -> define them polymorphically
		
		
		List<String> names2 = new ArrayList<>();
		
		names2.add("jack");
		names2.add("john");
		names2.add("william");
		names2.add("henry");
		
		System.out.println(names2.get(0));
		System.out.println(names2.get(2));
		System.out.println("-------------------------");
		
		for (String name : names2) {
			System.out.println(name);
		}
		System.out.println("----------------------------");
		names2.remove(0);
		names2.remove("john");
		for (String name : names2) {
			System.out.println(name);
		}
		
		System.out.println("--------------------");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(200);
		numbers.add(200);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("----------------------");
		
		Product p1 = new Product(1,"TV",5000);
		Product p2 = new Product(2,"Laptop",2000);
		Product p3 = new Product(3,"Mouse",100);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println("------------------------");
		
		

		
		
		
	}
	
}
