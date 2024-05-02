package jse.training.cocepts.io.fileio;

import java.io.File;
import java.io.IOException;

public class FileIOOperations {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Project");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	
		File file1=new File("E:\\files\\abc.txt");
		
		File file2=new File("D:\\FileIOS");
		
		
		File file7=new File("../text123.txt");
		//
		System.out.println("***************File 7 path details********");
	   System.out.println(file7.getPath());
	   System.out.println(file7.getAbsolutePath());
	   System.out.println(file7.getCanonicalPath());
	   
	   
	   
		if(file7.exists()==false)
		{
			file7.createNewFile();
		}
		
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		System.out.println(file1.exists());
		
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		
		
		System.out.println(file1.length());
		System.out.println(file1.lastModified());
	 //   file.setReadOnly();
	//	file.setWritable(true);
	//	file.setExecutable(true);
		
		
		if(file1.exists()==false)
		{
			file1.createNewFile();
		}
		
		if(file2.exists()==false)
		{
			file2.mkdir();
		}
		
		File file3=new File("..\\testvb.txt");
		if(file3.exists()==false)
		{
			file3.createNewFile();
		}
		
		
		System.out.println(file3.getPath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file3.getCanonicalPath());
		
		File file4=new File("D:\\");
		String filenames[]=file4.list();
		for(String name:filenames)
		{
		    if(name.startsWith("e"))
		    {
			System.out.println(name);
		    }
		    
		    if(name.endsWith(".txt"))
		    {
		    	System.out.println(name);
		    }
		}
	
		System.out.println("Printing Directories from below line");
	File filelist[]	=file4.listFiles();
	
	int countfiles=0;
	int countdirectories=0;
	for(File f:filelist)
	{
		if(f.isDirectory())
		{
		System.out.println(f.getName());
		countdirectories++;
		}
		
		if(f.isFile())
		{
			System.out.println(f.getName());
			countfiles++;
		}
	}
		
	System.out.println("Total files in D"+countfiles);
	System.out.println("Total directories in D"+countdirectories);
	}
}
