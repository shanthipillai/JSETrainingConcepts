package jse.training.cocepts.io.fileio.objectstreams;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class ObjectStreams {
	//Serialization - Converting Object into Stream
	public static void saveObjectSToFile() throws IOException
	{
		Employee eobj1=new Employee(1,"xyz");
		Employee eobj2=new Employee(2,"klm");
		Employee eobj3=new Employee(2,"hkl");
		
	    FileOutputStream fos=new FileOutputStream("D:\\serialobj.txt")   ;
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(eobj1);
	    oos.writeObject(eobj2);
	    oos.writeObject(eobj3);
	    oos.flush();
	    oos.close();
	    
	}
	//Deserialization - Converting Stream to Object
	public static void readObjectsFromFile() throws IOException, ClassNotFoundException
	{
		FileInputStream fos=new FileInputStream("D:\\serialobj.txt");
		ObjectInputStream ois=new ObjectInputStream(fos);
		Employee eobj;
		try
		{
		while((eobj=(Employee) ois.readObject())!=null)
		{
			System.out.println("Employee Id= "+eobj.empid+"Employee Name= "+eobj.ename+"Organization="+eobj.orgname+"Reg No"+eobj.regid
				+"Gov"+eobj.privateInfo	)
			;
		}
		}
		catch(EOFException eof)
		{
			System.out.println("No More Objects Found");
		}
		
		ois.close();
		fos.close();
	}
public static void main(String[] args) throws IOException, ClassNotFoundException {
	ObjectStreams.saveObjectSToFile();
	ObjectStreams.readObjectsFromFile();
    
}
}
