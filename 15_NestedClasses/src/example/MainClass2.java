package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class MainClass2 {

	public static void main(String[] args) {
		
		
		Product p1 = new Product("TV", 1000, 0.18);
		Product p2 = new Product("Laptop", 1500, 0.18);
		Product p3 = new Product("Tshirt", 100, 0.18);
		Product p4 = new Product("Trousers", 50, 0.18);
		Product p5 = new Product("Shoes", 50, 0.18);
		
		List<Product> products = new ArrayList<>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
	
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println("--------------");
		
		products.forEach(new Consumer<Product>() {

			@Override
			public void accept(Product t) {
				
				System.out.println(t.getName());
				
			}
			
			
			
		});
		
		System.out.println("---------------");
		
		products.forEach((p)-> System.out.println(p.getName()));
		
		
	}
	
}
