package jse.training.strings;

public class RegularExpressionString {
public static void main(String[] args) {
	//Remove repeating characters
	String sample="aabbccddeexyu123@";
	System.out.println(sample.replaceAll("[a+e+]", ""));
	
	System.out.println(sample.replaceAll("[^a+e+]", ""));
	//Remove Vowels
	System.out.println(sample.replaceAll("[aeiou]", ""));
	
	//Remove Consonants
	System.out.println(sample.replaceAll("[^aeiou]", ""));
	
	//Remove Digits
	System.out.println(sample.replaceAll("[0-9]", ""));
	
	//Replace a-z , 0-9 except bc 
	System.out.println(sample.replaceAll("[a-z0-9&&[^bc]]", ""));
	
	System.out.println(sample.replaceAll("[0-9bc]", ""));
	System.out.println(sample.replaceAll("[a-z0-9]", ""));
	
	//Remove space from the String
	String removeSpace="Hey how you doing today?";
	System.out.println(removeSpace.replaceAll(" ", ""));
	
	String splitString="Good Morining";

	String splitarr[]=splitString.split("\\s");
	for(String val:splitarr)
	{
		System.out.println(val);
	}

	
}
}
