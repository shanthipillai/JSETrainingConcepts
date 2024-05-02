package jse.training.userinput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass3 {
public static void main(String[] args) {

	Scanner scan = new Scanner("HelloHello! SSSIT 102 Hindi100 150 123");  
    //Skip the word that matches the specified pattern  

    scan.skip(Pattern.compile("..llo"));
    System.out.println("Left String: " +scan.nextLine());  
   

    scan.close();  
    
}
}
