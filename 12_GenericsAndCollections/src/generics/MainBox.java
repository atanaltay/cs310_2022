package generics;

import java.util.ArrayList;
import java.util.List;

public class MainBox {

	public static void main(String[] args) {
		String name = "Jack";
		
		Box<String> stringBox = new Box<String>(name);
		
		System.out.println(stringBox.getItem());
		
		System.out.println(stringBox.getTClassName());
		
		System.out.println("--------------");
		
		
		
		//Wrapper types
		
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		
		Integer i = new Integer(23);
		
		// 34 is wrapped inside Integer class
		
		Integer i2 = 34;
		
		i2.doubleValue();
		
		int age = 30;
		
		Box<Integer> intBox = new Box<Integer>(age);
		
		System.out.println(intBox.getItem());
		System.out.println(intBox.getTClassName());
		
		
		//All Collections in Java Are Generic Types
		
		ArrayList<String> names = new ArrayList<>();
		
		
	}
	
	
}
