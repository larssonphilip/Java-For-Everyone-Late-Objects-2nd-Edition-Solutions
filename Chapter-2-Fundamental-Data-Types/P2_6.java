/**
 * Write a program that prompts the user for a measurement in meters and
 * then converts it to miles, feet, and inches.
 */

import java.util.Scanner;

public class P2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Measurement in meters: ");
		double measurementInMeters = input.nextInt();
		input.close();
		
		double measurementInMiles = measurementInMeters * 0.000621371192;
		double measurementInFeet = measurementInMeters * 3.28084;
		double measurementInInches = measurementInMeters * 39.37;
		
		System.out.printf("Meters to miles: %.3f", measurementInMiles);
		System.out.printf("%nMeters to feet: %.3f", measurementInFeet);
		System.out.printf("%nMeters to inches: %.3f", measurementInInches);
	}
}
