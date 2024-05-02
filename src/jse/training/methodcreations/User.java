package jse.training.methodcreations;

public class User {
public static void main(String[] args) {
	//Creating Object for Calculator
	Calculator calcy=new Calculator();
	
	calcy.sumOfTwoNos();
	//As method returning a value
	//Up to you to store or directly print it or further manipulate
	float value=calcy.sumOfNo();
	System.out.println(value);
	System.out.println(calcy.sumOfNo());
	
	calcy.additionOfTwoNos(24, 676);
	calcy.additionOfTwoNos1(23, 34.5);
	
	calcy.additionOfTwoNos(12, 38.9f);
}
}
