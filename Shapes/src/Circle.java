
public class Circle {

	private double redius;
	
	public Circle(double redius) {
		if(redius <= 0) throw new IllegalArgumentException("value should be positive");
		this.redius = redius;
	}
	
	public double getRedius() {
		return this.redius;
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(redius, 2);
	}
	
	public double calculateCircumference() {
		return 2 * Math.PI * redius;
	}
}
