package jse.training.cocepts.additionaltopics;

import java.sql.SQLException;

import jdk.internal.org.objectweb.asm.tree.ClassNode;

public class MutipleException_CatchBlock {
public static void main(String[] args) {
	try {
		Class cls=Class.forName("java.lang.Object");
	} 

	catch (ArrayIndexOutOfBoundsException | NullPointerException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

	
}
