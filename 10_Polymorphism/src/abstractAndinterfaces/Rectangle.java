package abstractAndinterfaces;

public class Rectangle extends Shape implements Printable{

	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Rectnagle is drawn");
		
	}

	@Override
	public void print() {
		System.out.println("Rectangle is printed on paper");
		
	}

}
