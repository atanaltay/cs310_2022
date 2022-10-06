package main;

import java.util.Scanner;

public class ControlStatements1 {
	
	public static void main(String[] args) {
		
		// if() - else if() - else
		
		//Calculate absolute value
		int x = -20;
		
		// < > <= >=  ==  !=
		
		if(x<0) {
			x = x*-1;
		}
		
		System.out.println("The absolute value is " + x);
		
		
		//Grade Calculator
		
		// ask for the grade of a course
		//  grade < 30 --> you failed
		// 30<grade<50 --> you got C
		// 50 - 70 -> B
		// Over 70 -> A
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("PLease enter the grade:");
		
		
		double grade=  input.nextDouble();
		
		if(grade<40) {
			System.out.println("You failed");
		}else if(grade<50) {
			System.out.println("You got C");
		}else if(grade<80) {
			System.out.println("You got B");
		}else {
			
			System.out.println("You got A");
			
		}
		
		
		
		
		
	}

}
