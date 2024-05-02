package jse.training.cocepts.io.systemclass;

import java.io.IOException;

public class SystemObjects {
public static void main(String[] args) throws IOException {
	System.out.println("System class gives the object of PrintStream and by using the object\n call the println method of PrintStream class.");
   System.out.println("Enter a values");
	int i=System.in.read();
	System.out.println(i);
	System.err.print("Error message");
	
}
}
