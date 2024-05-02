package jse.training.concepts.finalclass;

import java.util.Scanner;

public class ChildClassOfFinal //extends FinalClass  /* You can't extend final class*/
{
	
	public static void main(String[] args) {
		String s="Shyra";
		
		System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		FinalClass obj=new FinalClass();
		obj.print();
	}

}
