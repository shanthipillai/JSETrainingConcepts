package jse.training.methodcreations;

public class Calculator {
	int x = 10;

	// Non-Static Method
	void sumOfTwoNos() {
		// System.out.println("Sum of 2 nos 23="+(2+3));
		System.out.println(2 + 3);
	}

	// float f=2f;
	float sumOfNo() {
		return 2;

	}

	void additionOfTwoNos(int a, int b) {
		System.out.println("Sum of two no=" + (a + b));
	}

	void additionOfTwoNos1(int a, double b) {
		System.out.println("Sum of two no=" + (a + b));
	}

	void additionOfTwoNos(int a, float b) {
		System.out.println("Float-Int");
		System.out.println("Sum of two no=" + (a + b));
	}

	void additionOfTwoNos(int a, double b) {
		System.out.println("Double-Int");
		System.out.println("Sum of two no=" + (a + b));
	}

	
  float sum2Nos(int a, float b)
  {
	  //2, 3.3=5.3 
	  return a+b;
	  
  }
  
 double sum2Nos2(float a, double b)
  {
	 return a+b;
	  
  }
}
