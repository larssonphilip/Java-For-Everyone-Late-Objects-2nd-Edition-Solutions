/**
 *Write a program that reads in two floating­point numbers and tests whether they are
 *the same up to two decimal places. Here are two sample runs.
 *    Enter a floating-point number: 2.0
 *    Enter a floating-point number: 1.99998
 *    They are the same up to two decimal places.
 *    Enter a floating-point number: 2.0
 *    Enter a floating-point number: 1.98999
 *    They are different.
 */
 
import java.util.Scanner;

public class P3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a floating-point number: ");
		double firstNumber = input.nextDouble();
    
		System.out.print("Enter another floating-point number: ");
		double secondNumber = input.nextDouble();
		input.close();

		if(Math.abs(firstNumber - secondNumber) <= 0.01) {
			System.out.println("They are the same up to two decimal places.");
		}
		else {
			System.out.println("They are different.");
		}
	}
}
