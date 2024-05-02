package jse.training.cocepts.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class TestNulls {
public static void main(String[] args) {
	Vector<String> vector = new Vector<>();
	vector.add("First");
	vector.add(null);
	vector.add("Second");

for(String s:vector)
{
	System.out.println(s);
}

}



}
