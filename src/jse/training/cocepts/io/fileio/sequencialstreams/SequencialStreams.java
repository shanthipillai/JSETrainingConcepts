package jse.training.cocepts.io.fileio.sequencialstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequencialStreams {

	public static void copyFilesDataToOtherFile() throws IOException
	{
		FileInputStream file1=new FileInputStream("D:\\file1.txt");
		FileInputStream file2=new FileInputStream("D:\\file2.txt");
		FileInputStream file3=new FileInputStream("D:\\file3.txt");
		SequenceInputStream streams=new SequenceInputStream(file1,file2);
		SequenceInputStream streams1=new SequenceInputStream(streams, file3);
		
		FileOutputStream fos=new FileOutputStream("D:\\outputfile.txt");
		int i=0;
		while((i=streams1.read())!=-1)
		{
			System.out.print((char)i);
			fos.write(i);
		}
	}
	
	public static void readTwoFiles() throws IOException
	{
		FileInputStream file1=new FileInputStream("D:\\file1.txt");
		FileInputStream file2=new FileInputStream("D:\\file2.txt");
		SequenceInputStream streams=new SequenceInputStream(file1,file2);
	
		int i=0;
		while((i=streams.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	public static void readMoreThanTwoFiles() throws IOException
	{
		FileInputStream file1=new FileInputStream("D:\\file1.txt");
		FileInputStream file2=new FileInputStream("D:\\file2.txt");
		FileInputStream file3=new FileInputStream("D:\\file3.txt");
		SequenceInputStream streams=new SequenceInputStream(file1,file2);
		SequenceInputStream streams1=new SequenceInputStream(streams, file3);
		
		int i=0;
		while((i=streams1.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		SequencialStreams.readTwoFiles();
		SequencialStreams.copyFilesDataToOtherFile();
	}
}
