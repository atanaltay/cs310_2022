package model;

//Person implicitly extends from Object
public class Person {

	private int id;
	private String name;
	private String department;
	
	/*
	public Person() {
		System.out.println("Person constructor called..");
	}
	
	*/
	
	//In Java, all types /objects are subclasses of Object
	public Person(int id, String name, String department) {
		super(); //Calling Object default constructor
		this.id = id;
		this.name = name;
		this.department = department;
		
		System.out.println("Person constructor is called...");
	}
	
	public void getInfo() {
		
		System.out.println("Person get info....");
		System.out.println("ID" + id);
		System.out.println("Name" + name);
		System.out.println("Department" + department);
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
