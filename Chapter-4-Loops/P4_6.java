/**Translate the following pseudocode for finding the minimum value from a set of
 * inputs into a Java program.
 *    Set a Boolean variable "first" to true.
 *    While another value has been read successfully
 *        If first is true
 *            Set the minimum to the value.
 *            Set first to false.
 *        Else if the value is less than the minimum
 *            Set the minimum to the value.
 *    Print the minimum.
 */

import java.util.Scanner;

public class P4_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean first = true;
		int minimumValue = 0;

		System.out.println("Type a sequence of numbers (Type any letter to stop the program): ");
		while(input.hasNextInt()) {
			int userInput = input.nextInt();
			if(first == true) {
				minimumValue = userInput;
				first = false;
			}
			else if (userInput < minimumValue) {
				minimumValue = userInput;
			}
		}

		input.close();
		System.out.println("The minimum value is: " + minimumValue);
	}
}
