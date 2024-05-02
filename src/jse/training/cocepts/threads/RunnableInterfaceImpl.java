package jse.training.cocepts.threads;

public class RunnableInterfaceImpl implements Runnable  {
	//Multiple Inheritance is possible
	@Override
	public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+" = " +i);
	}
	}
/*
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
        System.out.println("This is being executed by a Thread");
	}
	*/
	
	public static void main(String[] args) {
		//Main Thread
		//Create object to the Class
		RunnableInterfaceImpl obj=new RunnableInterfaceImpl();
		
		//Thread1 on obj
		Thread th1=new Thread(obj,"ThreadA");
		
		th1.start();
		
		//Thread2 on obj
		Thread th2=new Thread(obj,"ThreadB");
		th2.start();
		

		System.out.println(Thread.currentThread().getName());
	}

}
