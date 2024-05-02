package jse.training.cocepts.Singleton;

public class Test2 {
public static void main(String[] args) {
	ConnectionSetup obj1=ConnectionSetup.getInstance();
	ConnectionSetup obj2=ConnectionSetup.getInstance();
	System.out.println(obj1);
	System.out.println(obj2);
	//System.out.println(obj1);
	
	ConnectionSetup1 obj3=ConnectionSetup1.getInstance();
	ConnectionSetup1 obj4=ConnectionSetup1.getInstance();
	System.out.println(obj3);
	System.out.println(obj4);
}
}
