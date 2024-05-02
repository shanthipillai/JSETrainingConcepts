package jse.training.cocepts.collection.collections.concurrent.concurrency.COWA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorFailureCase2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		
	    //Arrays.stream("hello how are you".split(" ")).forEach(s -> list.add(s));

	    Iterator<String> it = list.iterator();
	    Iterator<String> lit = list.iterator();

	    while (it.hasNext()) {
	        String s = it.next();
	        if (s.startsWith("a")) {
	            it.remove();
	        } else {
	            System.out.println(s);
	        }
	    }

	    System.out.println(list);

	    // {here}

	    while (lit.hasNext()) {
	        String s = lit.next();
	        if (s.startsWith("a")) {
	            lit.remove();
	        } else {
	            System.out.println(s);
	        }
	    }

	    System.out.println(list);
	}
	
}
