package jse.training.cocepts.io.fileio.filewriterreaders;

public class Employee {
int regId;

String companyName;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int regId, String companyName) {
	super();
	this.regId = regId;
	this.companyName = companyName;
	
	
}


public int getRegId() {
	return regId;
}


public void setRegId(int regId) {
	this.regId = regId;
}


public String getCompanyName() {
	return companyName;
}


public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

}
