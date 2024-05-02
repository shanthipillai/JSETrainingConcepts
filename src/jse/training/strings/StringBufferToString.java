package jse.training.strings;

public class StringBufferToString {
public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer("stringbuilder_string");
	
	System.out.println(sb1);
	sb1.append("append1");
	System.out.println(sb1);
	//stringbuilder_stringappend1
	
	String string=new String(sb1);
	System.out.println(string);
	
	string.concat("concat");
	System.out.println(string);
}
}
