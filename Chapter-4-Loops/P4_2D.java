/**Write programs that read a sequence of integer inputs and print
 *  a.  The smallest and largest of the inputs.
 *  b.  The number of even and odd inputs.
 *  c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
 *  1 8 10 19.
 *  d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
 *  program should print 3 5 6
 */
 
import java.util.Scanner;

public class P4_2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String adjacentDuplicates = "";

		int number = 0;
		int previousNumber = number;

		for(int i = 0; i < 10; i++) {
			System.out.print("Type a number (" + (i+1) + "/10): ");
			number = input.nextInt();
			if (number == previousNumber) adjacentDuplicates += String.format("%s ", number);
			previousNumber = number;
		}
    
		input.close();
		System.out.println(adjacentDuplicates);
	}
}
