package jse.training.cocepts.io.fileio.inputoutputstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreams {

	public static void writeDataIntoFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(97);
		String name = "Shyra";
		byte[] bnames = name.getBytes();
		System.out.println(bnames);
		for (byte bname : bnames) {
			System.out.println(bname);
		}
		fos.write(bnames);
	
		fos.write(97);
		fos.flush();
		fos.close();
	}

	public static void writeFileDataToAnotherFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileInputStream fis = new FileInputStream(f);

		byte filebytes[] = new byte[(int) f.length()];
		fis.read(filebytes);

		FileOutputStream fos = new FileOutputStream("D:\\samplecopy.txt");
		for (byte filebyte : filebytes) {
			System.out.println(filebyte);
			fos.write(filebytes);
		}

		fos.close();
	}

	public static void readDataFromFile() throws IOException {
		File f = new File("D:\\sample.txt");
		FileInputStream fis = new FileInputStream(f);
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}

		fis.close();
	}

	public static void main(String[] args) throws IOException {

		FileInputOutputStreams.writeDataIntoFile();
		FileInputOutputStreams.writeFileDataToAnotherFile();

	}

}
