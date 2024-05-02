package jse.training.concepts.datatypes;



public class Datatypes {
	byte b;
	short s;
	int i;
	float f;
	long l;
	double d;
	char c;
	String str;
	
	static int st;
	
	//final int fi;
	public static void main(String[] args) {
		
		
		Datatypes dt=new Datatypes();
		
		System.out.println("Default value of byte="+dt.b);
		System.out.println("Default value of short="+dt.s);
		System.out.println("Default value of int="+dt.i);
		System.out.println("Default value of float="+dt.f);
		System.out.println("Default value of long="+dt.l);
		System.out.println("Default value of double="+dt.d);
		System.out.println("Default value of char="+dt.c);
		System.out.println("Default value of String="+dt.str);
		
		System.out.println(Datatypes.st);
		
	}

}
