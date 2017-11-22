/**
 * Write a recursive method
 * public static String reverse(String str)
 * that computes the reverse of a string. For example, reverse("flow") should return
 * "wolf" . Hint: Reverse the substring starting at the second character, then add the first
 * character at the end. For example, to reverse "flow" , first reverse "low" to "wol" , then
 * add the "f" at the end.
 */
 
import java.util.Scanner;

public class P5_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type the word you want to reverse: ");
		System.out.println("Your word reversed is: " + reverse(input.next()));
		input.close();
	}

	public static String reverse(String str) {
		return (str.length() > 1) ? reverse(str.substring(1)) + str.charAt(0) : str;
	}
}
