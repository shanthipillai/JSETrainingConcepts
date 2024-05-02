package jse.training.stringbuffer;

public class ReverseString {
public static void main(String[] args) {
	//String class doesn't contain reverse method , you need apply from scrach else use this way
	
	String reverseTheString="this string will be reversed by string buffer";
	//Converting String to String Buffer Object to utlize the reverse method
	StringBuffer sb=new StringBuffer(reverseTheString);
	//Calling reverse method
	System.out.println(sb.reverse());
	//Converting back to STring from String Buffer
	String s=new String(sb);
	//Printing the String
	System.out.println(s);
	
//Little Advance and direct way
	//Directly utilize in one step
	String reverseTheString1=new String(new StringBuffer(reverseTheString).reverse());
   System.out.println(reverseTheString1);
}
}
