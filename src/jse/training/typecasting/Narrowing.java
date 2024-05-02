package jse.training.typecasting;

public class Narrowing {
//Explicit Conversion or  Up Cast
	
	public static void main(String[] args) {
		//No Guarantee of data , possibility data loss.
		System.out.println("Conversion of short types to smaller datatypes");
		short s=340;
		byte b=(byte)s;
		System.out.println(b);
		System.out.println("End of short conversion");
		
		System.out.println("Conversion of int types to smaller datatypes");
		int  i=122;
	    short is=(short) i;
	    byte ib=(byte) i;
		System.out.println(is);
		System.out.println(ib);
		System.out.println("End of int conversion");
		
		System.out.println("Conversion of long types to smaller datatypes");
		int  l=32000;
		int li=(int)l;
	    short ls=(short) l;
	    byte lb=(byte) l;
		System.out.println(li);
		System.out.println(ls);
		System.out.println(lb);
		System.out.println("End of long conversion");
		
		
		System.out.println("Conversion of double types to smaller datatypes");
		double d=3.1467889999000;
		float df=(float) d;
		System.out.println(df);
		
	}
}
