package jse.training.strings;

public class StringImmutable {
public static void main(String[] args) {
	String firstname="firstName";
	String lastname="lastName";
	
	System.out.println(firstname.concat(lastname));
	System.out.println(firstname);
	
	
	String fullname=firstname.concat(lastname);
	System.out.println(fullname);
}
}
