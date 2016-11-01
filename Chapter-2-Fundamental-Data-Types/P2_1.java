/**
 * Write a program that displays the dimensions of a letter­size (8.5 × 11 inch) sheet of paper in millimeters. 
 * There are 25.4 millimeters per inch. Use constants and comments in your program.
 */

public class P2_1 {
	public static void main(String[] args) {
		final double MILLIMETERS_PER_INCH = 25.4;
		final double lettersizeInch_X = 8.5;
		final double lettersizeInch_Y = 11.0;
    
		double lettersizeMm_X = lettersizeInch_X * MILLIMETERS_PER_INCH;
		double lettersizeMm_Y = lettersizeInch_Y * MILLIMETERS_PER_INCH;
	
		System.out.printf("%.1f x %.1f millimeters", lettersizeMm_X, lettersizeMm_Y);
	}
}
