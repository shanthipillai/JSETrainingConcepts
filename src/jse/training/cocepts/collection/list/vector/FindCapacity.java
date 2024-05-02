package jse.training.cocepts.collection.list.vector;

import java.util.Stack;
import java.util.Vector;

public class FindCapacity {
public static void findCapacityVector()

{
	Vector<Integer>vector=new Vector<Integer>();
    vector.add(11);
    vector.add(12);
    vector.add(122);
    vector.add(112);
    vector.add(172);
    vector.add(172);
    
    System.out.println(vector.size());
    System.out.println(vector.capacity());
    vector.add(182);
    vector.add(192);
    vector.add(182);
    vector.add(122);
    vector.add(1112);
    vector.add(1922);
    System.out.println(vector.size());
    System.out.println(vector.capacity());
   

   vector.remove(2);
   vector.remove(3);
   vector.remove(5);
   vector.remove(4);
   System.out.println(vector.size());
   System.out.println(vector.capacity());
   
}

public static void findCapacityStack()

{
	Stack<Integer>vector=new Stack<Integer>();
    vector.add(11);
    vector.add(12);
    vector.add(122);
    vector.add(112);
    vector.add(172);
    vector.add(172);
    
    System.out.println(vector.size());
    System.out.println(vector.capacity());
    vector.add(182);
    vector.add(192);
    vector.add(182);
    vector.add(122);
    vector.add(1112);
    vector.add(1922);
    System.out.println(vector.size());
    System.out.println(vector.capacity());
   

   vector.remove(2);
   vector.remove(3);
   vector.remove(5);
   vector.remove(4);
   System.out.println(vector.size());
   System.out.println(vector.capacity());
   vector.trimToSize();
   System.out.println(vector.capacity());
   
}
public static void main(String[] args) {
	findCapacityVector();
	findCapacityStack();
}
}
