/** (Modified)
 * Write a metod public static int removeAtIndex(int index, int[] inArray)
 * that removes the element at the index and returns the element that was removed.
 * Ex.{1, 2, 3, 4, 5, 6, 7, 8, 9, 10) if index = 2 returns {1, 2, 4, 5, 6, 7, 8, 9, 10, 10}
 */
 
import java.util.Scanner;

public class P6_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		arrayAndIndex(numbers);
		
		System.out.print("\n\nType a index number between 0 - " + (numbers.length-1) + ": ");
		int index = input.nextInt();
		input.close();
		if(index < numbers.length && index >= 0)
			removeAtIndex(index, numbers);
		else
			System.out.println("There is no index with the number " + index + ".");
	}

	public static void removeAtIndex(int index, int[] inArray) {
	        int removedNumber = inArray[index];
	        System.arraycopy(inArray, index+1, inArray, index, inArray.length - 1 - index);
	        System.out.print("New array: ");
	        for(int i = 0; i < inArray.length; i++) {
	        		System.out.print(inArray[i] + "  ");
			}
	        System.out.print("\n\nThe number " + removedNumber + " has been removed from the array.");
	}
	
	public static void arrayAndIndex(int[] inArray) {
		System.out.print("Array: ");
		for(int i = 0; i < inArray.length; i++) {
			System.out.print(inArray[i] + "  ");
		}
		
		System.out.print("\nIndex: ");
		for(int i = 0; i < inArray.length; i++) {
			System.out.print(i + "  ");
		}
	}
}
