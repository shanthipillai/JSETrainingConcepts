package jse.training.cocepts.io.fileio.bytearraystreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ByteArrayStreams {
	public static void readOneFileDataToOtherFiles() throws IOException {
	  
	     FileOutputStream file1=new FileOutputStream("D:\\file1.txt");
	     FileOutputStream file2=new FileOutputStream("D:\\file2.txt");
	     ByteArrayOutputStream baos=new ByteArrayOutputStream();
	     baos.write("convert string to bytes".getBytes());
	     baos.writeTo(file1);
	     baos.writeTo(file2);
	     baos.close();
		}
	
	public static void readOneFileDataToConsole() throws IOException {
     File f=new File("E:\\bytearray.txt");
     byte filebytes[]=new byte[(int) f.length()];
     FileInputStream fis=new FileInputStream(f);
     fis.read(filebytes);
     ByteArrayInputStream bis=new ByteArrayInputStream(filebytes);
     
     int i;
     while((i=bis.read())!=-1)
     {
    	 System.out.print((char)i);
     }
     
     bis.close();
     fis.close();
	}
	public static void writeData() throws IOException {
		byte[] buf = { 35, 36, 37, 38 };
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
	  
		int k = 0;
		while ((k = byt.read()) != -1) {
			// Conversion of a byte into character
			char ch = (char) k;
			System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
		 
		}
		   byt.close();
	}
	
	public static void main(String[] args) throws IOException {
		//ByteArrayStreams.writeData();
		//ByteArrayStreams.readOneFileDataToConsole();
		ByteArrayStreams.readOneFileDataToOtherFiles();
	}
}