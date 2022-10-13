package example1;

public class AClassWithFinal {

	//Tax percentage do not change
	// create a variable with constant tax percentage;
	
	private final double tax;
	
	private final int aFinalField = 3;
	
	public AClassWithFinal() {
		
			tax = 0.18;
		
		
	}
	
	
	
	//Code below creates a compiler error
	//final variables cannot be assigned new values.
	/*
	public void test() {
		tax = 0.25;
	}
	*/
	
	
}
