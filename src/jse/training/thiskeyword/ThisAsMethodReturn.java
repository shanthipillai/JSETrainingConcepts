package jse.training.thiskeyword;

public class ThisAsMethodReturn {
	//Here the return type is class type - Non-Primitives will discuss more in Object Class
	
	public ThisAsMethodReturn sendObject()
	{
	//	this=null;
		//ThisAsMethodReturn this=new ThisAsMethodReturn();
		return this;
	}
	
	public void printThisMethod()
	{
		System.out.println("You are printing this method by using this object");
	}
public static void main(String[] args) {
	
	ThisAsMethodReturn obj=new ThisAsMethodReturn();
	ThisAsMethodReturn obj1=new ThisAsMethodReturn();
	//Printing the hashcode of obj 
	System.out.println(obj);
	//Printing the hashcode of obj1 
	System.out.println(obj1);
	ThisAsMethodReturn object	=obj.sendObject();
	//Printing the hashcode of object 
	//=>Note object hashcode and obj hash codes are same
//	System.out.println(object);
	object.printThisMethod();
	
}
}
