package jse.training.statickey;

public class StaticMethod {
	StaticMethod()
	{
		System.out.println("Default Constructor is invoked");//3
	}
//Non-Static Method	
	public void nonStaticMethod()
	{
		System.out.println("Non Static Method");
	}
	
	//Static Method
	public static void staticMethod()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		System.out.println("First Line of main method");  //1
		StaticMethod obj=new StaticMethod();  //2
		obj.nonStaticMethod();  //4
		
		//Accessing Static Method 
		StaticMethod.staticMethod();  //5
		
	}
	
}
