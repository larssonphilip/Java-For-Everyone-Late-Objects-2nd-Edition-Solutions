/**
 * Write a program that asks the user to input
 *  The number of gallons in the tank
 *  The fuel efficiency in miles per gallon
 *  The price of gas per gallon
 * Then print the cost per 100 miles and how far the car can go with the gas in the tank.
 */

import java.util.Scanner;

public class P2_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Gallons in the gas tank: ");
		double gallonsInTank = input.nextDouble();
		
		System.out.print("Fuel efficiency in miles per gallon: ");
		double fuelEfficiency = input.nextDouble();
		
		System.out.print("Price of gas per gallon: ");
		double gasPrice = input.nextDouble();
		input.close();
		
		double costPerHundredMiles = 100 / fuelEfficiency * gasPrice;
		double maxDistance = fuelEfficiency * gallonsInTank;
		
		System.out.printf("%nCost per 100 miles: $%.2f", costPerHundredMiles);
		System.out.printf("%nYou can go %.1f miles with the existing gas.", maxDistance);
	}
}
