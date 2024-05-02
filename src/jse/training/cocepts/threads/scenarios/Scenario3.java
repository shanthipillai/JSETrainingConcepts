package jse.training.cocepts.threads.scenarios;

public class Scenario3  extends Thread{

	@Override
	public void start()
	{
		super.start();
		System.out.println(Thread.currentThread().getName()+"from normal start method");
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"from Thread run method");
	}
	public static void main(String[] args) {
		Scenario3 obj=new Scenario3();
		obj.setName("New Thread");
		obj.start();

	}

}
