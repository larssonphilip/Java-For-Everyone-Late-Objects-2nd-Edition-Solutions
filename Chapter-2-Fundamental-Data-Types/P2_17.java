/**
 * Write a program that reads two times in military format (0900, 1730) and prints the
 * number of hours and minutes between the two times. Here is a sample run. User
 * input is in color.
 * Please enter the first time: 0900
 * Please enter the second time: 1730
 * 8 hours 30 minutes
 * Extra credit if you can deal with the case where the first time is later than the second:
 *  Please enter the first time: 1730
 *  Please enter the second time: 0900
 *   15 hours 30 minutes
 */

import java.util.Scanner;

public class P2_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first time: ");
		int minutesInOneHour = 60;
		int minutesInOneDay = 24*60;
		int firstTime = input.nextInt();
		int firstTimeInMinutes = firstTime / 100 * minutesInOneHour + firstTime % 100;
		
		System.out.print("Enter the second time: ");
		int secondTime = input.nextInt();
		int secondTimeInMinutes = secondTime / 100 * minutesInOneHour + secondTime % 100;
		input.close();
	
		int minutes = secondTimeInMinutes - firstTimeInMinutes; //Skillnaden i minuter
		minutes = ((minutesInOneDay + minutes) % minutesInOneDay);
		int hours = minutes / 60;
		minutes %= 60;
		
		System.out.printf("%d hours %d minutes", hours, minutes);
	}
}
