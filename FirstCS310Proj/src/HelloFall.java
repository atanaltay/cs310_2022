import java.util.Scanner;

class HelloFall {

	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Java!!");
		
		//Variable Types:
		//1- Primitive Types
		//local variables: variables in methods
		int num1 = 23;
		int num2 =4566;
		
		//Arithmetic Operators:
		// + - / *  % ++  --
		
		int sum = num1 + num2;
		
		System.out.println("The sum is: " + sum);
		
		boolean check = true;
		
		System.out.println("check is " + check);
		
		char aChar = 'a';
		
		//2- Reference Types
		//All the rest are reference types
		//Definining a String
		// Strings are speacial 
		
		String welcomeMessage = "Hello to CS310";
		
		System.out.println(welcomeMessage);
		
		/*
		 * multiline comments
		 * 
		 * 
		 * */
		
		//Console Input:
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		System.out.println("Hello " + name);
		
		System.out.println("Num1:");
		
		double inNum1 =  input.nextDouble();
		
		System.out.println("Num2:");
		double inNum2 =  input.nextDouble();
		
		double doubleSum = inNum1 + inNum2;
		
		System.out.println("The sum is " + doubleSum);
		
		System.out.println("The same sum again:" + (inNum1 + inNum2));
		
		
		
		
		
		
	}
	
	
	
}
