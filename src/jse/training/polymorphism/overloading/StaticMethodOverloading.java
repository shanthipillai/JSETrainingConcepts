package jse.training.polymorphism.overloading;
//Compile Time Polymorphism

public class StaticMethodOverloading {
	// Static Method Overloading is possible
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(float a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, float b) {
		System.out.println(a + b);
	}

	// Return type is int yet acceptable
	public static int sum(float a, float b) {
		System.out.println(a + b);
		return 0;
	}


	public static void sum(double a, double b) {
		System.out.println(a + b);
	}

	public void sum(int a, float b, int c) {
		System.out.println(a + b + c);
	}
	//Main Method is also static it can also be overloaded
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {

		// AdditionCalculatorOverloading obj=new AdditionCalculatorOverloading();
		sum(1, 20);
		sum(1, 2.5f);
		sum(1.1f, 2.5f);
		sum(1.1f, 2);
		sum(2.5, 1.1);
		main(12);

	}
}
