package jse.training.cocepts.io.systemclass;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Systemtest {
public static void main(String[] args) throws IOException {
	//Console console=System.console();
	//System.out.println("Enter value");
	//String s=console.readLine();
	//System.out.println(s);
	//int n=System.in.read();
	File f=new File("D:\\test.txt");
	PrintStream ps=new PrintStream(f);
	ps.append('#');

	
	
}
}
