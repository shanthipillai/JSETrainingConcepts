package jse.training.userinput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReaderClass {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	System.out.println("Enter Name");
    String name=br.readLine();
    System.out.println(name);
    
    
    //Similarly try Short and Byte as well
    System.out.println("Enter Id");
    //Converting String to Integer using Wrapper Classes
    int rollno=Integer.parseInt(br.readLine());
    
    System.out.println("Enter Contact No");
    long contactNo=Long.parseLong(br.readLine());
    System.out.println(contactNo);
    
    System.out.println("Enter Salary ");
    //Converting String to Double using Wrapper Classes
    double salary=Double.parseDouble(br.readLine());
    System.out.println(salary);
    
    //Converting String to Float using Wrapper Classes
    
    System.out.println("Enter your PF deduction");
    float PF=Float.parseFloat(br.readLine());
    System.out.println(PF);
    
    //Converting String to  String to Char 
    System.out.println("Your First Name:");
    char firstNameFirstChar=br.readLine().charAt(0);
    System.out.println(firstNameFirstChar);
    
    
	}

}
