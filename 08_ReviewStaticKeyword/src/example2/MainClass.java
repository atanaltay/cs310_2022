package example2;

public class MainClass {

	/*
	 * I want to create such a class that
	 * only one instance can be created 
	 * through the runtime, we can access that 
	 * specific instance anytime through runtime.
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		/*
		MySingleType myst = new MySingleType();
		MySingleType myst2 = new MySingleType();
		*/
		
		MySingleType singleType = MySingleType.getInstance();
		
		
		
	}
	
}
