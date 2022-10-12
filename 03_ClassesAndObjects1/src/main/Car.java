package main;

//access modifier - class- class name
public class Car {
	
	//state:
	//instance variables 
	// fields 
	//class variable

	String color = "Blue";
	String transmission = "manual";
	int currentSpeed = 0;
	
	boolean engineStarted = false;
	
	
	//Constructor
	//Constructors are special Java methods
	// used to instantiate classes, they don't return a value
	
	//Default constructor, no params!
	Car(){
		System.out.println("Car default constructor is called...");
	}
	
	//A non-default constructor
	Car(String _color, String _transmission){
		
		color = _color;
		transmission = _transmission;
		
	}
	
	
	//behaviour
	//methods:
	
	
	//method does not return anything: return void
	
	// (method name + param list) = method signature
	void startEngine() {
		
		if(!engineStarted) {
			engineStarted = true;
			System.out.println("Engine started");
		}else {
			System.out.println("Engine already started.");
		}

	}
	
	void stopEngine() {
		if(engineStarted) {
			engineStarted = false;
			System.out.println("Engine stopped");
		}else {
			System.out.println("Engine is not started");
		}
	}
	
	void setSpeed(int speed) {
		
		if(engineStarted) {
			currentSpeed = speed;
			System.out.println("Current speed is " + currentSpeed);
		}else {
			System.out.println("Start the engine first!");
		}
		
		
	}
	
	int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
	
	

}
