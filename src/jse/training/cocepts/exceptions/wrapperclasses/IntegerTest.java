package jse.training.cocepts.exceptions.wrapperclasses;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class IntegerTest  {
	
	
	public static void IntCompareMethod()
	{
		int i=10;
		int j=10;
		System.out.println(Integer.compare(i, j));
	}
	
	
	public static void IntegerCompareToMethod()
	{
		Integer in1=new Integer(10);
		Integer in2=new Integer(10);
		System.out.println(in1.compareTo(in2));
	}
	public static void convertObjectTypeToOtherType()
	{
		Integer in=new Integer(10);
	   float f=	in.floatValue();
	  double  d  = in.doubleValue();
	  byte b=in.byteValue();
	  short s=in.shortValue();
	 long l= in.longValue();
	 String str    =in.toString();
	}
	
	public static void convertDatatypeToObject(int datatype)
	{
		Integer intToInteger1=new Integer(datatype);
		Integer intToInteger2=Integer.valueOf(datatype);
		
		
		System.out.println(intToInteger1+2);
		System.out.println(intToInteger2+2);
		
	}
	
	
	public void convertStringtoIntegerObj(String s)
	{
		Integer stringToIntegerObject=new Integer(s);
		System.out.println(stringToIntegerObject);
	}
	
	public void convertStringtoIntType(String s)
	{
		int stringToIntType=Integer.parseInt(s);
		
		System.out.println(stringToIntType);
	}
	public static void convertObjecttoDatatype(Integer intobj)
	{
		int int1 =intobj.intValue();
		float floatval=intobj.floatValue();
		System.out.println(int1);
	}
	
	public static void convertToOtherDatatype(Integer intobj)
	{
		float floatval=intobj.floatValue();
        short shortval=intobj.shortValue();
		long longval=intobj.longValue();
		Byte byteval=intobj.byteValue();
		Double doubleval=intobj.doubleValue();
		String str=Integer.toString(intobj);
		System.out.println(floatval);
		System.out.println(shortval);
		System.out.println(longval);
		System.out.println(byteval);
		System.out.println(str);
		System.out.println(doubleval);
		Integer in=Integer.getInteger("10");
		System.out.println("val"+in);
		;
	}
	
	public static void otherMethods(int intVal)
	{
		int xx=Integer.parseInt("3.14");
		System.out.println(xx);
		
		//System.out.println(Integer.reverse(13));
		System.out.println(Integer.toBinaryString(13));
		int x=Integer.parseInt(Integer.toBinaryString(13));
		System.out.println(Integer.toHexString((13)));
		System.out.println(Integer.toOctalString(13));
	
		System.out.println(Integer.sum(2, 3));
		System.out.println(Integer.max(45, 77));
		System.out.println(Integer.max(45, 77));
		System.out.println(Integer.min(45, 77));
		System.out.println(Integer.compare(7,7));
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(Integer.compare(i1,i2));
		System.out.println(i1.compareTo(i2));
		System.out.println(i1==i2);
	}
	
public static void main(String[] args) throws ClassNotFoundException {

	
	IntegerTest.IntCompareMethod();
	IntegerTest.IntegerCompareToMethod();
	
//	int xx=Integer.parseInt("3.14");
	//int xy=Integer.parseUnsignedInt("3.14");
	float fy=Float.parseFloat("10");
	//System.out.println(xx);
	System.out.println(fy);
	
	
	
Class clss=Class.forName("java.lang.Integer");

Class m[]=clss.getDeclaredClasses();
for(Class mem:m)
{
	System.out.println(mem.getName());
}

IntegerTest.convertDatatypeToObject(10);
IntegerTest.otherMethods(10);
String str = "sun.arch.data.model";  
System.out.println("Value = "+Integer.getInteger(str));  

AtomicInteger ai=new AtomicInteger(10);
System.out.println(ai.getAndIncrement());
System.out.println(ai);
System.out.println(ai.incrementAndGet());
AtomicInteger i=new AtomicInteger(1);


}
}
