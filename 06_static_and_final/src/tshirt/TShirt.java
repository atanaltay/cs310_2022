package tshirt;

public class TShirt {
	
	
	public static final int SMALL = 0;
	public static final int MEDIUM = 1;
	public static final int LARGE = 2;
	
	private int size;
	// 0 -> small, 1-> medium, 2-> large
	
	
	
	public TShirt(int size) {
		super();
		this.size = size;
	}




	public double calculateCost() {
		
		if(size==0) {
			return 100;
		}else if(size==1) {
			return 150;
		}else return 200;
		
	}

}
