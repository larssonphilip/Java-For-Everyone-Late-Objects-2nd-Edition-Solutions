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
		String output = "";
		int strMiddle = str.length() / 2;
		if(str.length() % 2 == 0) {
			output = str.substring(strMiddle - 1, strMiddle + 1);
		}
		else {
			output = str.substring(strMiddle, strMiddle + 1);
		}
		return output;
	}
}
