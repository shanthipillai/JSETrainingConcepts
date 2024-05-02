package jse.training.cocepts.io.fileio.basicconverstion.understanding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Conversions {

	public static void bytesPrint()
	{
		byte bytes[]= {94,97,100,55,45};
		for(byte byteb:bytes)
		{
			System.out.print((char)byteb);
		}
	}
	public static void convertStringToBytes()
	{
		String data="this stiring will be converted into bytes by below operation";
		byte[] stringBytes=data.getBytes();
		
		//Print Bytes
		
		for(byte stringByte:stringBytes)
		{
			System.out.println((char)stringByte);
		}
	}
	
	
	public static void convertFileInToBytes() throws IOException
	{
		File file=new File("E:\\convertbytes.txt");
		FileInputStream fis=new FileInputStream(file);
		byte emptyToBytesArray[]=new byte[(int)file.length()];
		//Print byte array before reading fis to byte array
		
		System.out.println("Before File converting into bytes");
		for(byte bytes:emptyToBytesArray)
		{
			System.out.println((char)bytes);
		}
		fis.read(emptyToBytesArray);
		System.out.println("After File converting into bytes");
		for(byte bytes:emptyToBytesArray)
		{
			System.out.println((char)bytes);
		}
		
	}
	public static void main(String[] args) throws IOException {
		Conversions.bytesPrint();
		Conversions.convertFileInToBytes();
		Conversions.convertStringToBytes();
	}
}
