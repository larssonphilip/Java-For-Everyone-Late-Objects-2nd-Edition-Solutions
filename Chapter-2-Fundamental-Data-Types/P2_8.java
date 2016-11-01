/**
 * Write a program that asks the user for the lengths of the sides of a rectangle. 
 * Then print:
 * The area and perimeter of the rectangle
 * The length of the diagonal
 */
 
import java.util.Scanner;

public class P2_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First length: ");
		double firstLength = input.nextDouble();
		System.out.print("Second length: ");
		double secondLength = input.nextDouble();
		input.close();
		
		System.out.printf("%nThe area of the rectangle: %.0f", firstLength*secondLength);
		System.out.printf("%nThe perimeter of the rectangle: %.0f", firstLength*2+secondLength*2);
		System.out.printf("%nThe length of the diagonal of the rectangle: %.1f", Math.sqrt((firstLength*firstLength)+(secondLength*secondLength)));
	}
}
