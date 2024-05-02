package jse.training.userinput;

public class MainArgs {

	public static void main(String[] args) {
		System.out.println("Enter first argument");
		int arg1=Integer.parseInt(args[0]);
        System.out.println(arg1);
        
        System.out.println("Enter second argument");
		int arg2=Integer.parseInt(args[1]);
        System.out.println(arg2);
	}

}
