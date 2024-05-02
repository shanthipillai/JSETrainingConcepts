package jse.training.cocepts.scenariosbased;

import java.util.ArrayList;

public class Scenario1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	System.out.println(al);
	//Index Out of Bound Exception
//	System.out.println(al.get(1));
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	
	//System.out.println(al.get(5));

}
}
