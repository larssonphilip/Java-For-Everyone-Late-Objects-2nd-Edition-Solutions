/**
 * Write a method
 * public static int countVowels(String str)
 * that returns a count of all vowels in the string str . Vowels are the letters a, e, i, o, and
 * u, and their upper­case variants.
 */
 
import java.util.Scanner;

public class P5_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word or sentence: ");
		String userInput = input.nextLine();
		input.close();

		System.out.println("Your word / sentence contains of " + countVowels(userInput) + " vowels.");
	}

	public static int countVowels(String str) {
		int vowelsCounter = 0;
		String vowels = "aouåeiyäö";
		for(int i = 0; i < str.length(); i++) {
			char currentChar = Character.toLowerCase(str.charAt(i));
			if(vowels.contains(Character.toString(currentChar))) {
				vowelsCounter++;
			}
		}
		return vowelsCounter;
	}
}
