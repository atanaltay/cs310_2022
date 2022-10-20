package drawapp;

public class Circle extends Shape{

	private int radius;
	
	@Override
	public void getDrawn() {
		System.out.println("Circle is drawn");
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
