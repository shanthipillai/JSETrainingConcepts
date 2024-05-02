package jse.training.inheritance.multilevelinheritance;
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
	public static void main(String[] args) {
		iPhone14 obj=new iPhone14();
		System.out.println(obj.screenSize);
		obj.iPhone13Features();
		obj.iPhoneCamMegaPix();
		obj.speakersV();
		
		
		iPhone13 iphone13=new iPhone13();
		System.out.println(iphone13.screenSize);
		iphone13.speakersV();
		iphone13.iPhone13Features();
		
		
		
	}
}
