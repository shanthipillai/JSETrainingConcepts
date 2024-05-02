package jse.training.cocepts.collection.collections.concurrent.concurrency.COWA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcurrentBehavior {

	
	public static void main(String[] args) {
	
		List<Integer>li=Arrays.asList(1,2,3,4,5);
		//Can't add but you can only modify the elements
	//	li.add(10);
	//	System.out.println(li);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
	Iterator<Integer>iter	=al.iterator();
	while(iter.hasNext())
	{
		//Reading operation , you want to do update operation as well
		Integer val=iter.next();
		System.out.println(val);
	    al.add(17);
		
		
	}
	}
}
