package model;

public class Teacher extends Person{

	private String[] coursesOffered;
	
	public Teacher(int id, String name, String department,
			String[] coursesOffered) {
		super(id, name, department);
		this.coursesOffered = coursesOffered;
		System.out.println("Teacher constructor invoked...");
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Teacher get info");
		System.out.println("Courses offered:");
		for (String course : coursesOffered) {
			System.out.println(course);
		}
	}
	
	public String[] getCoursesOffered() {
		return coursesOffered;
	}
	
	public void setCoursesOffered(String[] coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

}
