package jse.training.cocepts.jvm.memory.management;

public class StackOverFlowExceptions3 {
	
	public void add(int i)
	{
		System.out.println(i);
		i++;
		if(i<10000)
		{
		add(i);
		}
	}
public static void main(String[] args) {
	new StackOverFlowExceptions3().add(1);
}
}
