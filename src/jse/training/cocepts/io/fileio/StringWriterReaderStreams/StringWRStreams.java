package jse.training.cocepts.io.fileio.StringWriterReaderStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWRStreams {
	static char[] c;
	public static void simpleReadData() throws IOException
	{
		StringReader sr=new StringReader("this data will be read");
		  int x;
	        
	        while((x=sr.read())!=-1)
	        {
	        	System.out.print((char)x);
	        }
	        sr.close();
	}
	
	
	public static void writeStringStream() throws IOException
	{
		StringWriter sw=new StringWriter();
		sw.write("stringvalue");
	    String stringval=	sw.toString();
	    CharArrayWriter fw=new CharArrayWriter();
	    fw.write(stringval);
	    fw.writeTo(new FileWriter("D:\\writestringarraytext.txt"));
	 
		
	}
	public static void fileReadData() throws IOException
	{
		File f=new File("D:\\text1.txt");
		
		
		FileReader fr=new FileReader(f);
		 c=new char[(int) f.length()];
	    fr.read(c);
	    String str=String.valueOf(c);
	    System.out.println(str.length());
		StringReader sr=new StringReader(str);
        int x;
        
        while((x=sr.read())!=-1)
        {
        	System.out.print((char)x);
        }
        sr.close();
	}
	

public static void main(String[] args) throws IOException {
	//StringWRStreams.fileReadData();
//	StringWRStreams.simpleReadData();
	/*
	StringWriter sw=new StringWriter();
	sw.write("stringvalue");
    String stringval=	sw.toString();
    System.out.println("Printting String");
    System.out.println(stringval);
    */
	StringWRStreams.writeStringStream();
}
}
