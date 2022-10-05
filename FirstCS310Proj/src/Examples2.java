import java.util.Scanner;

public class Examples2 {

	//Type conversions:
	
	
	public static void main(String[] args) {
		
		//ints -> 32 bits, doubles-> 64 bits
		
		int n1 = 23;
		int n2 =34;
		
		//explicit casting from int to double 
		double nSum = n1+n2;
		System.out.println(nSum);
		
		
		double d1 = 12.5;
		double d2 = 12.5;
		
		//implicit casting
		// from double to int the precision is lost
		int doubleSum = (int)d1 + (int)d2;
		
		System.out.println(doubleSum);
		
		//in Java any (int sized or smaller) literal number is 
		//automatically ints
		
		byte b1 = 23;
		byte b2 = 34;
		
		
		//the code below creates a compiler error
		//byte bSum = b1+b2;
		
		byte bSum = (byte)(b1 +b2);
		System.out.println(bSum);
		
		//String conversion
		
		double aDouble = 12.33;
		
		String s = String.valueOf(aDouble);
		
		System.out.println(s);
		
		
		//Conversion from String to other Types
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		String num1 = input.next();
		
		System.out.println("Enter second number");
		String num2 = input.next();
		
		// double -> Double
		// int -> Integer
		
		double d1_ = Double.valueOf(num1);
		double d2_ = Double.valueOf(num2);
		
		
		System.out.println(d1_+d2_);
		
		
		
		
		
		
	}
	
	
	
}
