package studentsexample;

public class MainClass {

	/*
	 * We are hired to create an education app:
	 * 
	 * We have Teachers, Students and GradStudents
	 * 
	 * All types have an id, name and department
	 * 
	 * Students (Undergrad) have registered courses,
	 * they can study and register for a course
	 * 
	 * Grad students do the same things as students, in addtion
	 * they have a thesis subject
	 * 
	 * Teachers are responsible for teaching students and
	 * advising grad students
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		Person person = new Person(1,"mehmet","CS");
		System.out.println("----------------------");
		Student stu1 = new Student(2,"ahmet","MATH",
				new String[]{"HIST101","MATH101"});
		
		//person.getName();
		
		GradStudent grad1 = new GradStudent(3,"metin","MATH",
				new String[]{"HIST101","MATH101"},"Dealing with history");
	
		
		/*
		System.out.println("------------------------");
		person.getInfo();
		
		System.out.println("----------------------");
		stu1.getInfo();
		
		
		System.out.println("----------------------");
		grad1.getInfo();
		
		System.out.println("----------------------");
		teacher.getInfo();
		*/
		
		//Intro to polymorphism:
		
		// A reference of a supertype can 
		//point to any objects from subtypes
		
		Person student = new Student(4, "ali", "CS", 
				new String[]{"HIST101","MATH101"});
		
	
		Person gradStudent = new GradStudent(3,"metin","MATH",
				new String[]{"HIST101","MATH101"},"Dealing with history");
		
		
		
		student.getInfo();
		
		System.out.println("--------------");
		
		gradStudent.getInfo();
		
		//Person is not a Student
		//Code below is WRONG
		//Student stu3 = new Person(0,"","");
		System.out.println("--------------------------------------");
		Teacher teacher = new Teacher(4, "Gokay", "CS", 
				new String[]{"CS310","BAN835"});
		
		teacher.teach(student);
		
		teacher.teach(gradStudent);
		
		teacher.teach(teacher);
		
	}
	
}
