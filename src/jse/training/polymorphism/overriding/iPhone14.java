package jse.training.polymorphism.overriding;
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
		System.out.println("iPhone13 speakers 3.0V");
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
		iPhone14 obj=new iPhone14();
		obj.speakersV(244);
		obj.iPhone13Features();
		obj.buildVersioniPhone13();
		obj.iPhoneCamMegaPix();
	}
	}

