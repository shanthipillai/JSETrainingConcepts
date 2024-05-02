package jse.training.cocepts.io.fileio.inputoutputstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamClosePoints {
public static void main(String[] args) throws IOException 
{
	FileInputStream fis=new FileInputStream("E:\\fissterams.txt");	
//	int i=fis.read();
	System.out.println((char)fis.read());
	System.out.println((char)fis.read());
	int x;
	while((x=fis.read())!=-1)
	{
		System.out.print((char)x);
	}
	
	fis.close();
	System.out.println((char)fis.read());
	
}

}
