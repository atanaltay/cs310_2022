package tshirt;

public class TshirtWithEnum {

	
	public enum SIZE{SMALL,MEDUIM,LARGE};
	//All enum fields are implicitly static and final

	
	private SIZE size;
	
	
	public TshirtWithEnum(SIZE size) {
		this.size = size;
	}
	
	public double calculateCost() {
		
		if(size==SIZE.SMALL) {
			return 100;
		}else if(size==SIZE.MEDUIM) {
			return 150;
		}else return 200;
		
		
	}
	
	
}
