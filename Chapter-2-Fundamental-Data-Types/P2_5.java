/**
 * Enhance the output of P2_4.java so that the numbers are properly aligned.
 */

import java.util.Scanner;

public class P2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		double firstNumber = input.nextDouble();
		System.out.printf("Type the second number: ");
		double secondNumber = input.nextDouble();
		input.close();
		
		System.out.printf("%n************************");
		System.out.printf("%nSum:%20.1f", (firstNumber+secondNumber));
		System.out.printf("%nDifference:%13.1f", (firstNumber-secondNumber));
		System.out.printf("%nProduct:%16.1f", (firstNumber*secondNumber));
		System.out.printf("%nAverage:%16.1f", ((firstNumber+secondNumber)/2));
		System.out.printf("%nDistance:%15.1f", Math.abs(firstNumber-secondNumber));
		System.out.printf("%nMaximum:%16.1f", Math.max(firstNumber, secondNumber));
		System.out.printf("%nMinimum:%16.1f", Math.min(firstNumber, secondNumber));
		System.out.printf("%n************************");		
	}
}
