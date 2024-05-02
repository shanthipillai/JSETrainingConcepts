package jse.training.cocepts.collection.list.arraylist.dynamicarray;

import java.util.Arrays;

public class DynamicArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};

	int b[]=Arrays.copyOf(a, 20);
	a=null;
	 for(int d:b)
	 {
		 System.out.println(d);
	 }
}
}
