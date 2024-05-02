package jse.training.cocepts.interfaceconcepts;

public class LinearSort implements SortingMechanism,SortMechanism1 {

	@Override
	public void sort() {
	System.out.println("Sorting");
		
	}



@Override
public void search() {
System.out.println("Binary Search");
	
}

@Override
public void print() {
	// TODO Auto-generated method stub
	SortMechanism1.super.print();
}



public static void main(String[] args) {
	SortingMechanism obj=new LinearSort();
	SortMechanism1 obj1=new LinearSort();
	obj.sort();
	obj1.search();
	System.out.println(SortingMechanism.x);
	SortingMechanism.staticMethod();
	SortMechanism1.staticMethod();

}

/*

@Override
public void privateMethod() {
	// TODO Auto-generated method stub
	
}
*/
}
