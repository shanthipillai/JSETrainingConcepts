package jse.training.methodcreations;
//Write a Tester Class for this - Task -3
public class FancyCalculator {
 int result;
	public int Sum(int a, int b)
	{
		//You can store the calculated value and then return or return directly a+b
		result=a+b;
		return result;
	}
	
	public int Sub(int a, int b)
	{
		result=a-b;
		return result;
	}
	
	public int Mul(int a, int b)
	{
		result=a*b;
		return result;
	}
	
	public int Div(int a, int b)
	{
		result=a/b;
		return result;
	}
	
	public int Sqrt(int a, int b)
	{
		result=a*b;
		return result;
	}
	
	public int sum3(int a, int b, int c)
	{
		return a+b+c;
	}
}
