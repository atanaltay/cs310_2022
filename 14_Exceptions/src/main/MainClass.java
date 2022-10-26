package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		
		//If a method throws a checked exception
		// it must be handled in the try-catch block
		//in the first caller method
		
		
		try {
			System.out.println("Code before exception");
			System.out.println((calc.divide(10, 0)*2));
			System.out.println("Code after exception");
		
		} catch (Exception e) {
			System.out.println("Code crashed");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("Code after the try block");
		
	}
	
	
}
