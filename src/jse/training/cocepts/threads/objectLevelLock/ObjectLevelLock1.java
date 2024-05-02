package jse.training.cocepts.threads.objectLevelLock;

public class ObjectLevelLock1 implements Runnable {

	

	@Override
	public void run() {
		printValues();
		
	}
	//Non-Static Method_Object Level Lock
	public synchronized void printValues()
	{
		  for(int i=0;i<5;i++)
			  System.out.println( Thread.currentThread().getName()+i);
			 
		
	}
	
public static void main(String[] args) {
	//Creating two object for the class
	ObjectLevelLock1 obj1=new ObjectLevelLock1();
	ObjectLevelLock1 obj2=new ObjectLevelLock1();
	
	//Passing same object to two threads
	Thread th1=new Thread(obj1, "ThreadA");
	Thread th2=new Thread(obj1, "ThreadB");
	
	//Passing different obejct to Thread3
	  Thread th3=new Thread(obj2, "ThreadC");
	
	th1.start();
	th2.start();
	th3.start();
	
	}
}
