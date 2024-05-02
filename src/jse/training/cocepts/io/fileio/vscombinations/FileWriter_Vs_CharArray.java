package jse.training.cocepts.io.fileio.vscombinations;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import oracle.sql.ARRAY;

public class FileWriter_Vs_CharArray {

	public static void fileWriterFeature() throws FileNotFoundException
	{
		String name="convertthisstringtobytes";
		char namebytes[]=  name.toCharArray();
		
		/*
		 * Here Both FileReader and CharacterArrayReader works on characters
		 * but 
		 */
		FileReader fr=new FileReader(name);
		
		CharArrayReader car=new CharArrayReader(namebytes);
	
		
	}
	
	public static void charArrayFeatures() throws IOException
	{
		//Character Writing operations both same,  but FileWriter looks
		//easy 
		FileWriter fw=new FileWriter("D:\\fw.txt");
		fw.write("hello");
		
		
		
		CharArrayWriter caw=new CharArrayWriter();
		caw.write("hello");
		caw.writeTo(fw);
	}
}
