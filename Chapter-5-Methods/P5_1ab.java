/** 
 * Write the following methods and provide a programs to test them.
 * a. double smallest(double x, double y, double z), returning the smallest of the arguments
 * b. double average(double x, double y, double z), returning the average of the arguments
 */
 
import java.util.Scanner;

public class P5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type three numbers, with a space separating them: ");
		double number1= input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		input.close();

		System.out.println("The smallest number is: " + smallest(number1, number2, number3));
		System.out.printf("The average is: %.1f %n", average(number1, number2, number3));
	}

	public static double smallest(double x, double y, double z) {
		if((x <= y && x <= z)) {
			return x;
		}
		else if(y <= x && y <= z) {
			return y;
		}
		else {
			return z;
		}
	}

	public static double average(double x, double y, double z) {
		return (x+y+z)/3;
	}
}
