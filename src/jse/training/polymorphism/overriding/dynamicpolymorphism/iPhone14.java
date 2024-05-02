package jse.training.polymorphism.overriding.dynamicpolymorphism;
//iPhone14 is child class of iPhone13
//Run-time Polymorphism
public class iPhone14 extends iPhone13 {
	iPhone14()
	{
		System.out.println("iPhone14 launched");
	}
	//new Features
	public void iPhoneCamMegaPix()
	{
		System.out.println("Cam enhanced in iPhone14");
	}
	//Enhancing existing features

	@Override
	public void speakersV(double volume)
	{
		System.out.println("iPhone14 speakers 3.0V");
	}
/*
@Override
	public static void buildVersioniPhone13()
	{
		System.out.println("825385723kLuej756");
	}	
	*/
	
	public static void buildVersioniPhone13()
	{
		System.out.println("9876575775gttge876");
	}	
	
	
	public static void main(String[] args) {
		//Assigning parent class object to parent class reference variable
		iPhone14 obj=new iPhone14();
		//Assigning child class object to child class reference variable
		iPhone13 iphone13=new iPhone13();
		iphone13.iPhone13Features();
		iphone13.speakersV(124);
		iphone13.buildVersioniPhone13();
		
		System.out.println("***Parent class object in Child class reference var***");
		
		//Parent class object in Child class reference var
	
	//	iPhone14 obj14=(iPhone14) new iPhone13();
		iPhone13 obj13= new iPhone14();
		obj13.speakersV(123);
		obj13.iPhone13Features();
		obj13.buildVersioniPhone13();
		
		System.out.println("Parent class object can't be directly stored in child class reference var");
		/*//Doesn't work
		//iPhone14 obj14=new iPhone13();
		iPhone14 obj14=(iPhone14) new iPhone13();
		obj14.iPhone13Features();
		obj14.speakersV(456);
		obj14.buildVersioniPhone13();
		obj14.iPhoneCamMegaPix();
		*/
		
		//Calling Static methods directly with class name
		iPhone14.buildVersioniPhone13();
		iPhone13.buildVersioniPhone13();
	}
	}

