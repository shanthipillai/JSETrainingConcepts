package jse.training.cocepts.io.fileio.inputoutputstreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputStreams {
	public static void writeDataIntoFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(97);
		String name = "Shyra";
		byte[] bnames = name.getBytes();
		System.out.println(bnames);
		for (byte bname : bnames) {
			System.out.println(bname);
		}
		bos.write(bnames);
		bos.write(97);
		bos.close();
		fos.close();  //This is optional bos will automatically closes fos
	}

	public static void writeFileDataToAnotherFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis=new BufferedInputStream(fis);
		byte filebytes[] = new byte[(int) f.length()];
		bis.read(filebytes);

		FileOutputStream fos = new FileOutputStream("D:\\samplecopy.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		for (byte filebyte : filebytes) {
			System.out.println(filebyte);
			bos.write(filebytes);
		}

		bos.close();
		fos.close(); //This is optional bos will automatically closes fos
	}

	public static void readDataFromFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int i;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}

		bis.close();
		fis.close(); //This is optional bis will automatically closes fis
	}

	public static void main(String[] args) throws IOException {
		
		BufferInputOutputStreams.readDataFromFile();
		BufferInputOutputStreams.writeDataIntoFile();
		BufferInputOutputStreams.writeFileDataToAnotherFile();
	}
}
