package abstractAndinterfaces;

public abstract class Shape {

	private String color;
	
	
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public abstract void draw();
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
