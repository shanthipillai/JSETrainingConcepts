package jse.training.cocepts.interfaceconcepts;

public interface SortingMechanism {
//public static final int x=10;	
	int x=10;
//public abstract void sort();
	 void sort();
	 //Instance Methods not allowed here
	/*
	  void print1()
	 {
		 
	 }
	*/

	 //Java8 Onwards 
	 //Default methods in interface is different from the default method in concrete class.
	 
	 default void print()
	 {
		 System.out.println("Printing from default mechanism");
	 }
	 
	 static void staticMethod()
	 {
		 System.out.println("Static Method");
	 }
	 
	 static void privateMethod()
	 {
		 
	 }
}
