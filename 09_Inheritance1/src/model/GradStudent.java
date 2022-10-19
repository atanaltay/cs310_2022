package model;

public class GradStudent extends Student{
	
	private String thesisSubject;

	public GradStudent(int id, String name, String department, String[] registeredCourses,
			String thesisSubject) {
		super(id, name, department, registeredCourses);
		this.thesisSubject = thesisSubject;
		System.out.println("Grad student constructor");
	}
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		
		System.out.println("Grad Student get info");
		System.out.println("Thesis:");
		System.out.println(getThesisSubject());
	}
	
	
	public String getThesisSubject() {
		return thesisSubject;
	}
	
	public void setThesisSubject(String thesisSubject) {
		this.thesisSubject = thesisSubject;
	}
	

}
