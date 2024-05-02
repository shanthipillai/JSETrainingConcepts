package jse.training.inheritance.singleinheritance;
//iPhone14 is child class of iPhone13
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
	public void speakersV()
	{
		System.out.println("iPhone13 speakers 4.0V");
	}

		
		
		
	}

