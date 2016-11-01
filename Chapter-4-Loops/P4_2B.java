/**Write programs that read a sequence of integer inputs and print
 *  a.  The smallest and largest of the inputs.
 *  b.  The number of even and odd inputs.
 *  c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
 *  1 8 10 19.
 *  d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
 *  program should print 3 5 6
 */
 
import java.util.Scanner;
 
public class P4_2B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int oddNumbers = 0;
		int evenNumbers = 0;

		for(int i = 0; i != 10; i++) {
			System.out.print("Number (" + (i+1) + "/10): ");
			int inputNumber = input.nextInt();
			if((inputNumber % 2) == 0) {
				evenNumbers += 1;
			}
			else {
				oddNumbers += 1;
			}
		}
		input.close();

		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);
	}
}
