package jse.training.conidtionalstatements.loops.whileloop.scenarios;

public class doWhileLoop {

	public static void main(String[] args) {
	int i=11;
		do
		{
			System.out.println("This statement will be printed irrespective of condition");
			System.out.println(i);
			i++;
		}
		while(i<10);

	}

}
