package jse.training.strings;

public class StringManipulations {
public static void main(String[] args) {
	String name="Sharavani123%@7";
	String name1=new String("Java");

	//total length of the string
	System.out.println(name.length());
	
	char charatindex=name.charAt(2);
	System.out.println(charatindex);
	System.out.println(name.charAt(2));
	
	System.out.println(name.compareTo("Sharvani123%@7"));
	System.out.println(name.compareTo("Sharvani"));
	System.out.println("String".compareTo("string"));
    System.out.println("StRing".compareToIgnoreCase("string"));
	String fruitsbask1="apple";
	String fruitsbask2="mango";
	//Letter A Comes before M , so negative
	System.out.println("Fruit Basket "+fruitsbask1.compareTo(fruitsbask2));
	System.out.println("Fruit Basket "+fruitsbask2.compareTo(fruitsbask1));
	System.out.println("Fruit Basket "+fruitsbask1.compareTo(fruitsbask1));
	
	
	String concatString=name.concat("Benjjanki");
	System.out.println(concatString);
	System.out.println(name.concat("Benjjanki"));
	
	System.out.println(name.contains("r"));
	System.out.println(name.contains("rh"));
	System.out.println(name.contains("rv"));

	System.out.println(name.endsWith("@7"));
	System.out.println(name.endsWith("#7"));
	
	System.out.println(name.equals("Sharvani123%@7"));
	System.out.println(name.equals("Sharvani123%@"));
	
	System.out.println("Sharvani".equalsIgnoreCase("SHaRVani"));
	
	
	System.out.println(name.indexOf('a'));
	System.out.println(name.lastIndexOf('a'));
	System.out.println(name.indexOf('a', 3));
	System.out.println(name.indexOf("rav", 1));
	System.out.println("If No Char"+name.indexOf('K'));
	String emptyString=" ";
	
	System.out.println("".isEmpty());
	System.out.println(" ".isEmpty());
	
	String hash1="Aa";
	String hash2="BB";
	String hash3="Be";
	
	System.out.println(hash1.hashCode());
	System.out.println(hash2.hashCode());
	System.out.println(hash3.hashCode());
	
	//Refer Regular Expressions
	System.out.println(name.matches("0-9"));
	
	
name.replace('a', 'z');

System.out.println(name.replace('a', 'z'));

System.out.println(name.replace("rav", "var"));

//Removing the spaces between the String
String removespace="my name is Sharvani";
System.out.println(removespace.replace(" ", ""));

System.out.println(name.lastIndexOf("vani"));


System.out.println(name.startsWith("Sh"));


System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());

System.out.println(name.substring(1));
System.out.println(name.substring(0, 9));

String stringToTrim=" this string will be trimmed ";
System.out.println("length");
System.out.println(stringToTrim.length());
System.out.println(stringToTrim.trim().length());
System.out.println("Above Result");
byte[] bytes=name.getBytes();

for(byte b:bytes)
{
	System.out.println(b);
}


System.out.println(name.codePointAt(1));




}
}
