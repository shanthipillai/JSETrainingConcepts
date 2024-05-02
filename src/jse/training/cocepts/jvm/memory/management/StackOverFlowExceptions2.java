package jse.training.cocepts.jvm.memory.management;

public class StackOverFlowExceptions2 {
	
	public void add(int i)
	{
		System.out.println(i);
		i++;
		
		add(i);
		
	}
public static void main(String[] args) {
	new StackOverFlowExceptions2().add(1);
}
}
