/**
 * A program that reads Celsius / Fahrenheit, temperature, altitude type, altitude.
 * And prints if the water is liquid, solid or gas at the given temperature.
 */

import java.util.Scanner;

public class P3_9_to_P3_11 {
	public static void main(String[] args) {
		final int FROZEN_CELSIUS = 0;
		final int FROZEN_FAHRENHEIT = 32;
		double boilingCelsius = 100;
		double boilingFahrenheit = 212;
		double tempValue = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Type a 'C' for Celsius and a 'F' for Fahrenheit: ");
		String tempType = input.next();
		System.out.print("Type the temperature: ");
		if(input.hasNextDouble()){
			tempValue = input.nextDouble();
		}
		else {
			System.out.println("Invalid temperature!");
			System.exit(0);
		}

		System.out.print("Type a 'M' for meters and 'Ft' for feet: ");
		String altType = input.next();

		if(!altType.equals("M") && !altType.equals("Ft") && !altType.equals("m") && !altType.equals("ft") && !altType.equals("fT") && !altType.equals("FT")){
			System.out.println("Invalid unit!");
			System.exit(0);
		}

		System.out.print("Type the altitude: ");
		double altValue = input.nextDouble();
		input.close();
		
		if(tempType.equals("C") || tempType.equals("c")) {
			if(altType.equals("M") || altType.equals("m")) {
				boilingCelsius -= altValue / 300;
			}
			else if(altType.equals("Ft") || altType.equals("ft") || altType.equals("fT") || altType.equals("FT")){
				boilingCelsius -= altValue / 1000;
			}
			if(tempValue > FROZEN_CELSIUS && tempValue < boilingCelsius) {
				System.out.println("The water is liquid.");
			}
			else if(tempValue <= FROZEN_CELSIUS) {
				System.out.println("The water is solid.");
			}
			else {
				System.out.println("The water is gaseous.");
			}
		}
		else if(tempType.equals("F") || tempType.equals("f")) {
			if(altType.equals("M") || altType.equals("m")) {
				boilingCelsius -= altValue / 300;
			}
			else if(altType.equals("Ft") || altType.equals("ft") || altType.equals("fT") || altType.equals("FT")){
				boilingCelsius -= altValue / 1000;
			}

			if(tempValue > FROZEN_FAHRENHEIT && tempValue < boilingFahrenheit) {
				System.out.println("The water is liquid.");
			}
			else if(tempValue <= FROZEN_FAHRENHEIT) {
				System.out.println("The water is solid.");
			}
			else {
				System.out.println("The water is gaseous.");
			}
		}
	}
}
