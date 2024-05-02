package jse.training.cocepts.collection.list.vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VectorClass {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * Insertion Order Preserved Duplicates allowed Null values allowed
		 * 
		 */
//Vector Class InnerClass Printing
		Class clss = Class.forName("java.util.Vector");
		Class[] classes = clss.getDeclaredClasses();
		for (Class cls : classes) {
			System.out.println(cls.getName());
		}
		// Vector<Integer> v1=new Vector<Integer>();
		Vector<Integer> vector = new Vector();

		vector.add(11);
		vector.add(12);
		vector.add(13);
		vector.add(14);
		vector.add(15);
		vector.add(15);
		System.out.println(vector);

		Vector<String> vectorStrings = new Vector();
		vectorStrings.add("abc");
		vectorStrings.add("abc1");
		vectorStrings.add("abc2");
		vectorStrings.add("abc3");
		vectorStrings.add("abc");
		vectorStrings.add("");
	   //vectorStrings.add(null);
		System.out.println(vectorStrings);

		vector.add(3, 65);
		System.out.println(vector);
		vector.insertElementAt(55, 4);
		vector.insertElementAt(65, 2);
		System.out.println(vector);

		Vector<Integer> vector1 = new Vector();
		vector1.add(98);
		vector1.add(99);
		vector.addAll(4, vector1);
		System.out.println(vector);
		

		System.out.println(vector.containsAll(vector1));
		System.out.println(vector.contains(95));
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.indexOf(13));
		// Both below methods functionality is same
		// vector.clear();
		// vector.removeAllElements();
		// System.out.println(vector);

		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.elementAt(2));
		System.out.println(vector.get(2));

		// Capacity is additional method
		System.out.println(vector.capacity());
		// System.out.println(vector.size());
		System.out.println(vector.size());
		vector.trimToSize();
		System.out.println(vector.capacity());

		//Java8
		vector.removeIf(i->i>13);
		System.out.println(vector);
	//Converting Vector List to Integer or Int array using Java8	
	Integer[] vectorlist=vector.stream().toArray(Integer[]::new);
	int[] vectorlist1=vector.stream().mapToInt(i->i).toArray();
	int values[]= {1,2,3,4,5,6,7};
	
	
	//Converting Int array to List
	List<Integer> vectlist=Arrays.stream(values).boxed().collect(Collectors.toList());
   // Stream.of(values).mapToInt(i->i).boxed().collect(Collectors.toList());	}
	
	//If below is complicated ignore for now
	Collections.replaceAll(vector, 15, 20);
	UnaryOperator<String> operator = new UnaryOperator<String>() {

		@Override
		public String apply(String t) {
			// TODO Auto-generated method stub
			return t.toUpperCase();
		}
	};
	vectorStrings.replaceAll(operator);
	System.out.println(vectorStrings);
	

	
	}
}
