/**
 * Write a program that prompts the user for two integers and then prints
 * The sum
 * The difference
 * The product
 * The average
 * The distance (absolute value of the difference)
 * The maximum (the larger of the two)
 * The minimum (the smaller of the two)
 * Hint: The max and min functions are declared in the Math class.
 */

import java.util.Scanner;

public class P2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		int firstNumber = input.nextInt();
		System.out.printf("Type the second number: ");
		int secondNumber = input.nextInt();
		input.close();
		
		System.out.println("\nSum: " + (firstNumber+secondNumber));
		System.out.println("Difference: " + (firstNumber-secondNumber));
		System.out.println("Product: " + (firstNumber*secondNumber));
		System.out.println("Average: " + ((firstNumber+secondNumber)/2));
		System.out.println("Distance: " + Math.abs(firstNumber-secondNumber));
		System.out.println("Maximum: " + Math.max(firstNumber, secondNumber));
		System.out.println("Minimum: " + Math.min(firstNumber, secondNumber));		
	}
}
