package example2;


//Singleton Pattern
//Only a single instance exists in memory
public class MySingleType {

	
	private static MySingleType instance;
	
	private MySingleType() {
		
	}
	
	public static MySingleType getInstance() {
		
		if (instance ==null) {
			instance = new MySingleType();
		}
		
		return instance;
		
	}
	
}
