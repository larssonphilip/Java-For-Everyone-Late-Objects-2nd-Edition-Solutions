/**
 * Write a method
 * public static String middle(String str)
 * that returns a string containing the middle character in str if the length of str is odd,
 * or the two middle characters if the length is even. For example, middle("middle")
 * returns "dd" .
 */
 
import java.util.Scanner;

public class P5_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word: ");
		String userInput = input.next();
		input.close();

		System.out.println("The letter(s) in the middle: " + middle(userInput));
	}

	public static String middle(String str) {
		int middle = str.length() / 2;
		return (str.length() % 2 == 0) ? str.substring(middle - 1, middle + 1) : str.substring(middle, middle + 1);
	}
}
