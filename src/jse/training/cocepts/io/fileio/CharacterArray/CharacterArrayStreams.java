package jse.training.cocepts.io.fileio.CharacterArray;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterArrayStreams {

	public static void writeCharacterArrays() throws IOException
	{
		FileWriter fis=new FileWriter("D:\\chararry.txt");
		char[] c= {'h','e','l','l','o'};
		CharArrayWriter caw=new CharArrayWriter();
		
		
		caw.write(c);
		caw.write("another string");
		caw.writeTo(fis);
		caw.close();
		fis.close();
		
	}
	
	public static void readCharacterArrays() throws IOException
	{
		File f=new File("D:\\chararry.txt");
		FileReader fis=new FileReader(f);
        char c[]=new char[(int) f.length()];
        fis.read(c);
	    for(char ch:c)
	    {
	    	//System.out.print(ch);
	    }
	
	    CharArrayReader car=new CharArrayReader(c);
	    
	    int cr;
	    while((cr=car.read())!=-1)
	    {
	    	System.out.print((char)cr);
	    }
	
	 
	}
	
	public static void main(String[] args) throws IOException {
		//CharacterArrayStreams.writeCharacterArrays();
		CharacterArrayStreams.readCharacterArrays();
		
		
		
	}
}
