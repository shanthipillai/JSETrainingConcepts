package jse.training.stringbuffer;

public class StringToStringBuffer {
	public static void main(String[] args) {
		String name="It's initially string type";
		name.concat("concatString");
		System.out.println(name);
		
		
		
		StringBuffer sb=new StringBuffer(name);
		sb.append("string append");
		System.out.println(sb);
	}
}
