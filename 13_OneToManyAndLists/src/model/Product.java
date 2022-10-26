package model;
//Product POJO
public class Product {
	
	private String name;
	private double price;
	private double tax;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, double price, double tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getInfo() {
		
		String retVal = "Product: " + name + "\n";
		retVal+="Price: " + price +", tax:"  + tax +"\n";
		retVal+="Gross Price: " + getGrossPrice() + "\n";
		return retVal;
		
	}
	
	public double getGrossPrice() {
		return price + price*tax;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
