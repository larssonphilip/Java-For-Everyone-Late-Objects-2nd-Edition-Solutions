/** 
 * Write a program that generates a sequence of 20 random values between 0 and 99 in an array,
 * prints the sequence, sorts it, and prints the sorted sequence. Use the sort method from the standard Java library.
 */

import java.util.Arrays;

public class P6_14 {
	public static void main(String[] args) {	
		printAndSortArray(sequenceGenerator(20));
	}
	
	public static int[] sequenceGenerator(int arraySize) {
		int[] inArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++) inArray[i] = (int) (Math.random() * 100);
		return inArray;
	}
	
	public static void printAndSortArray(int[] inArray) {
		System.out.println("Unsorted array: ");
		for(int i = 0; i < inArray.length; i++) System.out.print(inArray[i] + "  ");
		
		Arrays.sort(inArray);
		System.out.println("\n\nSorted array: ");
		for(int i = 0; i < inArray.length; i++) System.out.print(inArray[i] + "  ");
	}
}
