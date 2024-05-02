package jse.training.polymorphism;

public class Overloading {
	
public void addition()
{
	System.out.println("It is addition functionality");
}



public static void addition(int a, int b)
{
	System.out.println(a+b);
}



public void addition(int a, int b, int c)
{
	System.out.println(a+b+c);
}

public void addition(int a, int c, float d)
{
	System.out.println(a+c+d);
}
/*
public int addition(int a, int c, double d)
	
{
	
}
*/


public static void main(String[] args) {
	Overloading obj=new Overloading();
	obj.addition();
	obj.addition(1, 2, 3.4f);
//	obj.addition(1,3.4,5);
	obj.addition(1, 2,3);

	}
}

