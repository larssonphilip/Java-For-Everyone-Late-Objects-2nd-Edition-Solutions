/**
  * Write a program that reads a floating-point number and prints "Zero" if the number
  * is zero. Otherwise, print "Positive" or "Negative". Add "Small" if the absolute value
  * of the number is less than 1, or "Large" if it exceeds 1,000,000-
  */
 
import java.util.Scanner;

public class P3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a floating-point number: ");
		float number = input.nextFloat();
		if(number == 0) {
			System.out.println("Zero");
		}
		else {
			if(number > 0) {
				if(Math.abs(number) < 1)
					System.out.print("Small ");
				if(Math.abs(number) > 1000000)
					System.out.print("Large ");
				System.out.println("positive");
			}
			else {
				if(Math.abs(number) < 1)
					System.out.print("Small ");
				if(Math.abs(number) > 1000000)
					System.out.print("Large ");
				System.out.println("negative");
			}
		}
		
		input.close();
	}
}
