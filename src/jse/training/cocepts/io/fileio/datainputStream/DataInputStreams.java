package jse.training.cocepts.io.fileio.datainputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreams {
	
	public static void writeDataIntoFile() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\datainputbytes.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.write("converting this into bytes".getBytes());
		   dos.close();
	}
	
	public static void writePrimitivesToFile() throws IOException
	{
		//FileOutputStream fos=new FileOutputStream("E:\\datainputprims.txt");
		FileOutputStream fos=new FileOutputStream("E:\\datainputprimst.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		/*
		dos.write(10);
		dos.writeBytes("nametobyes");
		dos.writeBoolean(true);
		dos.writeFloat(3.14f);
		dos.writeDouble(3.155);
		dos.writeByte(11);
		dos.writeLong(123455);
		dos.writeShort(546);
		dos.writeChar('c');
		dos.writeChars("ascharacters");
		*/
		dos.writeInt(10);
	    dos.writeFloat(3.14f);
	    dos.writeDouble(3.155);
		dos.writeByte(11);
		dos.writeLong(123455);
		dos.writeShort(546);
		dos.writeChar('c');
	    dos.writeBoolean(true);
		
		dos.close();
	}
	
	public static void readPrimitivesFromFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\datainputprimst.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readByte());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		/*
		System.out.println(dis.readByte());
		System.out.println(dis.readFloat());
		System.out.println(dis.readChar());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		System.out.println(dis.readByte());
	*/
		dis.close();
	}
	
	public static void writeOnlyInts() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\writeints.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(11);
		dos.writeInt(12);
		dos.writeInt(89);
		FileInputStream fis=new FileInputStream("E:\\writeints.txt");
		DataInputStream dis=new DataInputStream(fis);
		int i;
		try
		{
		while((i=dis.readInt())!=-1)
		{
			System.out.println(i);
		}
		
		}
		catch(EOFException e)
		{
			System.out.println("Reached end of file");
		}
		
		dis.close();
		dos.close();
	}
	public static void readFullyFile() throws IOException
	{
		File file=new File("E:\\datainputprimst.txt");
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis);
		
		byte b[]=new byte[(int) file.length()];
		dis.read(b);
		for(byte by:b)
		{
			System.out.println(by);
		}
		
	}
	public static void readDataBytes() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\datainputprimst.txt");
		DataInputStream dis=new DataInputStream(fis);
		int i;
		try
		{
		while((i=dis.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(EOFException e)
		{
			System.out.println("Reached end of file");
		}
		}
public static void main(String[] args) throws IOException {
	
	
//	DataInputStreams.writeDataIntoFile();
	//DataInputStreams.readDataBytes();
//	DataInputStreams.writePrimitivesToFile();
	//DataInputStreams.readPrimitivesFromFile();
//	DataInputStreams.readFullyFile();
	DataInputStreams.writeOnlyInts();
}
}
