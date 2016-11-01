/**
 * A program that reads two points in time, 
 * in military time, to check if which of the two that comes first
 */
import java.util.Scanner;

public class P3_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("First time: ");
		int firstTime = input.nextInt();
    
		System.out.print("Second time: ");
		int secondTime = input.nextInt();
		input.close();
		
		int firstHours = firstTime / 100;
		int firstMinutes = firstTime % 100 + firstHours * 60;
		int secondHours = secondTime / 100;
		int secondMinutes = secondTime % 100 + secondHours * 60;
    
		if(firstHours > 23 || firstHours < 00 || secondHours > 23 || secondHours < 00) {
			System.out.println("Invalid hour!");
			System.exit(0);
		}
		
		if(firstHours < secondHours) {
			System.out.println(firstTime);
			System.out.println(secondTime);
		}
		else if(firstHours == secondHours) {
			if(firstMinutes < secondMinutes) {
				System.out.println(firstTime);
				System.out.println(secondTime);
			}
			else if (firstMinutes == secondMinutes) {
				System.out.println("The first and the second time are the same.");
				System.out.println(firstTime);
				System.out.println(secondTime);
			}
			else {
				System.out.println(secondTime);
				System.out.println(firstTime);
			}
		}
		else {
			System.out.println(secondTime);
			System.out.println(firstTime);
		}
	}

}
