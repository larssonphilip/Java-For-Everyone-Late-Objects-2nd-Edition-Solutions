/**
 * Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the  Math.pow method only for the fourth power.
 */
 
import java.util.Scanner;

public class P2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number = input.nextInt();
		input.close();
		
		System.out.println("Square: " + (number * number));
		System.out.println("Cube: " + (number * number * number));
		System.out.println("Quad / Forth power: " + Math.pow(number, 4));
	}
}
