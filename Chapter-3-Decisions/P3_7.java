/**
 * Write a program that reads in three integers and prints “in order” if they are sorted in
 * ascending or descending order, or “not in order” otherwise. For example,
 *     1 2 5 in order
 *     1 5 2 not in order
 *     5 2 1 in order
 *     1 2 2 in order
 */

import java.util.Scanner;

public class övning3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write the first number: ");
		int firstNumber = input.nextInt();
    
		System.out.print("Write the second number: ");
		int secondNumber = input.nextInt();
    
		System.out.print("Write the third number: ");
		int thirdNumber = input.nextInt();
		input.close();
		
		if(firstNumber <= secondNumber && secondNumber <= thirdNumber || 
				firstNumber >= secondNumber && secondNumber > thirdNumber) {
			System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " - In order");
		}
		else {
			System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " - Not in order");
		}
	}
}
