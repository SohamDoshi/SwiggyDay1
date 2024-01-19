import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ShapesTestcases {

	@Test
	public void invaildRectangle () {
		Rectangle rectangle = new Rectangle(10, 10);
		
		assertNotEquals(rectangle.getLength(), rectangle.getWidth());
	}
	
	@Test
	public void vaildRectangle () {
		Rectangle rectangle = new Rectangle(10, 10);
		
		assertEquals(rectangle.getLength(), rectangle.getWidth());
	}
	
	
	@Test
	public void calculateArea() {
		Rectangle rectangle = new Rectangle(15, 10);
		int area = rectangle.getLength() * rectangle.getWidth();
		assertEquals(150, area);
	}
	
	@Test
	public void calculateCircumference() {
		Rectangle rectangle = new Rectangle(12, 8);
		int circumference = 2 * (rectangle.getLength() + rectangle.getWidth());
		assertEquals(40, circumference);
	}
}
