package jse.training.polymorphism.overloading;

public class AdditionCalculatorOverloading {
/*Instance Methods
 * Method Name same
 * Return type of parameters or no of parameters varies
 * Return type is not into consideration
 */
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(float a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a, float b)
	{
		System.out.println(a+b);
	}
	
	//Return type is int yet acceptable
	public int sum(float a, float b)
	{
		System.out.println(a+b);
		return 0;
	}
	
	public void sum(double a, double b)
	{
		System.out.println(a+b);
	}
	
	
	public void sum(int a, float b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		AdditionCalculatorOverloading obj=new AdditionCalculatorOverloading();
		obj.sum(1, 20);
		obj.sum(1, 2.5f);
		obj.sum(1.1f, 2.5f);
		obj.sum(1.1f, 2);
		obj.sum(2.5, 1.1);

	}

}
