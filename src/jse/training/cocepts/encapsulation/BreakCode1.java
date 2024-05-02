package jse.training.cocepts.encapsulation;

public class BreakCode1 {

	public static void main(String[] args) {
    ProductNoEncaps prod=new ProductNoEncaps();
    //breaking your class 
    prod.serielID="heypassingvalues"+"\n"+"withescapesequence"+"123"+"and nos";
    System.out.println(prod.serielID);
    		
   //breaking your class 
    prod.serielID="heypassingvalues"+prod.getDBConnection()+"cracking your code by calling your method";	
    System.out.println(prod.serielID);
    
    
    ProductEncaps prod2=new ProductEncaps();
    prod2.setSerielID("heypassingvalues\"+\"\\n\"+\"withescapesequence\"+\"123\"+\"and nos");
	System.out.println(prod2.getSerielID());
	
	prod2.setSerielID("helloproperstring");
	System.out.println(prod2.getSerielID());
	}

}
