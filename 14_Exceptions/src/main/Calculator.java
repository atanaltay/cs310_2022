package main;

import java.time.LocalDateTime;

public class Calculator {

	//Exception is a checked types
	// in order to throw a checked exception
	// we need to declare it first!
	
	public double divide(double num1, double num2) throws Exception{
		
		if(num2==0) {
			throw new Exception("Secodnd number cannot be zero!");
		}else {
			return num1/num2;
		}

	}
	
	public double divide2(double num1, double num2) throws DivideByZeroException{
		
		if (num2==0) {
			throw new DivideByZeroException(LocalDateTime.now());
		}else {
			return num1/num2;
		}
		
		
		
		
	}
	
	
}
