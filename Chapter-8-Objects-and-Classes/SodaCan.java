/**
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(),
 * In the constructor, supply the height and the radius of the can.
 */
 
public class SodaCan {
	private double height;
	private double radius;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = 2 * (Math.PI * (radius * radius)) + (2 * Math.PI * radius) * height;
		return surfaceArea;
	}
	
	public double getVolume() {
		return (Math.PI * (radius * radius) * height);
	}
}
