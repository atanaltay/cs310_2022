package main;

public class MainClass2 {

	//Primitive versus reference type assignments
	
	public static void main(String[] args) {
		
		//primitive type assignments:
		
		int x = 20;
		int y = x; //value of x is copied!
		
		x+=100;
		
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		System.out.println("-------------------------");
		
		//Reference type assignment
		Car car1 = new Car();
		car1.color = "blue";
		
		Car car2 = car1;
		
		System.out.println("Car1 color " + car1.color );
		System.out.println("Car2 color " + car2.color );
		
		car1.color = "red";
		
		System.out.println("Car1 color " + car1.color );
		System.out.println("Car2 color " + car2.color );
		
	}
	
}
