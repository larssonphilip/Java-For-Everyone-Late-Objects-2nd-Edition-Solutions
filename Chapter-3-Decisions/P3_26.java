/**
 * Write a program that converts a positive integer between 1 - 3999 into the Roman
 * number system.
 */

import java.util.Scanner;

public class övning9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Write a integer (1-3999): ");
		int number = input.nextInt();
		input.close();
		String romanNumber = "";

		if(number < 1 || number > 3999) {
			System.out.println("The number must be an integer between 1 - 3999!");
		}

		int singleDigit = number / 1000;

		if(singleDigit == 3) {
			romanNumber = "MMM";
		}
		else if(singleDigit == 2) {
			romanNumber = "MM";
		}
		else if(singleDigit == 1) {
			romanNumber = "M";
		}

		singleDigit = (number % 1000) / 100;

		if(singleDigit == 9) {
			romanNumber += "CM";
		}
		else if(singleDigit == 4) {
			romanNumber += "CD";
		}
		else {
			if(singleDigit >= 5) {
				romanNumber += "D";
				singleDigit -= 5;
			}
			else if(singleDigit == 3) {
				romanNumber += "CCC";
			}
			else if(singleDigit == 2) {
				romanNumber += "CC";
			}
			else if(singleDigit == 1) {
				romanNumber += "C";
			}
		}
		singleDigit = (number % 100) / 10;
		if(singleDigit == 9) {
			romanNumber += "XC";
		}
		else if(singleDigit == 4) {
			romanNumber += "XL";
		}
		else {
			if(singleDigit >= 5) {
				romanNumber += "L";
				singleDigit -= 5;
			}
			else if(singleDigit == 3) {
				romanNumber += "XXX";
			}
			else if(singleDigit == 2) {
				romanNumber += "XX";
			}
			else if(singleDigit == 1) {
				romanNumber += "X";
			}
		}
		singleDigit = number % 10;
		if(singleDigit == 9) {
			romanNumber += "IX";
		}
		else if(singleDigit == 4) {
			romanNumber += "IV";
		}
		else {
			if(singleDigit >= 5) {
				romanNumber += "V";
				singleDigit -= 5;
			}
			else if(singleDigit == 3) {
				romanNumber += "III";
			}
			else if(singleDigit == 2) {
				romanNumber += "II";
			}
			else if(singleDigit == 1) {
				romanNumber += "I";
			}
		}
		System.out.println("Roman number: " + romanNumber);
	}
}
