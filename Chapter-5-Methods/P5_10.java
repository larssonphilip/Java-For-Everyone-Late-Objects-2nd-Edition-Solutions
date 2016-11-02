/**
 * Write a method
 * public static double readDouble(String prompt)
 * that displays the prompt string, followed by a space, reads a floating-point number
 * in, and returns it. Here is a typical usage:
 *	salary = readDouble("Please enter your salary:");
 *	percentageRaise = readDouble("What percentage raise would you like?");
 */
 
import java.util.Scanner;

public class P5_10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double floatingPointNumber = readDouble(input, "Please enter a floating-point number:");

		System.out.printf("The floating-point number is: %.2f", floatingPointNumber);
		input.close();
	}

	public static double readDouble(Scanner scan, String prompt){
		System.out.print(prompt + " ");
    
		while(!scan.hasNextDouble()) {
			scan.nextLine();
		}
		double value = scan.nextDouble();
		return value;
	}
}
