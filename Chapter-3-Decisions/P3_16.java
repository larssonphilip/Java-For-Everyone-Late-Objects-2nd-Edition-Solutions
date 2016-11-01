/**
 * Write a program that reads three strings and then sorts them lexicographically
 */

import java.util.Scanner;

public class P3_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("First string: ");
		String firstString = input.next();
    
		System.out.print("Second string: ");
		String secondString = input.next();
    
		System.out.print("Third string: ");
		String thirdString = input.next();
		input.close();

		if(firstString.compareTo(secondString) < 0 && firstString.compareTo(thirdString) < 0) {
			System.out.println(firstString);
			if(secondString.compareTo(thirdString) < 0){
				System.out.println(secondString);
				System.out.println(thirdString);
			}
			else {
				System.out.println(thirdString);
				System.out.println(secondString);
			}
		}
		else if(firstString.compareTo(secondString) > 0 && secondString.compareTo(thirdString) < 0) {
			System.out.println(secondString);
			if(firstString.compareTo(thirdString) < 0) {
				System.out.println(firstString);
				System.out.println(thirdString);
			}
			else {
				System.out.println(thirdString);
				System.out.println(firstString);
			}
		}
		else {
			System.out.println(thirdString);
			if(firstString.compareTo(secondString) < 0) {
				System.out.println(firstString);
				System.out.println(secondString);
			}
			else {
				System.out.println(secondString);
				System.out.println(firstString);
			}
		}
		
		System.exit(0);
	}

}
