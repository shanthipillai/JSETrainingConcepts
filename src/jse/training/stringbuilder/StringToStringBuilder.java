package jse.training.stringbuilder;

public class StringToStringBuilder {
public static void main(String[] args) {
	String name="It's initially string type";
	name.concat("concatString");
	System.out.println(name);
	StringBuilder sb=new StringBuilder(name);
	sb.append("string append");
	System.out.println(sb);
}
}
