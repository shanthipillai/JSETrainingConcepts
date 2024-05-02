package jse.training.cocepts.POJOs;

public class Address {
	private int pincode;
    private String streetName;
    private String city;
    
    
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int pincode, String streetName, String city) {
		super();
		this.pincode = pincode;
		this.streetName = streetName;
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
   /* 
    @Override
    public String toString() {
    	return "get";
    }
    */
}
