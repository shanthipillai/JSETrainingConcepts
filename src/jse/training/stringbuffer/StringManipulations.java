package jse.training.stringbuffer;

public class StringManipulations {
public static void main(String[] args) {
//Thread Safe :: Synchronized
	//Mutable 
	
	StringBuffer buffer=new StringBuffer("testingtestinginn");

	System.out.println(buffer);
	
 System.out.println(buffer.length());
 System.out.println(buffer.capacity());
 buffer.trimToSize();
 System.out.println(buffer.capacity());
 
 
 //All data type append is acceptable here
 buffer.append(true);
 System.out.println(buffer);
 buffer.append('#');
 System.out.println(buffer);
buffer.append(22.2);
System.out.println(buffer);
buffer.append(12.3f);
System.out.println(buffer);
buffer.append("testing");
System.out.println(buffer);
buffer.append(12);
System.out.println(buffer);
//ASCCI A: 65
buffer.appendCodePoint(65);
System.out.println(buffer);

System.out.println(buffer.charAt(5));
System.out.println(buffer.codePointAt(5));
System.out.println(buffer.codePointBefore(5));
System.out.println(buffer.codePointCount(0, 5));

System.out.println("Aa".hashCode());
System.out.println("Bb".hashCode());


System.out.println(buffer.indexOf("e", 5));
System.out.println(buffer.indexOf("e"));


System.out.println(buffer.lastIndexOf("e", 5));
System.out.println(buffer.lastIndexOf("e"));


System.out.println(buffer.substring(5));
System.out.println(buffer.substring(5, 10));

StringBuffer sb=new StringBuffer("deletedstring");
System.out.println(sb.delete(5, 7));
System.out.println(sb.deleteCharAt(7));

//You can insert any datatype 
System.out.println(sb.insert(2, "insert"));
System.out.println(sb.insert(2, true));
System.out.println(sb.insert(2, 22.f));

System.out.println(sb.reverse());




}
}
