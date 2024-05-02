package jse.training.cocepts.POJOs;

public class ContractEmployee {
private String cempName;
private Address address;
public ContractEmployee(String cempName, Address address) {
	super();
	this.cempName = cempName;
	this.address = address;
}
public ContractEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCempName() {
	return cempName;
}
public void setCempName(String cempName) {
	this.cempName = cempName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
/*
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hello";
	}
	*/


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Contract Employee Name="+getCempName()+
				    "\nCity= "+getAddress().getCity()+
				   "\nPincode= "+ getAddress().getPincode()+
				   "\nStreet Name= "+getAddress().getStreetName();
	}
	
}
