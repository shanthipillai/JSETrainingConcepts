package jse.training.cocepts.objectcreation.ways;

import java.io.CharArrayReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void SerializeObjects() throws IOException
	{
		Child child1=new Child(1, "child1", 1, "parent1");
		Child child2=new Child(2, "child2", 2, "parent2");
		Child child3=new Child(3, "child3", 3, "parent3");

		FileOutputStream fos=new FileOutputStream("D:\\inheritserialize.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(child1);
		oos.writeObject(child2);
		oos.writeObject(child3);
		oos.close();
	}
	
	public static void DeserializeObjects() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		/* You can declare lilke this
		File file=new File("D:\\inheritserialize.txt");
		FileInputStream fis=new FileInputStream(file);
		*/
		
		/*You can declare like this too
		 * FileInputStream fis=new FileInputStream("D:\\inheritserialize.txt");
		 * FileInputStream fis=new FileInputStream(new File("D:\\inheritserialize.txt"));
		 */
		
		
		//You can declare in one line as below as well
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("D:\\inheritserialize.txt")));
		Child child;
	
		try
		{
		while((child=(Child) ois.readObject())!=null)
		{
			System.out.println(" Parent Id"+child.parentId+
					" Parent Name"+child.parentName+
					" Child ID"+child.childId+
					" Child Name"+child.childName);
		}
		}
		
		catch(EOFException e)
		{
			System.out.println("Completed reading the objects");
		}
		ois.close();
	}
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	SerializationTest.SerializeObjects();
	SerializationTest.DeserializeObjects();
	
	
	
}
}
