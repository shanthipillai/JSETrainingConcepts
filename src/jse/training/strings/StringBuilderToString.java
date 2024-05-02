package jse.training.strings;

public class StringBuilderToString {
public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder("stringbuilder_string");
	System.out.println(sb1);
	sb1.append("append1");
	System.out.println(sb1);
	
	
	String string=new String(sb1);
	System.out.println(string);
	string.concat("concat");
	System.out.println(string);
	
	
	
	
	
}
}
