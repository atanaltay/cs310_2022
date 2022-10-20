package abstractAndinterfaces;

public class MainClass {

	
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		
		Shape rect = new Rectangle("Blue");
		Shape circ = new Circle("Red");
		
		pen.draw(circ);
		pen.draw(rect);
		
		pen.print((Printable)rect);
		
		
		
		
		
	}
	
	
}
