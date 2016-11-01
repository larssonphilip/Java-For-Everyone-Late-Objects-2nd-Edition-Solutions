/**Write programs that read a sequence of integer inputs and print
 *  a.  The smallest and largest of the inputs.
 *  b.  The number of even and odd inputs.
 *  c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
 *  1 8 10 19.
 *  d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
 *  program should print 3 5 6
 */
 
import java.util.Scanner;

public class P4_2A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a number (1/10): ");

		int inputNumber = input.nextInt();
		int smallestNumber = inputNumber;
		int largestNumber = inputNumber;

		int i = 1;
		while(i != 10) {
			System.out.print("Type another number (" + (i+1) + ("/10): "));
			inputNumber = input.nextInt();

			if(inputNumber < smallestNumber) {
				smallestNumber = inputNumber;
			}
			else if(inputNumber > largestNumber) {
				largestNumber = inputNumber;
			}
			i++;
		}

		System.out.println("Smallest number: " + smallestNumber);
		System.out.println("Largest number: " + largestNumber);

		input.close();
	}
}
