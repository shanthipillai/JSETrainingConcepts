package jse.training.constructors;

public class DefaultConstructors {
	//Constructor defines initial state of an object as well
	//Properties of instance- Instance Variables
int x;

float y;
String s;
char c;
double d;

DefaultConstructors()
{
	System.out.println("Default constructor is invoked at the time of object creation");
}


//Parameterized Constructors
DefaultConstructors(int x1, float y1, String s1, char c1, double d1)
{
	x=x1;
	y=y1;
	s=s1;
	c=c1;
	d=d1;
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
	System.out.println(c);
	System.out.println(d);
}
	
	public static void main(String[] args) {
		//DefaultConstructors() - Default Constructor
		/*
		DefaultConstructors obj=new DefaultConstructors();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.s);
		System.out.println(obj.c);
		System.out.println(obj. d);
		System.out.println(obj);
		
		*/
		//Initialize the object and it intialize the default value for it's properties
		DefaultConstructors obj2=new DefaultConstructors();
		DefaultConstructors obj1=new DefaultConstructors(1,2.2f,"value",'c',10);
	}
}
