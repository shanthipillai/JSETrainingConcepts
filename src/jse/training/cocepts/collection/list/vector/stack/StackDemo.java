package jse.training.cocepts.collection.list.vector.stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
	
		/* Stack is the sub class of Vector Class
		 * Insertion order preserved
		 * Duplicates Allowed
		 * Null are also allowed
		 * It contains Stack featurs LIFO (Last In First Out)
		 */
     Stack<Integer> stack=new Stack<Integer>();
     stack.add(11);
     stack.add(12);
     stack.add(122);
     stack.add(172);
     stack.add(172);
     stack.add(112);
     
   

     System.out.println(stack);
     
     Stack<String> stackstrings=new Stack<String>();
     stackstrings.add("test1");
     stackstrings.add("test2");
     stackstrings.add("test3");
     stackstrings.add("test4");
     stackstrings.add("");
     System.out.println(stackstrings);
     
     //Stack Last In First Out (LIFO)
     stackstrings.pop();
     stackstrings.push("insertnewstring");
     stackstrings.add("addingnewstring");
     System.out.println(stackstrings);
     System.out.println(stackstrings);
   //  Vector<Integer>vector=new Vector<Integer>(6);
     System.out.println(stack.search(122));
     System.out.println(stackstrings.peek());
     //Understand the search behavior of Stack Class the search start from last and 1
     System.out.println(stack.search(172));
     
	}

}
