package jse.training.cocepts.collection.list.vector.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackThreads {
	//Vector is synchronized
static	int count=0;
public static void main(String[] args) throws InterruptedException {
Stack<Integer> al=new Stack<Integer>();
//Collection- Interface
//Collections -Class which has static methods 
//Anonymous Inner Classes
Runnable runobj=new Runnable() {

	@Override
	public void run() {
	for(int i=1;i<10;i++)
	{
		al.add(i);
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