package jse.training.cocepts.threads.waitnotify;

public class ThreadWaitSum implements Runnable {
	int a, b, c, sum = 0;

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("SumOf3Nos")) {

			try {
				sumOfTwoNos();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (Thread.currentThread().getName().equals("AssignValues")) {
			assigningValues();
		}
	}

	 void assigningValues() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + "started execution");
			a = 10;
			b = 20;
			c = 30;
			notify();

			System.out.println("Completed execution of" + Thread.currentThread().getName()+"(ThreadName)");
		}

	}

	void sumOfTwoNos() throws InterruptedException {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " (ThreadName)  started executing");
			System.out.println(Thread.currentThread().getName() + "  moving to waiting state");
			wait();
			System.out.println("After SumOf3Nos Thread execution a, b, c values got assigned ");
			sum = a + b + c;
			System.out.println("a=" + a + "b=" + b + "c=" + c);
		}

	}

	public static void main(String[] args) {
		ThreadWaitSum obj=new ThreadWaitSum();
		Thread th1=new Thread(obj, "SumOf3Nos");
		Thread th2=new Thread(obj, "AssignValues");
		th1.start();
		th2.start();
	}
}
