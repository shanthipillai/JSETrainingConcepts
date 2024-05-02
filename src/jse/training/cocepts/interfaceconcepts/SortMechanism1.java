package jse.training.cocepts.interfaceconcepts;

public interface SortMechanism1 {
	
public void search();
public void sort();

default void print()
{
	 System.out.println("Printing from default mechanism1");
}

static void staticMethod()
{
	 System.out.println("Static Method");
}
}
