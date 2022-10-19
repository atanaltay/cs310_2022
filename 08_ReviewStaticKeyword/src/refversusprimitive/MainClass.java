package refversusprimitive;

public class MainClass {

	int count = 0;
	
	public static void main(String[] args) {
		
		int n = 2;
		
		
		//static methods can only access other static methods and fields
		//changeValue(n);
		//count++;
		
		
		changeValue(n);
		
		System.out.println("n: " + n);
		
		Person person1 = new Person("Altug");
		
		changePerson(person1);
		
		System.out.println("Person name: " + person1.getName());
		
	}
	
	//pass-by-reference
	//this time the reference is copies, address of the object is copied!!!
	public static void changePerson(Person p) {
		p.setName("No name");
	}
	
	
	///pass-by-value
	public static void changeValue(int x) {
		x+=100;
	}
	
	
	
}
