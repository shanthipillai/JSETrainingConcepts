package jse.training.java8.arrays.anonymous;

public class AnonymousArrays {

	public void printArray(int arrays[])
	{
		
		for( int arr:arrays)
		{
			System.out.println(arr);
		}
	}
	public static void main(String[] args) {
		AnonymousArrays obj=new AnonymousArrays();
		//int arrays[]=new int[5];
		//Anonymous Arrays
		obj.printArray(new int[] {1,2,3,4});

	}

}
