package jse.training.cocepts.debug;

public class EvenOdd {
	
	public void printEven()
	{
		int counter = 0;
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				counter++;
				System.out.println(i);
			}
		}
	}
public static void main(String[] args) {
	//Fn+F6, Fn+F5, Fn+F8  -Play with Code
	EvenOdd obj=new EvenOdd();
	obj.printEven();
	System.out.println("End of the method");
}
}
