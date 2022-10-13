package example1;

public class MainTestMath {

	
	public static void main(String[] args) {
		
		
		
		System.out.println("Max:" + Math.max(20, 15)); 
		
		
		/*
		Calculator calc = new Calculator();
		calc.makeSum(23, 22);
		*/
		
		System.out.println(Calculator.makeMultiplications(23, 43));
		
		System.out.println("PI:" + Calculator.PI);
		
		//Code below creates a compiler error!
		//Calculator.PI = 2.0;
		
	}
	
	
}
