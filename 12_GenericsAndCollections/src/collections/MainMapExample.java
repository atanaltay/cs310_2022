package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMapExample {

	//Map -> HashMap
	// key-value pairs
	//similar to Python Dictionary
	// their keys form a Set
	
	//Map<K,V> --> K: Key, V: Value
	public static void main(String[] args) {
		Product p1 = new Product(1,"TV",5000);
		Product p2 = new Product(2,"Laptop",2000);
		Product p3 = new Product(3,"Mouse",100);
		
		Product p4 = new Product(4,"Trousers",100);
		Product p5 = new Product(5,"Shirts",200);
		Product p6 = new Product(6,"Table",100);
		
		Map<String, Product> prodsMap
				 = new HashMap<>();
		
		prodsMap.put("TV", p1);
		prodsMap.put("Shirts", p5);
		prodsMap.put("Table", p6);
		prodsMap.put("Mouse", p3);
		
		
		
		System.out.println(prodsMap.get("TV"));
		System.out.println(prodsMap.get("Table"));
		
		prodsMap.put("Mouse", p1);
		System.out.println(prodsMap.get("Mouse"));
		
		System.out.println("------------------------");
		Set<String> keys = prodsMap.keySet();
		
		for (String key : keys) {
			System.out.println(key + " -- " + prodsMap.get(key));
		}
		
		
		
	}
	
	
	
	
}
