package edu.sabanciuniv.model;

//access modifier - class- class name
//classes can have public or default access
public class Car {
	
	//state:
	//instance variables 
	// fields 
	//class variable

	//variable below have default access
	// default access works like protected access
	// not accessable from other packages!
	
	String color = "Blue";
	String transmission = "manual";
	int currentSpeed = 0;
	
	boolean engineStarted = false;
	
	
	private String brand;
	public String type;
	
	protected int year;
	
	//Constructor
	//Constructors are special Java methods
	// used to instantiate classes, they don't return a value
	
	//Default constructor, no params!
	public Car(){
		System.out.println("Car default constructor is called...");
	}
	
	//A non-default constructor
	//overloaded Car constructor
	public Car(String _color, String _transmission){
		
		color = _color;
		transmission = _transmission;
		
	}
	
	
	//behaviour
	//methods:
	
	
	//method does not return anything: return void
	
	// (method name + param list) = method signature
	public void startEngine() {
		
		if(!engineStarted) {
			engineStarted = true;
			System.out.println("Engine started");
		}else {
			System.out.println("Engine already started.");
		}

	}
	
	public void stopEngine() {
		if(engineStarted) {
			engineStarted = false;
			System.out.println("Engine stopped");
		}else {
			System.out.println("Engine is not started");
		}
	}
	
	public void setSpeed(int speed) {
		
		if(engineStarted) {
			currentSpeed = speed;
			System.out.println("Current speed is " + currentSpeed);
		}else {
			System.out.println("Start the engine first!");
		}
		
		
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
	
	

}
