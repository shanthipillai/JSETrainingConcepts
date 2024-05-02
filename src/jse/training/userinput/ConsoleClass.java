package jse.training.userinput;

import java.io.Console;

public class ConsoleClass {
public static void main(String[] args) {
	Console console=System.console();

	System.out.println("Enter User Id");
	String userId=console.readLine();
	System.out.println(userId);
	
	System.out.println("Enter Password");
	char[] password=console.readPassword();
	System.out.println(password);
	

}
}
