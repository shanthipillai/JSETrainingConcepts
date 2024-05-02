package jse.training.methods.access;

public class StaticTestMain {

	public static void main(String[] args) {
		StaticTest obj=new StaticTest();
		obj.instanceMethod();
		
		StaticTest.staticMethod();
	}
	
}
