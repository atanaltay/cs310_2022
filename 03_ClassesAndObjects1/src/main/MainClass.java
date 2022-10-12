package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		//Creating an instance
		//Creating the object car
		
		Car car1 = new Car();
		System.out.println("Car 1");
		System.out.println(car1.color);
		System.out.println(car1.currentSpeed);
		System.out.println(car1.transmission);
		System.out.println(car1.engineStarted);
		
		
		car1.startEngine();
		car1.setSpeed(30);
		car1.setSpeed(0);
		car1.stopEngine();
		
		System.out.println("current speed is " + car1.getCurrentSpeed());
		
		
		car1.color = "Red";
		
		System.out.println("New color: " + car1.color);
		
		System.out.println("-----------Car2----------");
		
		Car car2 = new Car("Green", "Auto");
		
		System.out.println("Color car2:" + car2.color);
		System.out.println("Transm. car2:" + car2.transmission);
		
		
		
		
	}
	
	
	
}
