package jse.training.cocepts.additionaltopics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BufferedReaderStream {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		// int n=in.read();
		// char[] ch= {'a','b','c'};
//	int i=in.read(ch);

		// System.out.println(n);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		System.out.println(value);

		System.out.println("Enter a integer value");
		int intVal = Integer.parseInt(br.readLine());
		System.out.println(intVal);

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner("you,are,diving,this.string,into,mutliple,tokens");
		sc1.useDelimiter(",");
		while (sc1.hasNext()) {
			System.out.println(sc1.next());
		}

		FileInputStream fis = new FileInputStream("E:\\scannertext.txt");
		//or below one
		// FileReader fr=new FileReader("E:\\scannertext.txt");

		Scanner sc3 = new Scanner(fis);
		String value1;
		try {
			while ((value1 = sc3.nextLine()) != null) {
				System.out.println(value1);
			}
		} catch (NoSuchElementException e) {
			System.out.println("You reached end of the file");
		}
		sc3.close();
		// System.out.println(fis.read());

	}
}
