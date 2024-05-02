package jse.training.cocepts.threads.scenarios;

public class Scenario2 extends Thread{
	//No run method
	
public static void main(String[] args) {
	Scenario2 obj=new Scenario2();
	obj.setName("New Thread");
	obj.start();
}
}
