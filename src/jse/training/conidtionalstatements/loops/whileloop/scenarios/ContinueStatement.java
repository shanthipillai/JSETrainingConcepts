package jse.training.conidtionalstatements.loops.whileloop.scenarios;

public class ContinueStatement {
public static void main(String[] args) {
	for(int i=0;i<10;i++)
	{
		//System.out.println(i);
		if(i>5  && i<=7)
		{
			continue;  //break
		}
	System.out.println(i);
	}
}
}
