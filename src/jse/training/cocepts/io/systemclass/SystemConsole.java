package jse.training.cocepts.io.systemclass;

import java.io.Console;

//Run this program in command prompt by copying this file
public class SystemConsole {

	public static void main(String[] args) {

		Console console = System.console();
		System.out.println("Enter Username:");
		String username = console.readLine();
		System.out.println(username);
		char[] password = console.readPassword();
		System.out.println(password.toString());
	}

}
