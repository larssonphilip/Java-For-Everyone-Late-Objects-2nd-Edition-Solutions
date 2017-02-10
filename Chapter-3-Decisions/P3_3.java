/**
 * Write a program that reads an integer and prints how many digits the number has,
 * by checking whether the number is >= 10, >= 100, and so on. (Assume that all integers
 * are less than one billion.) If the number is negative, first multiply it by -1
 */
 
import java.util.Scanner;

public class P3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type an integer: ");
		long number = input.nextLong();
		input.close();
		
		if(number < 0) {
			number *= -1;
		}
		
		if(number < 10)
			System.out.println("The integer has one digit!");
		else if(number < 100)
			System.out.println("The integer has two digits!");
		else if(number < 1000)
			System.out.println("The integer has three digits!");
		else if(number < 10000)
			System.out.println("The integer has four digits!");
		else if(number < 100000)
			System.out.println("The integer has five digits!");
		else if(number < 1000000)
			System.out.println("The integer has six digits!");
		else if(number < 10000000)
			System.out.println("The integer has seven digits!");
		else if(number < 100000000)
			System.out.println("The integer has eight digits!");
		else if(number < 1000000000)
			System.out.println("The integer has nine digits!");
		else if(number == 1000000000)
			System.out.println("The integer has ten digits!");
		else
			System.out.println("The integer is bigger than one billion!");
	}
}
