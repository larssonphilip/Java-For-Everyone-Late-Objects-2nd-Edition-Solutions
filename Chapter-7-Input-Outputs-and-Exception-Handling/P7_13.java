/**
 * Write a program that asks the user to input a set of floating-point values.
 * When the user enters a value that is not a number, give the user a second chance to enter the value. 
 * After two chances, quit reading input. Add all correctly specified values and print the sum when the user is done entering data.
 * Use exception handling to detect improper inputs.
 */
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class P7_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write some floating-point values: ");
		
		int triesLeft = 2;
		int howManyNumbers = 0;
		double sum = 0;
		
		while(triesLeft > 0) {
			try {
				sum += input.nextDouble();
				howManyNumbers++;
			}
			catch(InputMismatchException e) {
				System.out.println("Improper input!");
				input.next();
				triesLeft--;
			}
		}
		input.close();
		
		double average = sum / howManyNumbers;
		System.out.println("Average: " + average);
	}
}
