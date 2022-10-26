package main;

public class Main2 {

	//Never thow an exception from main method
	//you'll never be able to catch it
	public static void main(String[] args) throws Exception {
		
		
		Calculator calc = new Calculator();
		
		
		calc.divide(1, 0);		
		
		
	}
	
	
	
}
