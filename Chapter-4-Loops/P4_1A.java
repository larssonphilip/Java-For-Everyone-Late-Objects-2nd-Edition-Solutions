/**
 * Write programs with loops that compute
 *   a.  The sum of all even numbers between 2 and 100 (inclusive).
 *   b.  The sum of all squares between 1 and 100 (inclusive).
 *   c.  All powers of 2 from 2 0 up to 2 20 .
 *   d.  The sum of all odd numbers between  a and  b (inclusive), where  a and  b are
 *   inputs.
 */

public class P4_1A {
	public static void main(String[] args) {
		int evenSum = 0;
		for(int i = 0; i <= 100; i+=2) {
			evenSum += i;
		}
		System.out.println("The sum of all even numbers between 2 and 100: " + evenSum);
	}
}
