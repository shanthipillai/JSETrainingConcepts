package jse.training.singledimension.arrays;

public class IterateArray {

	public static void main(String[] args) {
		String name[]=new String[4];
		name[0]="Sharvani";
		name[1]="Shanthi";
		name[2]="Java";
		name[3]="Training";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	    System.out.println(name[3]);
		//System.out.println(name[0]);
		
//Traditional For Loop
		for(int i=0;i<name.length;i++)
		{
		
			System.out.println(name[i]);
		}
	
		//Advance For Loop
		for(String names:name)
		{
			System.out.println(names);
		}

	}

}
