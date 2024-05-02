package jse.training.methods.access;

public class VarAccess {
static float pi=3.14f;
String name="Maths";


public void instanceMethod1()
{
	//Accessing static variables in non-static methods
	System.out.println(VarAccess.pi);
	
	///Accessing non-static variables in non-static methods
	System.out.println(name);
	
}


public static void staticMethod()
{
	//Accessing static variables in static methods
		System.out.println(VarAccess.pi);
		///Accessing non-static variables in static methods	
	//System.out.println(name);
		VarAccess obj=new VarAccess();
		System.out.println(obj.name);
}


public static void main(String[] args) {
	VarAccess obj=new VarAccess();
	obj.instanceMethod1();
	staticMethod();
}
}
