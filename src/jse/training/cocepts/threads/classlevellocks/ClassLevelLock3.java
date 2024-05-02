package jse.training.cocepts.threads.classlevellocks;

 class ClassLevelLock3 implements Runnable {

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
	
	synchronized static void printA()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from A "+i);
		}
	}
	void printB()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" from B "+i);
		}
	}
	
	public static void main(String[] args) {
		ClassLevelLock3 obj=new ClassLevelLock3();
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
