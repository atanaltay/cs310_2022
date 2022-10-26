package main;

public class Main3 {

	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		try {
			calc.divide2(100, 0);
		} catch (DivideByZeroException e) {
			System.out.println("Time: " + e.getTimeOfException());
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
}
