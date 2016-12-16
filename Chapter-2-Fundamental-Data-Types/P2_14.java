/**
 * Write a program that reads a number between 1000 and 999999 
 * from the user and prints it with a comma separating the thousands. 
 * Here is a sample dialog; the user input is in color: 
 *  Please enter an integer between 1000 and 999999: 23456
 *  23,456
 */
import java.util.Scanner;

public class P2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a integer between 1000 and 999999, without a comma");
		String integer = input.nextLine();
		input.close();
		
		String beforeComma = integer.substring(0, integer.length() - 3);
		String afterComma = integer.substring(integer.length() - 3);
		
		System.out.println(beforeComma + "," + afterComma);
		System.exit(0);
	}
}
