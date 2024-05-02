package jse.training.cocepts.io.fileio.filewriterreaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class FileToCharArray {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\file1.txt");
	
	FileReader fis=new FileReader("D:\\file1.txt");
	char filebytes[]=new char[(int) file.length()];
	fis.read(filebytes);
	
	
	FileWriter fw=new FileWriter("D:\\file2.txt");
	fw.write(filebytes);
	fw.write(12);
	
	
	//fw.write(filebytes);
	
	
}
}
