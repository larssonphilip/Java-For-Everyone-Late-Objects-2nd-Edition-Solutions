/** Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
 * Every element at an even index.
 * Every even element.
 * All elements in reverse order.
 * Only the first and the last element.
 */
 
public class P6_1 {
	public static void main(String[] args) {
		int[] numbersArr = new int[10];
		for(int i = 0; i < numbersArr.length; i++) {
			numbersArr[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("The array: ");
		for(int i = 0; i < numbersArr.length; i++) {
			System.out.print(numbersArr[i] + "\t");
		}
		System.out.println("\n\nEvery element at an even index: ");
		for(int i = 0; i < numbersArr.length; i++) {
			if(i % 2 == 0)
				System.out.print(numbersArr[i] + "\t");
		}
		
		System.out.println("\n\nEvery even element: ");
		for(int i = 0; i < numbersArr.length; i++) {
			if(numbersArr[i] % 2 == 0)
				System.out.print(numbersArr[i] + "\t");
		}
		
		System.out.println("\n\nAll elements in reverse order: ");
		for(int i = numbersArr.length - 1; i >= 0; i--) {
			System.out.print(numbersArr[i] + "\t");
		}
		
		System.out.println("\n\nOnly the first and the last element: ");
		System.out.print(numbersArr[0] + "\t");
		System.out.println(numbersArr[numbersArr.length - 1]);
	}
}
