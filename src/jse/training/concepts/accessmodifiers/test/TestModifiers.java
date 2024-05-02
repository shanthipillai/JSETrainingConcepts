package jse.training.concepts.accessmodifiers.test;

import jse.training.cocepts.accessmodifiers.test.ProtectedClass;

public class TestModifiers extends ProtectedClass {

	
	public static void main(String[] args) {
		TestModifiers obj=new TestModifiers();
		ProtectedClass obj1=new ProtectedClass();
		
		obj.method();
		
		
	}
}
