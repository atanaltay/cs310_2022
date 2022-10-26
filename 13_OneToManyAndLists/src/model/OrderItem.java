package model;

public class OrderItem {
	
	private Product product;
	private int amount;
	
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Product product, int amount) {
		super();
		this.product = product;
		this.amount = amount;
	}
	
	public String getInfo() {
		
		String retVal = "OrderItem: \n";
		retVal += product.getInfo();
		retVal += "Amount: " + amount + ", total:" + getItemTotalPrice() + "\n";
		return retVal;
		
		
	}

	public double getItemTotalPrice() {
		
		return product.getGrossPrice() * amount;
		
	}
	
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	

}
