/**
 * Testprogram for the class "Dice"
 */

public class P8_specialDice_test {
	public static void main(String[] args) {
		Dice dice = new Dice();
		
		System.out.println("First dice roll: " + dice.getValue());
		dice.roll();
		System.out.println("Second dice roll: " + dice.getValue());
		dice.roll();
		System.out.println("Third dice roll: " + dice.getValue());
	}
}
