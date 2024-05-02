package jse.training.cocepts.io.fileio.filedescriptor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDescriptor {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\text1.txt");
		FileInputStream fis1=new FileInputStream("D:\\text1.txt");
		
		java.io.FileDescriptor fd1=fis.getFD();
		java.io.FileDescriptor fd2=fis1.getFD();
		
		FileInputStream fis3=new FileInputStream(fd1);
		java.io.FileDescriptor fd3=fis3.getFD();
		System.out.println(fd3);
		
		
		System.out.println(fd1);
		System.out.println(fd2);
	}
}

