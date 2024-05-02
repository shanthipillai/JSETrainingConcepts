package jse.training.cocepts.io.fileio.filewriterreaders;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaders {
	public static void readDataOfFile(File file) throws IOException {
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
      
		int i;

		while ((i = br.read()) != -1) {
			System.out.print((char) i);

		}
		System.out.println();
		br.close();
	}

	public static void readDatafrmFileToObjectArray(File file) throws NumberFormatException, IOException {
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		int incre = 0;
		Employee e[] = new Employee[6];

		while ((s = br.readLine()) != null) {
			// System.out.println(s);
			// Spiting the String
			String details[] = s.split(",");
			int id = Integer.parseInt(details[0]);
			String str = details[1];
			// Creating Object
			Employee employee = new Employee(id, str);

			e[incre] = employee;
			// incre values will be incremented 0,1,2,3,4,5
			incre++;
		}

		for (Employee emp : e) {
			System.out.println(emp.getRegId() + "" + emp.getCompanyName());
		}
		
		br.close();
	}

	public static void witeData(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
	
		bw.write("convert string to bytes");
		bw.newLine();
		bw.write("new string");
		bw.flush();
		bw.close();
	}
	
	public static void writeDataFromFileToFile() throws IOException
	{
		FileReader fr1=new FileReader("D:\\test.txt");
		BufferedReader br=new BufferedReader(fr1);
		//FileReader fr2=new FileReader("D:\\test.txt");
		FileWriter fw=new FileWriter("D:\\text7.txt",true);
	//	FileWriter fw=new FileWriter("D:\\text7.txt");
		BufferedWriter bw=new BufferedWriter(fw) ;
		int i;
		while((i=br.read())!=-1)
		{
			bw.write(i);
		}
		bw.flush();
		bw.close();
	}
	
	public static void writeDataFromFileToFileAsString() throws IOException
	{
		FileReader fr1=new FileReader("D:\\test.txt");
		BufferedReader br=new BufferedReader(fr1);
		//FileReader fr2=new FileReader("D:\\test.txt");
		FileWriter fw=new FileWriter("D:\\text8.txt",true);
	//	FileWriter fw=new FileWriter("D:\\text7.txt");
		BufferedWriter bw=new BufferedWriter(fw) ;
	String str;
		while((str=br.readLine())!=null)
		{
			bw.write(str);
		}
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// Create files text.txt and employees.txt
		// In employees.txt
		/*
		 * 1,shyra 
		 * 3,xyz 
		 * 4,wipro 
		 * 5,tcs 
		 * 6,accenture 
		 * 7,delio
		 * 
		 */
		File file1 = new File("D:\\test.txt");
		File file2 = new File("D:\\employees.txt");

		FileReaders.readDataOfFile(file1);

		FileReaders.readDatafrmFileToObjectArray(file2);
		FileReaders.writeDataFromFileToFile();
		FileReaders.writeDataFromFileToFileAsString();
	}
}