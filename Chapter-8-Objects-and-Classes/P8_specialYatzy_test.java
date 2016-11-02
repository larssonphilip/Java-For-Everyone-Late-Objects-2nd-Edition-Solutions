/**
 * Testprogram for the class "Yatzy".
 */

public class P8_specialYatzy_test {
	public static void main(String[] args) {
		Yatzy yatzy = new Yatzy();
		yatzy.roll();
		System.out.println ("\nSum: " + yatzy.getValue());
	}
}
