import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CircleTestcase {

	@Test
	public void testCalculateArea() {
		Circle circle = new Circle(5);
		double expectedArea = Math.PI * 5 * 5;
		double actulaArea = circle.calculateArea();
		assertEquals(expectedArea, actulaArea);
	}
	
	@Test
	public void testCalculateCircumference() {
		Circle circle = new Circle(3);
		double expectedCircumference = 2 * Math.PI * 3;
		double actualCircumference = circle.calculateCircumference();
		assertEquals(expectedCircumference, actualCircumference);
	}
	
	@Test
	public void testNegativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Circle(-4));
	}
}
