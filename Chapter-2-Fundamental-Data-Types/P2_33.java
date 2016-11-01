/**
 * Calculate the electrical force, with the help of Coulombs Force Law
 */

import java.util.Scanner;

public class P2_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter charge of the first particle: ");
		int chargeOfFirstParticle = input.nextInt();
		
		System.out.print("Enter charge of the second particle: ");
		int chargeOfSecondParticle = input.nextInt();
		
		System.out.print("Enter the distance (in meters) between particles: ");
		int distanceInMeters = input.nextInt();
		input.close();
		
		double coulombsForceLaw = (chargeOfFirstParticle*chargeOfSecondParticle) / ((4*Math.PI)*(8.854*Math.pow(10, -12))*(distanceInMeters*distanceInMeters));
		System.out.print("The electric force is: " + coulombsForceLaw + " Newton");
	}
}
