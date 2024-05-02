package jse.training.cocepts.encapsulation;

public class ApplicationForm {
	
	//Submitting a Form may not require getters
private String name;
private String qualification;
private String address;
private String technologies;
private int contactNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTechnologies() {
	return technologies;
}
public void setTechnologies(String technologies) {
	this.technologies = technologies;
}
public int getContactNo() {
	return contactNo;
}
public void setContactNo(int contactNo) {
	this.contactNo = contactNo;
}

}
