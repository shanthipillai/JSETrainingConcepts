package jse.training.strings;

public class StringObjectCreation {
public static void main(String[] args) {
	String name="Sharvani";
	
	String name2="Sharvani1";
	System.out.println(name);
	System.out.println(name2);
	
	System.out.println(name==name2);
	
	System.out.println(name.equals(name2));
	
	
	
	String name1=new String("Sharvani");
	
	//name name1 Content Comparition 
	System.out.println(name.equals(name1));
	System.out.println(name==name1);
}
}
