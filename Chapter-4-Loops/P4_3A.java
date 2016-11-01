/**Write programs that read a line of input as a string and print
 * a.  Only the uppercase letters in the string. -
 * b.  Every second letter of the string. -
 * c.  The string, with all vowels replaced by an underscore.
 * d.  The number of vowels in the string.
 */
 
import java.util.Scanner;

public class P4_3A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word or a line of text: ");
		String userInput = input.nextLine();
		String uppercaseOutput = "";
		input.close();

		for(int i = 0; i < userInput.length(); i++) {
			char currentLetter = userInput.charAt(i);
			if(Character.isUpperCase(currentLetter)) {
				uppercaseOutput += currentLetter;
			}
		}
		System.out.println(uppercaseOutput);
	}
}
