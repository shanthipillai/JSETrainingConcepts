package jse.training.cocepts.accessmodifiers.exceptions;

import java.util.Scanner;

public class Test2 {
    public void test()
    {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
	int x;
	System.out.println("Say hello");
	Scanner sc=new Scanner(System.in);
	Test2 test =new Test2();
	test.test();
	}

}
