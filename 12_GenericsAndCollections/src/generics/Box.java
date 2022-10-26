package generics;

public class Box<T> {

	//Generic variable
	private T item;
	

	public Box(T item) {
		super();
		this.item = item;
	}
	
	public String getTClassName() {
		return item.getClass().toString();
	}

	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
}
