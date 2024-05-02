package jse.training.cocepts.collection.list.arraylist;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListClass {
public static void main(String[] args) throws ClassNotFoundException {
/*Insertion order is preserved
 * Duplicates allowed
 * Null values allowed
 * Default size is 10
 * No automatic shrink only automatic grow
 * 
 * 
 * 
 */
	//No Accepted Approach
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("Shanthi");
	al.add(2.3f);
	
	//Integer ArrayList
    ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
	integerArrayList.add(11);
	integerArrayList.add(111);
	integerArrayList.add(1111);
	integerArrayList.add(1111);
	//integerArrayList.add(null);
	
	System.out.println(integerArrayList);
	
	
	//String ArrayList
	ArrayList<String> stringArrayList=new ArrayList<String>();
	stringArrayList.add("TCS");
	stringArrayList.add("Infosys");
	stringArrayList.add("Wipro");
	stringArrayList.add("Microsoft");
	stringArrayList.add("");
	stringArrayList.add(null);

	System.out.println(stringArrayList);
	
	//Remove element from arrayList
	integerArrayList.remove(0);
	System.out.println(integerArrayList);
	
	//Contains the given value ?
	System.out.println(integerArrayList.contains(111));
	//Get the element at the specific location
	System.out.println(integerArrayList.get(2));
	
	//Add element into the arraylist
	integerArrayList.add(22);
	System.out.println(integerArrayList);
	
	//Add element in specific index
	integerArrayList.add(2, 77);
	System.out.println(integerArrayList);
	System.out.println("Size of the array"+integerArrayList.size());
	//Java 8 Sorting 
	integerArrayList.sort(Comparator.naturalOrder());
	System.out.println(integerArrayList);
   
	integerArrayList.sort(Comparator.reverseOrder());
	System.out.println(integerArrayList);
	
	integerArrayList.clear();
	System.out.println(integerArrayList);
	
	System.out.println(integerArrayList.isEmpty());
	
	//Converting the ArrayList to IntegerArray
//	Object[] objectarray=(Integer[]) integerArrayList.toArray();
	
	
	//Remove All elements based on other collection
	ArrayList<String> stringArrayList1=new ArrayList<String>();
	stringArrayList.add("TCS1");
	stringArrayList.add("Infosys1");
	stringArrayList.add("Wipro1");
	
	stringArrayList.addAll(stringArrayList1);
	System.out.println(stringArrayList);
	/*
	stringArrayList.removeAll(stringArrayList1);
	System.out.println(stringArrayList);
	*/
//Try checking the Inner Class of ArrayList API for awarenes	
	Class cls=Class.forName("java.util.ArrayList");
Class[] arryclss=	cls.getDeclaredClasses();
for(Class arr:arryclss)
{
	System.out.println(arr.getName());
}

ArrayList<Integer> arrayList1=new ArrayList<Integer>();
ArrayList<Integer> arrayList2= new ArrayList<Integer>();

//Element in arrayList1
arrayList1.add(11);
arrayList1.add(111);
arrayList1.add(1111);
arrayList1.add(11111);
System.out.println("arrayList1 elements");
System.out.println(arrayList1);

arrayList2.add(11);
arrayList2.add(111);
arrayList2.add(1111);
arrayList2.add(33);
arrayList2.add(333);
System.out.println("arrayList2 elements");
System.out.println(arrayList2);


arrayList1.removeAll(arrayList2);
System.out.println("After removing elements from arrayList1-arrayList2 ");
System.out.println(arrayList1);
System.out.println(arrayList2);
//Finding Sublist form the main list
List<Integer> sublist=arrayList2.subList(1, 4);
System.out.println("SubList");
System.out.println(sublist);

//ArrayList grow automatically but not shrink in order to shrink explicitly to your no of elements in array use blelow method 
arrayList2.trimToSize();

//Retain all Arrays 
ArrayList<Integer> class1=new ArrayList<Integer>();
class1.add(67);
class1.add(1);
class1.add(4);
class1.add(11);

ArrayList<Integer> class2=new ArrayList<Integer>();
class2.add(12);
class2.add(1);
class2.add(4);
class2.add(32);

//Maintain all common elements that are present in class1 and remove others
class2.retainAll(class1);
System.out.println(class2);



//Java 8 Conversion of List to ArrayList
ArrayList<Integer> altoarrj8=new ArrayList<Integer>();
altoarrj8.add(333);
altoarrj8.add(433);
altoarrj8.add(733);
altoarrj8.add(3373);
altoarrj8.add(363);
altoarrj8.add(733);
int a[]=	altoarrj8.stream().mapToInt(i->i).toArray();

//Java 8 Remove elements with condition
altoarrj8.removeIf(i->i>500);
System.out.println(altoarrj8);
//Converting arraylist to list way1 Java 8
int arraytoList[]= {1,2,3,4,5,67,8};
List<Integer> listfromarray=Arrays.stream(arraytoList).boxed().collect(Collectors.toList());

List<Integer> listfromarray1=Arrays.asList(1,2,3,44,66);
}
}
