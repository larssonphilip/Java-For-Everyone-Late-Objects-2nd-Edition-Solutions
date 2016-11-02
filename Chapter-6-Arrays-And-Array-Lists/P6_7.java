/** 
 * Write a method that reverses the sequence of elements in an array.
 * For example, if you call the method with the array
 * 1 4 9 16 9 7 4 9 11
 * then the array is changed to
 * 11 9 4 7 9 16 9 4 1
 */
 
public class P6_7 {
	public static void main(String[] args) {
		int[] numberArr = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		System.out.println("Array: ");
		for(int i = 0; i < numberArr.length; i++) {
			System.out.print(numberArr[i] + "  ");
		}
		reverseSequence(numberArr);
	}

	public static void reverseSequence(int[] inArray) {
//		Reversing the order IN the array and prints it
		for(int i = 0; i < inArray.length / 2; i++) {
			int temp = inArray[i];
			inArray[i] = inArray[inArray.length- 1 - i];
			inArray[inArray.length - 1 - i] = temp;
		}
		
		System.out.println("\n\nReversed array: ");
		for(int i = 0; i < inArray.length; i++) {
			System.out.print(inArray[i] + "  ");
		}
	}
}
