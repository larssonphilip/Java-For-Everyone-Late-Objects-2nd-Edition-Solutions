/**Write a method
 * public static int countWords(String str)
 * that returns a count of all words in the string str . Words are separated by spaces. For
 * example, countWords("Mary had a little lamb") should return 5.
 */
 
import java.util.Scanner;

public class P5_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a sentence: ");
		String userInput = input.nextLine();
		input.close();

		System.out.println("There's " + countWords(userInput) + " words in that sentence.");
		System.exit(0);
	}

	public static int countWords(String str) {
		int wordCounter = 0;
		str = str.trim();
    
		if(!str.isEmpty()) {
			wordCounter++;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					wordCounter++;
				}	
			}
		}
		return wordCounter;
	}
}
