
public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle (double sideA,double sideB, double sideC) {
		if(sideA <= 0 || sideB <= 0 || sideC <= 0) throw new IllegalArgumentException("Side length must be positive");
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}
	
	public double calculateArea() {
		double semiPerimeter = calculateSemiPerimeter();
		double area = Math.sqrt(semiPerimeter *(semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
		return area;
	}
	
	public double calculateSemiPerimeter() {
		return (sideA + sideB + sideC) / 2;
	}
}
