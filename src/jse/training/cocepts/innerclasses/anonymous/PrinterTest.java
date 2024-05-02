package jse.training.cocepts.innerclasses.anonymous;

public class PrinterTest {
public static void main(String[] args) {
	//Interface-Anonymous Inner Classes
	Printer printer=new Printer()
			{

				@Override
				public void print() {
				System.out.println("Printer Process changed on 27th");
					
				}
		
			};
			
			
			Printer printer1=new Printer()
			{

				@Override
				public void print() {
				System.out.println("Printer Process changed on 27th afternoon");
					
				}
		
			};
			//Concrete Class- Anonymous
			PrintClass printer2=new PrintClass()
					{
				@Override
				       public void print()
				       {
				    	   System.out.println("Printing from anonymous");
				       }
					};
			//Abstract-Anonymous
					
					PrinterAbstract printer3=new PrinterAbstract() {
						
						@Override
						public void print() {
						System.out.println("Printer Abstract Anonymous");
							
						}
					};
					
			printer.print();
			printer1.print();
			
			printer2.print();
			printer2.anotherMethod();
			
			printer3.print();
}
}
