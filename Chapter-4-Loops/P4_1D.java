/**Write programs with loops that compute
 *   a.  The sum of all even numbers between 2 and 100 (inclusive).
 *   b.  The sum of all squares between 1 and 100 (inclusive).
 *   c.  All powers of 2 from 2 0 up to 2 20 .
 *   d.  The sum of all odd numbers between  a and  b (inclusive), where  a and  b are
 *   inputs.
 */

import java.util.Scanner;

public class P4_1D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("A: ");
		int firstNumber = input.nextInt();
		System.out.print("B: ");
		int secondNumber = input.nextInt();
		input.close();

		int oddSum = 0;
		for(int i = firstNumber; i <= secondNumber; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			}
		}
		System.out.println("The sum of the odd numbers between " + firstNumber + " and " + secondNumber + ": " + oddSum);
	}
}
