package abstractAndinterfaces;

public class Pen {

	//Pen is loosely coupled with all shapes
	public void draw(Shape shape) {
		shape.draw();
	}
	
	public void print(Printable printable) {
		
		printable.print();
		
	}
	
	
}
