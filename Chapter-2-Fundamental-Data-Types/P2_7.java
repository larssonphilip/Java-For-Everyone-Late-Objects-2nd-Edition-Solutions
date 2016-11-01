/**
 * Write a program that prompts the user for a radius and then prints
 * The area and circumference of a circle with that radius
 * The volume and surface area of a sphere with that radius
 */

import java.util.Scanner;

public class P2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the radius: ");
		double radiusLength = input.nextDouble();
		input.close();
		
		System.out.printf("The area of a circle with that radius is: %.1f", (Math.PI*Math.pow(radiusLength, 2)));
		System.out.printf("%nThe circumference of a circle with that radius is: %.1f", (Math.PI*(radiusLength*2)));
		System.out.printf("%nThe volume of a sphere with that radius is: %.1f", ((Math.PI*4*Math.pow(radiusLength, 3))/3));
		System.out.printf("%nThe surface area of a sphere with that radius is: %.1f", 4*Math.PI*Math.pow(radiusLength, 2));		
	}
}
