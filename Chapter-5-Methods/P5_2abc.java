/**
 * Write the following methods and provide a program to test them.
 * a. boolean allTheSame(double x, double y, double z) , returning true if the arguments are all the same
 * b. boolean allDifferent(double x, double y, double z) , returning true if the arguments are all different
 * c. boolean sorted(double x, double y, double z) , returning true if the arguments are sorted, with the largest one coming first
 */
 
import java.util.Scanner;

public class P5_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type three numbers, with a space separating them: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		input.close();

		System.out.println("allTheSame returns: " + allTheSame(number1, number2, number3));
		System.out.println("allDifferent returns: " + allDifferent(number1, number2, number3));
		System.out.println("sorted returns: " + sorted(number1, number2, number3));
	}

	public static boolean allTheSame(double x, double y, double z) {
		return x == y && y == z;
	}

	public static boolean allDifferent(double x, double y, double z) {
		return (x != y) && (y !=z) && (x != z);
	}

	public static boolean sorted(double x, double y, double z) {
		return (x <= y && y <= z);
	}
}
