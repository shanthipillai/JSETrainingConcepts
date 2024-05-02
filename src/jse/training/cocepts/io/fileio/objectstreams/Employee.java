package jse.training.cocepts.io.fileio.objectstreams;

import java.io.Serializable;

public class Employee implements Serializable{
int empid;
String ename;
 static String orgname="startup";
final String regid="123A";
private int val=10;


transient String privateInfo="GovtRegistNo1235";




public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empid, String ename) {
	super();
	this.empid = empid;
	this.ename = ename;
}

}
