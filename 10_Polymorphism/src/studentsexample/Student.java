package studentsexample;


//inheriting from class
//we use extends keyword
public class Student extends Person{
	private String[] registeredCourses;
	
	public Student(int id, String name, String department,
			String[] registeredCourses) {
		//super -> super class
		//super() -> super class constructor
		//super. - > super type methods and fields
		//A subclass must call its super class constructor first
		super(id, name, department);
		// TODO Auto-generated constructor stub
		this.registeredCourses = registeredCourses;
		System.out.println("Student constructor is called");
	}
	
	//Java Annotation
	@Override
	public void getInfo() {
		
		super.getInfo();
		
		System.out.println("Student get info---");
		System.out.println("Registered Courses:");
		for (String course : registeredCourses) {
			System.out.println(course);
		}
		
	}
	
	public void studentStudy() {
		System.out.println("Student studies");
	}

	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	
	
}
