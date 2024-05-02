package jse.training.userinput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass2 {
	public static void main(String[] args) {
		// Initialize Scanner object
	
		Scanner scan = new Scanner("JavaTpoint programming,Abhishek,Male,22");
		// Initialize the string delimiter
		scan.useDelimiter(",");
		// Printing the tokenized Strings
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		Scanner scan1 = new Scanner("11:12:13:22");
		scan1.useDelimiter("\\:");
		while (scan1.hasNextInt()) {
			System.out.println(scan1.nextInt());
		}

	
		
		
		
		
	
	//can3.close();
	
		scan1.close();
		scan.close();
	}
	
	
}
