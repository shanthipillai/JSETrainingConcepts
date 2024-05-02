package jse.training.conidtionalstatements.switchcase;

import java.util.Scanner;

public class SwitchLevelGame {
	public static void testYourMathis(int i)
	{
		Scanner sc=new Scanner(System.in);
		switch(i)
		{
		case 1:   System.out.println("You are at level 1");
		          System.out.println("Solve the challenge 24+25");
		          int l1=sc.nextInt();
		          switch(l1)
		          {
		              case 49: 
		            	  i=2;
		        	  testYourMathis(i);
		        	  break;
		        	  
		        	 default: 
		        		 System.out.println("Oh no! that was a wrong guess");
		        		 System.out.println("Do you want to try again/exit");
		        		 System.out.println("Enter \"Yes\" or \"No\" ");
		        		 String val=sc.next();
		        		 switch(val)
		        		 {
		        		 case "Yes": i=1;
		        		 testYourMathis(i);
		        		 break;
		        		 
		        		 case "No": System.out.println("Exiting from Levels");
		        			 break;
		        		 }
		        		 
		        		 break;
		        	  
		          }
		          
		          break;
		          
		case 2: System.out.println("Congratulations !! You are in level2");
		        System.out.println("Solve the challenge (55*192)/15+100");
		       	int l2=sc.nextInt();
		        switch(l2)
		          {
		              case 804: 
		            	 i=3; 
		        	  testYourMathis(i);
		        	  break;
		              default: 
			        		 System.out.println("Oh no! that was a wrong guess");
			        		 System.out.println("Do you want to try again/exit");
			        		 System.out.println("Enter \"Yes\" or \"No\" ");
			        		 String val1=sc.next();
			        		 switch(val1)
			        		 {
			        		 case "Yes": i=2;
			        		 testYourMathis(i);
			        		 break;
			        		 
			        		 case "No": System.out.println("Exiting from Levels");
			        			 break;
			        		 }
			        break;
		          }
		        break;
	    case 3: System.out.println("hurrah !! You are in level3");
		  	    System.out.println("Solve the challenge (18*75)/9+3403)");
		  	    int l3=sc.nextInt();
		  	    
		  	          switch(l3)
		  	          {
		  	              case 3553: 
		  	            	 i=4; 
		  	        	  testYourMathis(i);
		  	        	  break;
		  	              default: 
		  		        		 System.out.println("Oh no! that was a wrong guess");
		  		        		 System.out.println("Do you want to try again/exit");
		  		        		 System.out.println("Enter \"Yes\" or \"No\" ");
		  		        		 String val2=sc.next();
		  		        		 switch(val2)
		  		        		 {
		  		        		 case "Yes": i=3;
		  		        		 testYourMathis(i);
		  		        		 
		  		        		 break;
		  		        		 
		  		        		 case "No": System.out.println("Exiting from Levels");
		  		        			 break;
		  		        		 }
		  		       break;
		  		       
		  	          }
		  	          break;
	     case 4: System.out.println("level4 is not updated...");	        
		         break;
		 default: System.out.println("Game Finished");	 
		 break;
		}	  
		        
		  
		      
		}
		private static void swtich(String in) {
		// TODO Auto-generated method stub
		
	}
		public static void main(String[] args) {
	System.out.println("Let's start the Game!!");			

	int i=1;
	testYourMathis(1);

		}

}
