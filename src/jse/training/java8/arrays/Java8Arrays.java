package jse.training.java8.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 * This class mainly exposes the Arrays class under java.util packages and the static methods in it.
 * Most of them would require Java 8 combinations 
 * Please refer , if it's hard to understand ignore and just aware these exist in current versions
 */
public class Java8Arrays {

	public static void main(String[] args) {

		int arrays[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrayscopy[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrayscopy1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int unorderedArray[] = { 12, 77, 4, 9, 2 };

		// Java 8 way of printing the values using streams concepts[]
		Arrays.stream(arrays).forEach(i -> System.out.println(i));

		// Java 8 Sorting using Arrays Classs
		System.out.println("Elements sorted in Ascending Order");
		Arrays.stream(unorderedArray).sorted().forEach(System.out::println);

		long totalEleements = Arrays.stream(unorderedArray).count();
		System.out.println("Total no of elements" + totalEleements);

		// Search an element using Java8 Binary Search Algo
		int elementFoundAtIndex = Arrays.binarySearch(arrays, 9);
		System.out.println(elementFoundAtIndex);
		// When element not found
		System.out.println(Arrays.binarySearch(arrays, 19));

		// Comparing two Arrays equal or not
		System.out.println(Arrays.equals(arrays, arrayscopy));
		System.out.println(Arrays.equals(arrays, unorderedArray));
		System.out.println(Arrays.equals(arrays, arrayscopy1));

		// Creating a new copy of array based on the existing array and changed the size
		// to 15
		int arraycopy3[] = Arrays.copyOf(arrays, 15);
		Arrays.stream(arraycopy3).forEach(System.out::println);

		// Copy an array only a part
		int arraycopy4[] = Arrays.copyOfRange(arrays, 0, 5);
		Arrays.stream(arraycopy4).forEach(System.out::println);

		// Changing all the array elements to a specific value
		int thisArrayWillBeFilled[] = { 1, 2, 3, 4, 5, 6, 7 };
		Arrays.fill(thisArrayWillBeFilled, 11);
		Arrays.stream(thisArrayWillBeFilled).forEach(System.out::println);

		int arrayValuesGen[] = new int[7];
		Arrays.setAll(arrayValuesGen, i -> i + 10 * 20);
		Arrays.stream(arrayValuesGen).forEach(System.out::println);

		// Parallel Sorting basically in backend more than one thread executes
		int unorderedArray1[] = { 12, 77, 4, 9, 24, 99 };
		Arrays.parallelSort(unorderedArray1);
		Arrays.stream(unorderedArray1).forEach(System.out::println);

		// Parallel Sorting try understand the output based on the array
		int[] numbers = { 2, 1, 0, 3 };
		Arrays.parallelPrefix(numbers, (a, b) -> a + b);
		Arrays.stream(numbers).forEach(System.out::println);

	}

}
