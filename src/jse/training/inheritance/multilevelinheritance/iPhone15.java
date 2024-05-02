package jse.training.inheritance.multilevelinheritance;

public class iPhone15 extends iPhone14{
	iPhone15()
	{
		System.out.println("IPhone15 launched");
	}
	
	public void fingerPrintImprovised()
	{
		System.out.println("Finger Print V7");
	}
	
	@Override //Annotation
	public void iPhone13Features() {
		System.out.println("IPhone13 Features has been enhanced");
	}
	public static void main(String[] args) {
		iPhone15 iPhone15=new iPhone15();
		System.out.println(iPhone15.screenSize);
		iPhone15.iPhone13Features();
		iPhone15.speakersV();
		iPhone15.iPhoneCamMegaPix();
		iPhone15.fingerPrintImprovised();
		
	}
}
