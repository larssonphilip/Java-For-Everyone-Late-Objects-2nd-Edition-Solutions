/**Write programs that read a sequence of integer inputs and print
 *  a.  The smallest and largest of the inputs.
 *  b.  The number of even and odd inputs.
 *  c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
 *  1 8 10 19.
 *  d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
 *  program should print 3 5 6
 */
 
import java.util.Scanner;

public class P4_2C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int cumulativeSum = 0;
		String cumulativeSumOutput = "";

		while(i != 5) {
			System.out.print("Type a number (" + (i+1) + ("/5): "));
			int number = input.nextInt();
			cumulativeSum += number;
			cumulativeSumOutput += String.format("%s ", cumulativeSum);
			i++;
		}
    
		input.close();
    
		System.out.println(cumulativeSumOutput);
	}
}
