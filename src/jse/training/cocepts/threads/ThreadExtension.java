package jse.training.cocepts.threads;

public class ThreadExtension extends Thread {

	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" = " +i);
		}
	}
	
	public static void main(String[] args) {
		ThreadExtension obj=new ThreadExtension();
		obj.setName("Thread A");
		obj.start();
		
		
		ThreadExtension obj1=new ThreadExtension();
		obj1.setName("Thread B");
		obj1.start();
	}
	
}
