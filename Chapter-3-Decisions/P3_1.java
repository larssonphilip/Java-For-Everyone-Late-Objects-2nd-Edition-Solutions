/**
 * Write a program that reads an integer and 
 * prints whether it's negative, positive or zero
 */
 
import java.util.Scanner;

public class P3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write a number: ");
		int number = input.nextInt();
		input.close();

		if(number < 0) {
			System.out.println("The number is negative");
		}
		else if(number == 0) {
			System.out.println("The number is equal to zero");
		}
		else {
			System.out.println("The number is positive");
		}
    
//  Everything written above, but on one line:
//	System.out.println((number<0)? "The number is negative": (number==0)? "The number is equal to zero": "The number is positive");
	}
}
