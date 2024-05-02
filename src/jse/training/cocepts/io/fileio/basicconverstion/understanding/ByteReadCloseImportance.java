package jse.training.cocepts.io.fileio.basicconverstion.understanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteReadCloseImportance {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D:\\text1.txt");
	System.out.println((char)fis.read());
	System.out.println((char)fis.read());
    int bytes;
    while((bytes=fis.read())!=-1)
    {
    	System.out.print((char)bytes);
    }
    
    System.out.print((char)bytes);
    
    fis.close();
}
}
