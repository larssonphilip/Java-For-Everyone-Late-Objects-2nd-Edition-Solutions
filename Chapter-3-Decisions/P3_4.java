/**
 * Write a program that reads three numbers and prints "All the same"
 * if they are all the same and "All different" if the they all are different
 * and "Neither" otherwise.
 */

import java.util.Scanner;

public class P3_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		double firstNumber = input.nextDouble();
    
		System.out.print("Type the second number: ");
		double secondNumber = input.nextDouble();
    
		System.out.print("Type the third number: ");
		double thirdNumber = input.nextDouble();
		input.close();
		
		if(firstNumber == secondNumber && firstNumber == thirdNumber) {
			System.out.println("All the numbers are the same.");
		}
		else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
			System.out.println("All the numbers are different.");
		}
		else {
			System.out.println("Neither.");
		}
	}
}
