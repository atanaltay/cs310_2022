package model;

public class Adress {
	
	private String city;
	private String street;
	private String doorNo;
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}

	public Adress(String city, String street, String doorNo) {

		this.city = city;
		this.street = street;
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	
	

}
