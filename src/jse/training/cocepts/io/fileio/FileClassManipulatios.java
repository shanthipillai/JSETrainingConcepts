package jse.training.cocepts.io.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FileClassManipulatios {

	// Use your directories appropriately in each of the calling methods
	// Uncomment each method in main method one after the other (Common rest while
	// working with one) & test it
	// Give your location
	static int countFiles = 0;
	static int countDirectories = 0;
	static File fileobj = new File("D:\\");

	public static void printDirectoriesOfADriveOrFolder() {
		System.out.println("Directories in" + fileobj.getPath());
		File[] files = fileobj.listFiles();
		for (File file : files) {

			if (file.isDirectory()) {
				System.out.println("\t" + file.getName());
				countDirectories++;
			}
		}

		System.out.println("Total Directories=" + countDirectories);
		countDirectories = 0;
	}

	public static void printFilesOfADriveOrFolder() {
		System.out.println("Files in" + fileobj.getPath());
		File[] files = fileobj.listFiles();
		for (File file : files) {

			if (file.isFile()) {
				System.out.println("\t" + file.getName());
				countFiles++;
			}
		}

		System.out.println("Total Files=" + countFiles);
		countFiles = 0;
	}

	public static void filterFile(String filter) {
		System.out.println("Files Starts with b" + fileobj.getPath());
		File[] files = fileobj.listFiles();
		for (File file : files) {

			if (file.isFile() && file.getName().startsWith(filter) && file.getName().endsWith(".txt")) {
				System.out.println("\t" + file.getName());
				countFiles++;
			}
		}

		System.out.println("Total Files=" + countFiles);
		countFiles = 0;
	}

	public static void filterDirectories(String filter) {
		System.out.println("Directories Starts with" + filter + fileobj.getPath());
		File[] files = fileobj.listFiles();
		for (File file : files) {

			if (file.isDirectory() && file.getName().startsWith(filter)) {
				System.out.println("\t" + file.getName());
				countDirectories++;
			}
		}

		System.out.println("Total Directories=" + countDirectories);
		countDirectories = 0;
	}

	public static void getFilePath(String folderName, String paths) {
		// System.out.println("foldername"+folderName);
		String path = "";

		path = paths + "\\" + folderName;
		// System.out.println("Path"+path);

		File fnew = new File(path);
		File[] flistnew = fnew.listFiles();
		// String mypath;
		// System.out.println("Path" +path);
		for (File f : flistnew) {

			if (f.isDirectory() & f != null) {

				getFilePath(f.getName(), path);
			} else {

				System.out.println(path);
				// System.out.println("**************************"+mypath.equals(path));
				System.out.println("\t\t\t" + f.getName());
			}
			//
		}

	}

	public static void printDirectoriesAndSubDirectories() {
		File[] files = fileobj.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {

			}
		}
	}

	public static void getFileNames() {
		String fileRDirNames[] = fileobj.list();
		for (String fileRDirName : fileRDirNames) {
			System.out.println(fileRDirName);
		}
	}

	public static void copyFile() throws IOException {
		File file = new File("E:\\somefile.txt");

		FileOutputStream fos = new FileOutputStream("D:\\".concat(file.getName()));
		FileInputStream fis = new FileInputStream(file);
		int n;
		while ((n = fis.read()) != -1) {
			System.out.println(n);
			fos.write(n);
		}
		fos.close();
		fis.close();
		
	}
	
	
	public static void moveFile() throws IOException {
		File file = new File("E:\\movefile.txt");

		FileOutputStream fos = new FileOutputStream("D:\\".concat(file.getName()));
		FileInputStream fis = new FileInputStream(file);
		int n;
		while ((n = fis.read()) != -1) {
			System.out.println(n);
			fos.write(n);
		}
		fos.close();
		fis.close();
		file.delete();
	}

	public static void main(String[] args) throws IOException {
		// FileClassManipulatios.printDirectoriesOfADriveOrFolD:\filesder();
		// FileClassManipulatios.printFilesOfADriveOrFolder();
		// FileClassManipulatios.filterFile("b");
		// FileClassManipulatios.filterDirectories("s");

		// FileClassManipulatios.getFilePath("Project", "D:\\");

		// FileClassManipulatios.getFilePath("Program Files\\Java\\jdk1.8.0_202\\lib",
		// "C:\\");
		// FileClassManipulatios.getFileNames();
		FileClassManipulatios.copyFile();
	}
}
