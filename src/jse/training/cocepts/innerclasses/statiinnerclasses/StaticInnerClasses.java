package jse.training.cocepts.innerclasses.statiinnerclasses;

public class StaticInnerClasses {
int x=10;
static int y=20;

//Static Inner Class Starting
	static class InnerClass
	{
		int i=40;
	   static	int j=50;
		 public void printValues()
		 {
			 System.out.println(y);
			// System.out.println(new StaticInnerClasses().x);
		 }
		 
		 public static void staticMethodOfStaticInnerClass()
		 {
			 System.out.println("You are accessing Static Method inside Static Inner Class");
		 }
		
	}
	//Static Inner Class Ending
	
	public static void main(String[] args) {
		//Creation of Inner Class Object
		InnerClass innerobj=new StaticInnerClasses.InnerClass();
		//Accessing Static Inner Class instance variable value and Instance Method by using Inner class object
		System.out.println(innerobj.i);
		innerobj.printValues();
		//Accessing Static Vars or Methods 
		System.out.println(StaticInnerClasses.InnerClass.j);
		StaticInnerClasses.InnerClass.staticMethodOfStaticInnerClass();
	}
	
  
	
	
}
