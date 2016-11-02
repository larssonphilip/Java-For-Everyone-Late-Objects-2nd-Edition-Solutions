/**
 * Write a class that simulates a hand of Yatzhee, throw 5 dices at the same time.
 * The constructor should create 5 dices and when you "throw the dices" all of them
 * should be thrown. When you ask for the value getValue(), all of the dices should be returned.
 *
 * Tips: Make an Array of Dice().
 */

public class Yatzy {
	private Dice[] dices;
	public Yatzy() {
		dices = new Dice[5];
		for(int i = 0; i < dices.length; i++) {
			dices[i] = new Dice();
		}
	}
	
	public void roll() {
		for(int i = 0; i < dices.length; i++) {
			dices[i].roll();
			System.out.print(dices[i].getValue() + "  ");
		}
		
	}
	
	public int getValue() {
		int sum = 0;
		for(int i = 0; i < dices.length; i++) {
			sum += dices[i].getValue();
		}
		 return sum;
	}
}
