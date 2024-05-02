package jse.training.cocepts.io.fileio.inputoutputstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Requirement1 {
public static void main(String[] args) throws IOException {
	//Utilizing Buffered Reader
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your userId");
	String userid=br.readLine();
	
	System.out.println("Enter Password");
	String pwd=br.readLine();
	
	System.out.println("You have entered the userid  " 
	                                 +userid
	                                 +"with password    "
	                                 +pwd);
	
	
	//Utilizing Scanner Class
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your userId");
	String userId=sc.next();
	
	System.out.println("Enter Password");
	String password=sc.next();
	
	System.out.println("You have entered the userid   " 
            +userId
            +"with password    "
            +password);
	
}
}
