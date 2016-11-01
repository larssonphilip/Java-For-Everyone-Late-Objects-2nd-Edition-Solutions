/**
 * Write a program that transforms numbers  1 ,  2 ,  3 , …,  12
 * into the corresponding month names  January ,  February ,
 * March , …,  December . Hint: Make a very long string  "January
 * February March ..." , in which you add spaces such that
 * each month name has the same length. Then use substring to extract the month you want.
 */

import java.util.Scanner;

public class P2_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of month: ");
		int monthNumber = input.nextInt();
		input.close();
		
		if(monthNumber < 13) {
			String nameOfMonths = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
			String monthOutput = nameOfMonths.substring((monthNumber - 1) * 9, monthNumber * 9);
			System.out.print(monthOutput);
		}
		else {
			System.out.println("There's only 12 months in a year.");
		}
	}
}
