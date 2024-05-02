package jse.training.cocepts.threads.classlevellocks;

 class ClassLevelLock5 implements Runnable {

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
		 synchronized(ClassLevelLock5.class)
		 {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from A "+i);
		}
		System.out.println("Printing");
		 }
	}
	 static void printB()
	{
		 synchronized(ClassLevelLock5.class)
		 {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from B "+i);
		}
		 }
	}
	
	public static void main(String[] args) {
		ClassLevelLock5 obj=new ClassLevelLock5();
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
