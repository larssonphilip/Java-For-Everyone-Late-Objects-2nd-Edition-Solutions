/** 
 * Write array methods that carry out the following tasks for an array of integers.
 * For each method, provide a test program.
 * a. Swap the first and last elements in the array
 * b. Shift all elements by one to the right and move the last element into the first
 * position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16
 * d. Replace each element except the first and last by the larger of its two neighbors.
 */
 
public class P6_2abd {
	public static void main(String[] args) {
		int swapArr[] = {1, 2, 3, 4, 5, 6, 7};
		swapElements(swapArr, 0, swapArr.length - 1);
		System.out.print("A: ");
		for(int i = 0; i < swapArr.length; i++) System.out.print(swapArr[i] + "  ");
		System.out.println();

		int shiftArr[] = {1, 2, 3, 4, 5, 6, 7};
		shiftElements(shiftArr);
		System.out.print("\nB: ");
		for(int i = 0; i < shiftArr.length; i++) System.out.print(shiftArr[i] + "  ");
		System.out.println();

		int replaceArr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("\nD: ");
		replaceElements(replaceArr);
	}

	public static void swapElements(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}

	public static void shiftElements(int[] array) {
		int temp = array[array.length - 1];
		System.arraycopy(array, 0, array, 1, array.length - 1);
		array[0] = temp;
	}

	public static int[] replaceElements(int[] array) {
		int[] newArray = new int[array.length];
		newArray[0] = array[0];
		newArray[newArray.length - 1] = array[array.length - 1];

		for(int i = 1; i < array.length - 1; i++) {
			if(array[i + 1] > array[i - 1]) newArray[i] = array[i + 1];
			else if(array[i - 1] > array[i + 1]) newArray[i] = array[i - 1];
		}

		for(int i = 0; i < newArray.length; i++) System.out.print(newArray[i] + "  ");
		
		return array;
	}
}
