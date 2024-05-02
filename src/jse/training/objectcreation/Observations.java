package jse.training.objectcreation;

public class Observations {
	//Non-Static variables & Instance Variables
	 int x=10;
	public static void main(String[] args) {
		System.out.println("This is the main method");
		int x;
		/*
		System.out.println(new Observations());
		System.out.println(new Observations());
		System.out.println(new Observations());
		System.out.println(new Observations());
		*/
		
		Observations obj1=   new Observations();
		Observations obj2=   new Observations();
		System.out.println(obj1);
		System.out.println(obj1);
		x=10;
		System.out.println(x);
	}
}
