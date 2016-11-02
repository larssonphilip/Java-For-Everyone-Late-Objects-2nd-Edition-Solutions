/**
 * Testprogram for the class "SodaCan".
 */

import java.util.Scanner;

public class P8_5_test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type the height of the can: ");
		double height = input.nextDouble();
		System.out.print("Type the radius of the can: ");
		double radius = input.nextDouble();
		input.close();
		
		SodaCan sc = new SodaCan(height , radius);
		System.out.printf("%nSurface area: %.2f", sc.getSurfaceArea());
		System.out.printf("%nVolume: %.2f", sc.getVolume());
	}
}


