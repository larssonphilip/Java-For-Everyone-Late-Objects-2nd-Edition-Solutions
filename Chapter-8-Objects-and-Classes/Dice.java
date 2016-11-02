/**
 * Write a class Dice, that has a value (the amount of dots on the side that's facing upwards
 * between 1 - 6. The constructor should generate a random value and a method roll()
 * that generates a new random value. There should also be a method named getValue() to
 * get the value of the dice.
 */

public class Dice {
	private int value;
	
	public Dice() {
		roll();
	}
	
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}
	
	public int getValue() {
		return value;
	}
}
