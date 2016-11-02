/**
 * Implement a class Car with the following properties. A car has a cer­tain fuel efficiency 
 * (measured in miles/gallon) and a certain amount of fuel in the gas tank. 
 * The efficiency is specified in the constructor, and the initial fuel level is 0. 
 * Supply a method drive that simulates driving the car for a certain distance, 
 * reducing the fuel level in the gas tank, and methods getGas- Level , 
 * to return the current fuel level, and addGas , to tank up. Sample usage:
 *  Car myHybrid = new Car(50); // 50 miles per gallon
 *  myHybrid.addGas(20); // Tank 20 gallons
 *  myHybrid.drive(100); // Drive 100 miles
 *  System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
 */

public class Car {
	private final double INITIAL_FUEL_LEVEL = 0;
	private double fuel;
	private double fuelEfficiency;
	
	public Car(double fuelEfficiency){
		this.fuelEfficiency = fuelEfficiency;
		fuel = INITIAL_FUEL_LEVEL;
	}
	
	public double getGasLevel() {
		return fuel;
	}
	
	public void addGas(double gasAmount) {
		fuel += gasAmount;
	}
	
	public void drive(double distance) {
		fuel -= fuelEfficiency * distance; 
	}
}
