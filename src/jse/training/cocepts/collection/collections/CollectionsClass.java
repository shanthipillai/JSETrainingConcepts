package jse.training.cocepts.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CollectionsClass {

	public static void copyAry() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.add(90);
		al1.add(100);
		Collections.copy(al1, al);
		System.out.println(al1);
	}

	public static void collectionsunmodifiedList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		// Similarly practice unmodifiable Set, Map
		List<Integer> unmodifiedlist = Collections.unmodifiableList(al);
		// unmodifiedlist.add(90);
		System.out.println(unmodifiedlist);
	}

	public static void collectionsSort() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(110);
		al.add(22);
		al.add(3);
		al.add(1);

		Collections.sort(al);

		System.out.println(al);

		Collections.sort(al, Comparator.reverseOrder());
		System.out.println(al);
//Refer Comparator, Comparable concepts user defined sorting mechanisms
	}

	public static void collectionsCheckedCollections() {
		List<String> al = new ArrayList<String>();
		al.add("string1");
		al.add("string11");
		al.add("string12");
		al.add("string13");
/*
		List alduplicate=al;
		alduplicate.add(11);
		*/
		//string1, string11, string12, string13, 11
		
		// Observe this output
		System.out.println(al);
		// Similarly try checkedSet, checkedMap ...
		// Got the CheckedList of List
		Collection<String> checkedstrings = Collections.checkedList(al, String.class);
		// Now you are trying to assign this checked collection to a non-generic
		// Collection (means it's Object type)

		/*
		 * List genericlist=al; genericlist.add(51); System.out.println(genericlist);
		 */
		Collection newlist = checkedstrings;
		System.out.println(al);
		// Modifying causes error as the list is checked list
		newlist.add(45);

		System.out.println(newlist);

	}

	public static void collectionsDisjoint() {

		/*
		 * List<String> list1=new ArrayList<String>(); 
		 * list1.add("A"); 
		 * list1.add("B");
		 * list1.add("C");
		 * 
		 */
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("X", "Y", "Z");
		List<String> list3 = Arrays.asList("L", "Y", "N");


		// Check whether the two list contains common elements or not
		System.out.println(Collections.disjoint(list1, list2));
		System.out.println(Collections.disjoint(list2, list3));
	}

	public static void collectionsFill() {
		List<String> al = Arrays.asList("testing1", "testing2", "testing3");
		// Observe Output
		System.out.println(al);
		Collections.fill(al, "donetesting");
		System.out.println(al);
	}

	public static void collectionNCopies() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
//Creates N of copies 		
		List<String> list = Collections.nCopies(10, "Example");
		List<ArrayList<Integer>> ai = Collections.nCopies(10, al);

		System.out.println(ai);
		System.out.println(list);
	}

	public static void collectionsRotate() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Collections.rotate(al, 2);
		System.out.println(al);
	}

	public static void collectionsFrequency() {
		// Find no of time a string is repeated
		List<String> strings = Arrays.asList("Threads", "OOPS", "Collections", "Threads", "Collection", "Threads");
		int stringrepeats = Collections.frequency(strings, "Threads");
		System.out.println(stringrepeats);
	}

	public static void someCommonmethods() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);

		Collections.addAll(al, 70, 90, 77);
		System.out.println(al);

		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.replaceAll(al, 40, 44);
		System.out.println(al);

	}

	public static void collectionsShuffle() {

		List<Questions> list = new ArrayList<>();
		list.add(new Questions("What is OOPS"));
		list.add(new Questions("What is Inheritance"));
		list.add(new Questions("What is Dynamic Polymorphism"));
		list.add(new Questions("What is the use of static keyword"));
		list.add(new Questions("What is the use of volatile keyword"));

		Collections.shuffle(list);
		Iterator<Questions> shuffelequestions = list.iterator();
		while (shuffelequestions.hasNext()) {
			System.out.println(shuffelequestions.next().getQuestions());
		}
	}

	
	//As Binary Search is one of the efficient algorithms Java API provides readymade solution for this
	public static void collectionsBinarySearch()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Collections.sort(al);
		int indexfound=Collections.binarySearch(al, 30);
		

		System.out.println("Element found at index"+indexfound);

	}
	public static void main(String[] args) {

		copyAry();
		collectionsunmodifiedList();
		//collectionsCheckedCollections();
		collectionsDisjoint();
		collectionsFill();
		collectionNCopies();
		collectionsRotate();
		collectionsFrequency();
		collectionsShuffle();
		collectionsBinarySearch();

//Collections.synchronized this concept we already completed in each Collection Object
	}
}

