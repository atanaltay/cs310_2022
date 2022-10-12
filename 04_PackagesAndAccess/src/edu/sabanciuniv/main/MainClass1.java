//package is the first statement in a class
package edu.sabanciuniv.main;
import java.util.Scanner;

import edu.sabanciuniv.model.Car;
import edu.sabanciuniv.model.Employee;

public class MainClass1 {

	//naming packages
	// sabanciuniv.edu
	
	// edu.sabanciuniv.utils
	//edu.sabanciuniv.main
	//edu.sabanciuniv.db
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//all primitives come from
		// java.lang package, which is
		//imported implicity
		int x = 4;
		
		
		Car car = new Car();
		
		//Fields below are not accessable
		//car.year
		//car.currentSpeed
		
		Employee emp 
		= new Employee(1,"tanaltay","altug");
		
		System.out.println(emp.getId());
		
		emp.setId(100);
		System.out.println(emp.getId());
		
	}
	
	
}
