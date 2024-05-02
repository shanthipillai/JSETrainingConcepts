package jse.training.cocepts.threads.join;

public class ThreadJoin2 extends Thread {
	static  Thread thread1;
	static  Thread thread2;
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println(Thread.currentThread().getName()+"= "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin2 th1=new ThreadJoin2();
		thread1=new ThreadJoin2();
		thread2=new ThreadJoin2();
		thread1.start();
		thread1.join(1000);
		thread2.start();
	}
}
