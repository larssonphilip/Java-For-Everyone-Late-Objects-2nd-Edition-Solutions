/**
 * Write a program that can convert ml, l, g, kg, mm, cm, m to fl.oz, gal, oz, lb, in, ft
 * Slightly modified
 */

import java.util.Scanner;

public class P3_24 {
	public static void main(String[] args) {
		final double LITER_TO_FLUID_OUNCE = 33.8140;
		final double LITER_TO_GALLON = 0.2642;
		final double GRAM_TO_OUNCE = 0.03527;
		final double GRAM_TO_POUND = 0.002205;
		final double METER_TO_INCH = 39.3701;
		final double METER_TO_FEET = 3.2808;
		final String SPACE = " ";

		Scanner input = new Scanner(System.in);

		System.out.print("Convert from (ml, l, g, kg, mm, cm, m): ");
		String conversionFrom = input.next();
		double valueToConvert;

		if(conversionFrom.equals("mm") || conversionFrom.equals("cm") || conversionFrom.equals("m") ){
			System.out.print("Convert to (in, ft): ");
			String conversionTo = input.next();
			if(conversionFrom.equals("mm") && conversionTo.equals("in")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_INCH / 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("cm") && conversionTo.equals("in")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_INCH / 100);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("m") && conversionTo.equals("in")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_INCH);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("mm") && conversionTo.equals("ft")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_FEET / 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("cm") && conversionTo.equals("ft")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_FEET / 100);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("m") && conversionTo.equals("ft")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (METER_TO_FEET);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
		}
		else if(conversionFrom.equals("g") || conversionFrom.equals("kg")) {
			System.out.print("Convert to (oz, lb): ");
			String conversionTo = input.next();
			if(conversionFrom.equals("g") && conversionTo.equals("oz")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * GRAM_TO_OUNCE;
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("kg") && conversionTo.equals("oz")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (GRAM_TO_OUNCE * 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("g") && conversionTo.equals("lb")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (GRAM_TO_POUND);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("kg") && conversionTo.equals("lb")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (GRAM_TO_POUND * 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
		}
		else if(conversionFrom.equals("ml") || conversionFrom.equals("l")) {
			System.out.print("Convert to (fl.oz, gal): ");
			String conversionTo = input.next();
			if(conversionFrom.equals("ml") && conversionTo.equals("fl.oz")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (LITER_TO_FLUID_OUNCE / 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("ml") && conversionTo.equals("gal")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (LITER_TO_GALLON / 1000);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("l") && conversionTo.equals("fl.oz")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (LITER_TO_FLUID_OUNCE);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
			else if(conversionFrom.equals("l") && conversionTo.equals("gal")) {
				System.out.print("Value: ");
				valueToConvert = input.nextDouble();
				double convertedValue = valueToConvert * (LITER_TO_GALLON);
				System.out.print(valueToConvert + SPACE + conversionFrom + " = " + convertedValue + SPACE + conversionTo);
			}
		}
		else {
			System.out.println(conversionFrom + " is not one of the options!");
		}
		input.close();
	}
}
