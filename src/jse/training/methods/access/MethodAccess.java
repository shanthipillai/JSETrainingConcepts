package jse.training.methods.access;

public class MethodAccess {
	
	//Instance Method 0
public void instanceMethod()
{
//	MethodAccess.staticMethod();
	System.out.println("You invoked an instance method");
}
	
//Static Method
public static void staticMethod()
{
	/*
	 * Fail Case 
	 */
	//instanceMethod(); 
	MethodAccess obj=new MethodAccess();
	obj.instanceMethod();
	System.out.println("You invoked static method (Directly you can call this method using className");
}

//Instance Method 1
public void instanceMethod1()
{
	instanceMethod();
	System.out.println("You are invoking instance Method1");
}


public static void staticMethod2()
{
	staticMethod();
	System.out.println("Static Method 2");
}
//Main Method - Main is also static method

public static void main(String[] args) {
	
	MethodAccess obj=new MethodAccess();
	obj.instanceMethod();
	staticMethod();
	obj.instanceMethod1();
	staticMethod2();
}
}
