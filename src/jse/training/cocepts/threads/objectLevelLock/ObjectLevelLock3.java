package jse.training.cocepts.threads.objectLevelLock;

public class ObjectLevelLock3 implements Runnable {
String lock1="lock1";
String lock2="lock2";
	

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("ThreadA"))
		printValuesA();
		else
			if(Thread.currentThread().getName().equals("ThreadB"))
			printValuesB();
		
	}
	//Non-Static Method_Object Level Lock
	public  void printValuesA()
	{
		synchronized(lock1)
		{
		  for(int i=0;i<5;i++)
			  System.out.println( Thread.currentThread().getName()+i);
			 
		}
	}	
		public  void printValuesB()
		{
			synchronized(lock2)
			{
			  for(int i=0;i<5;i++)
				  System.out.println( Thread.currentThread().getName()+i);
				 
			}
	}
	
public static void main(String[] args) {
	//Creating two object for the class
	ObjectLevelLock3 obj1=new ObjectLevelLock3();
	ObjectLevelLock3 obj2=new ObjectLevelLock3();
	
	//Passing same object to two threads
	Thread th1=new Thread(obj1, "ThreadA");
	Thread th2=new Thread(obj1, "ThreadB");
	
	//Passing different obejct to Thread3
  //Thread th3=new Thread(obj2, "ThreadC");
	
	th1.start();
	th2.start();
	//th3.start();
	
	}
}
