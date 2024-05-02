package jse.training.cocepts.io.fileio.inputoutputstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Requiremnt2 {
	
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Card details ");
	String cardDetails=br.readLine();
    long carddetails=Long.parseLong(cardDetails);
    
    
   System.out.println("Enter Pin");
   String pin= br.readLine();
   short pindetails=Short.parseShort(pin);
   
   System.out.println("Enter Name on your card");
   String name=br.readLine();
   
   
   BankValiation obj=new BankValiation();
   
   obj.bankDetails(carddetails, pindetails, name);
}
}
