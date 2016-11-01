/**
 * Write a program that prints the balance of an account after the first, second and third year.
 * The account as an initial balance of $1000 and earns 5% of interest per year.
 */

public class P1_4 {
	public static void main(String[] args) {
		double accountBalance = 1000;
		System.out.println("Initial account balance: " + accountBalance);
		
		accountBalance = accountBalance * 1.05;
		System.out.println("Account balance after one year: $" + accountBalance);

		accountBalance = accountBalance * 1.05;
		System.out.println("Account balance after two years: $" + accountBalance);
		accountBalance = accountBalance * 1.05;

		System.out.println("Account balance after three years: $" + accountBalance);
	}
}
