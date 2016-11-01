/**Write a program that reads a word and prints the word in reverse. For example, if the
 *	user provides the input  "Harry" , the program prints
 *    yrraH 
 */
 
import java.util.Scanner;

public class P4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word: ");
		String userInput = input.next();
		input.close();

		for(int i = userInput.length() - 1; i >= 0; i--) {
			System.out.print(userInput.charAt(i));
		}
	}
}
