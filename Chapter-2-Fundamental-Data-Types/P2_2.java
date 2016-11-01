/**
 * Write a program that computes and displays the perimeter of a lettersize (8.5 × 11 inch) 
 * sheet of paper and the length of its diagonal.
 */

public class P2_2 {
	public static void main(String[] args) {
		final double PAPER_WIDTH = 8.5;
		final double PAPER_LENGTH = 11.0;
		
		double perimeter = 2 * PAPER_LENGTH + 2 * PAPER_WIDTH;
		double diagonal = Math.sqrt(Math.pow(PAPER_LENGTH, 2) + Math.pow(PAPER_WIDTH, 2));
		
		System.out.printf("Perimeter: %.1f %nDiagonal: %.1f", perimeter, diagonal);
	}
}
