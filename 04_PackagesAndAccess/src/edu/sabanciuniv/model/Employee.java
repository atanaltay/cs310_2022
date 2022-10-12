package edu.sabanciuniv.model;

public class Employee {

	private int id;
	private String lastname;
	private String name;
	
	//If no constructor exists in a class
	// Java generates a default constructor for us
	
	
	//Non-default constructor
	//Constraint: Employee can only be instantiated
	//with id, name, lastname
	//if at least one non default const -> Java doesn't generate one for us
	public Employee(int id, String lastname, String name) {

		this.id = id;
		this.lastname = lastname;
		this.name = name;
	}
	
	//In order to provide access to hidden fields:
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		//shadowing, parameter is shadowing id field
		//id = id;
		
		this.id = id;
		
	}
	
	
	
}
