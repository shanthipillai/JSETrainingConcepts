package jse.training.cocepts.Org;

public class Address {
private String streetName;
private int pinCode;
private String city;


public Address() {
	super();
	// TODO Auto-generated constructor stub
}


public Address(String streetName, int pinCode, String city) {
	super();
	this.streetName = streetName;
	this.pinCode = pinCode;
	this.city = city;
}


public String getStreetName() {
	return streetName;
}


public void setStreetName(String streetName) {
	this.streetName = streetName;
}


public int getPinCode() {
	return pinCode;
}


public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}



}
