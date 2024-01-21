import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTestcase {

	@Test
	public void testNegativeSideLength () {
		assertThrows(IllegalArgumentException.class, () -> new Triangle(-4, 5, 5));
	}
	
	@Test
	public void testCalculateArea() {
		Triangle triangle = new Triangle(3, 4, 5);
		double exectedArea = 6.0;
		double actualArea = triangle.calculateArea();
		assertEquals(exectedArea, actualArea);
	}
}
