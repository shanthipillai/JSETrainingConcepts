package jse.training.thiskeyword;

public class Scenario5 {
	public static void staticPrint() {
		System.out.println("Static Method");
	}

	// Can we access static method from another static method using this: No, In
	// static methods we can't use this
	public static void otherStaticMethod() {
		// this.staticPrint();
	}

	public static void main(String[] args) {

	}
}
