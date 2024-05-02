package jse.training.cocepts.collection.set.HashSet.LinkedHS;


import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetThreadCheck {
static	int count=0;
public static void main(String[] args) throws InterruptedException {
LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();
Set<Integer> synchronizedcollections=	Collections.synchronizedSet(al);
//Collection- Interface
//Collections -Class which has static methods 
//Anonymous Inner Classes
Runnable runobj=new Runnable() {

	@Override
	public void run() {
	for(int i=1;i<10;i++)
	{
		//al.add(i);
   	   synchronizedcollections.add(i);
		System.out.println(Thread.currentThread().getName());
		count++;
	}
	}
};

Thread th1=new Thread(runobj);
Thread th2=new Thread(runobj);
th1.start();
th2.start();
th1.join();
th2.join();
System.out.println(count);
System.out.println(al);

}

}