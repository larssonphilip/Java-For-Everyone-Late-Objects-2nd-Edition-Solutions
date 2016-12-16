/**
 * Write a program that reads a number between 1,000 and 999,999 from the user,
 * where the user enters a comma in the input. Then print the number without a comma. 
 * Here is a sample dialog:
 * Please enter an integer between 10,000 and 99,999: 23,456
 *   23456
 * Hint: Read the input as a string. Measure the length of the string. Suppose it contains n characters.
 * Then extract substrings consisting of the first n - 4 characters and the last three characters
 */

import java.util.Scanner;

public class P2_13 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Type a integer between 1,000 - 999,999, comma included: ");
        String integer = input.nextLine();
        input.close();
		
        String beforeComma = integer.substring(0, integer.length() - 4);
        String afterComma = integer.substring(integer.length() - 3);
        System.out.println(beforeComma + afterComma);
	}
}
