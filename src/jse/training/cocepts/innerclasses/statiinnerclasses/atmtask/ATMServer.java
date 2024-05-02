package jse.training.cocepts.innerclasses.statiinnerclasses.atmtask;

import java.util.Scanner;

public class ATMServer {
	int x=10;
	static int y=20;
//This ATM accepts only ICICI & HDFC Cards 
	static class ConnectICICIBankServer
	{
		public void connectICICI()
		{
			System.out.println(new ATMServer().x);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Select \n 1. Withdraw \n 2. Balance Enquiry");
			int x=sc.nextInt();
			ICICIATMService icici=new ICICIATMService();
			switch(x)
			{
			case 1: System.out.println("Enter amount");
		                double amt=	sc.nextDouble();
		                String status=icici.withdraw(amt);
		                System.out.println(status);
				        break;
				        
			case 2: double balance=icici.checkBalance();
			            System.out.println("Available balance"+balance);
			             break;
			}
		
		}
	      
	}
	
	static class ConnectHDFCBankServer
	{
		public void connectHDFC()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Select \n 1.withdraw \n 2. Balance Enquiry");
			int x=sc.nextInt();
			HDFCATMService hdfc=new HDFCATMService();
			switch(x)
			{
			case 1: System.out.println("Enter amount");
		                double amt=	sc.nextDouble();
				         String status=hdfc.withdraw(amt);
				         System.out.println(status);
				        break;
				        
			case 2: double balance=hdfc.checkBalance();
			            System.out.println("Available balance"+balance);
			             break;
			}
		
		}
		}
	
	
	
   public void selectType()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Select \n 1. HDFC \n 2. for ICICI");
	   int select=sc.nextInt();
			   
	   System.out.println();
	   switch(select)
	   {
	   case 1: ATMServer.ConnectHDFCBankServer hdfc=new ATMServer. ConnectHDFCBankServer();
	                hdfc.connectHDFC();
	               
		           break;
	   case 2:  ATMServer.ConnectICICIBankServer icici=new ATMServer.ConnectICICIBankServer();
	                icici.connectICICI();
		           break;
	   }
   }
}
