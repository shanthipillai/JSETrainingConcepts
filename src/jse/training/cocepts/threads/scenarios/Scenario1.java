package jse.training.cocepts.threads.scenarios;

public class Scenario1 implements Runnable {

	
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Scenario1 obj=new Scenario1();
		obj.run();

	}
}
