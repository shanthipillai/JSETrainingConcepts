package jse.training.typecasting;

public class Widening {
	//Implicit Conversion or Casting Down or Widening
	public static void main(String[] args) {
		byte b=120;
		short s=20000;
		int i=400000;
		long l=500000;
		
		//Converting the Non-decimal data types to Bigger data types
		
		//byte Conversion
		short sb=b; //120
		int ib=b;   //120
		long lb=b;  //120
		System.out.println("Output of Byte Conversions");
		System.out.println(sb);
		System.out.println(ib);
		System.out.println(lb);
		System.out.println("End of Byte Conversions");
		
		System.out.println("Output of Short Conversions");
		int is=s; //20000
		long ls=s; //20000
		System.out.println(is);
		System.out.println(ls);
		System.out.println("End of Short Conversions");
		
		System.out.println("Output of Int Conversions");
	
		System.out.println("End of Short Conversions");
		long li=i; //400000
		System.out.println(li);
	    System.out.println("End of Long Conversions");
		
		
	    
	    //Decimal Conversion
	    float f=3.1f;
	    double d=23.44;
	    
	    System.out.println("Out put of Float Conversions");
	    double df=f;
	    System.out.println(df);
	    System.out.println("End of Float Conversions");
	}

}
