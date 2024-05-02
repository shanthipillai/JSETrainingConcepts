package jse.training.cocepts.threads.classlevellocks;

 class ClassLevelLock4 implements Runnable {
   static Object lock1=new Object();
   static Object lock2=new Object();
	@Override
	public void run() {
	
	if(Thread.currentThread().getName().equals("ThreadA"))
	{
		printA();
	}
	
	if(Thread.currentThread().getName().equals("ThreadB"))
	{
		printB();
	}
	}
	
	 static void printA()
	{
		 synchronized(lock1)
		 {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from A "+i);
		}
	//	System.out.println("Printing");
		 }
	}
	 static void printB()
	{
		 synchronized(lock2)
		 {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from B "+i);
		}
		 }
	}
	
	public static void main(String[] args) {
		ClassLevelLock4 obj=new ClassLevelLock4();
		Thread th1=new Thread(obj,"ThreadA");
		Thread th2=new Thread(obj,"ThreadB");
		th1.start();
		th2.start();
	/*	
		ClassLevelLock2 obj1=new ClassLevelLock2();
		Thread th3=new Thread(obj1,"ThreadC");
		th3.start();
		*/
	}
}
