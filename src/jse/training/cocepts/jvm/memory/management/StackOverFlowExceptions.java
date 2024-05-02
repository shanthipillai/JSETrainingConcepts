package jse.training.cocepts.jvm.memory.management;

public class StackOverFlowExceptions {
	
	public void add(int i)
	{
		System.out.println(i);
		i++;
		add(i);
	}
public static void main(String[] args) {
	new StackOverFlowExceptions().add(1);
}
}
