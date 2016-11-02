/** 
 * Write array methods that carry out the following tasks for an array of integers.
 * For each method, provide a test program.
 * e. Remove the middle element if the array length is odd, or the middle two elements if the length is even.
 * h. Return true if the array is currently sorted in increasing order.
 */
 
public class P6_2eh {
	public static void main(String[] args) {
		int[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		removeMiddleElement(firstArr);
		
		System.out.print("e. ");
		for(int i = 0; i < firstArr.length; i++) {
			System.out.print(firstArr[i] + "  ");
		}
		
		System.out.print("\n\nh. ");
		int[] secondArr = {1, 2, 3, 4, 5};
		printH(secondArr);
	}

	public static void removeMiddleElement(int[] inArray) {
		int middle = inArray.length / 2;
		if(inArray.length % 2 == 0) {
			for (int i = middle; i < inArray.length - 1; i++) {
                inArray[i - 1] = inArray[i + 1];
            }
            inArray[inArray.length - 1] = 0;
            inArray[inArray.length - 2] = 0;
		}
		else if(inArray.length % 2 == 1) {
			for (int i = middle; i < inArray.length - 1; i++) {
                inArray[i] = inArray[i + 1];
            }
            inArray[inArray.length - 1] = 0;
		}
	}
	
	public static boolean isSorted(int[] inArray) {
		for(int i = 0; i < inArray.length - 1; i++) {
			if(inArray[i] > inArray[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void printH(int[] inArray) {
		for(int i = 0; i < inArray.length; i++) {
			System.out.print(inArray[i] + "  ");
		}
		
		if(isSorted(inArray) == true) {
			System.out.println("(The array is sorted in increasing order!)");
		}
		else {
			System.out.println("(The array is not sorted in increasing order!)");
		}
	}
}
