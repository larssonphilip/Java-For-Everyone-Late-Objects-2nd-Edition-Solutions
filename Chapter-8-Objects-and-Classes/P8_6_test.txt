/**
 * Testprogram for the class "Car".
 */

public class P8_6_test {
	public static void main(String[] args) {
		Car myHybrid = new Car(0.8);
		myHybrid.addGas(40);
		myHybrid.drive(10);
		System.out.println("You have " + myHybrid.getGasLevel() + " liters left in the tank.");
	}
}
