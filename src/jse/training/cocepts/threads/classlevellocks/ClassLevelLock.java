package jse.training.cocepts.threads.classlevellocks;

 class ClassLevelLock implements Runnable {

	@Override
	public void run() {
	
		printValues();
	}
	
	synchronized static void printValues()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	
	public static void main(String[] args) {
		ClassLevelLock obj=new ClassLevelLock();
		Thread th1=new Thread(obj,"ThreadA");
		Thread th2=new Thread(obj,"ThreadB");
		th1.start();
		th2.start();
		
		ClassLevelLock obj1=new ClassLevelLock();
		Thread th3=new Thread(obj1,"ThreadC");
		th3.start();
	}
}
