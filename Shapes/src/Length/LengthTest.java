package Length;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LengthTest {

	@Test
	public void testNegativeLength() {
		assertThrows(IllegalArgumentException.class, () -> new Length(-4, Unit.CM));
	}

	@Test
	public void testCompareLength() {
		Length length = new Length(2, Unit.KM);
		Length length2 = new Length(2000, Unit.M);
		int result = length.compareTo(length2);
		assertEquals(0, result);
	}

	@Test
	public void testAddingMeterToKilometer() {
		Length length = new Length(2, Unit.KM);
		Length length2 = new Length(2000, Unit.M);
		Length expectedResult = new Length(4000, Unit.M);
		Length actualResult = length.addLength(length2);
		int result = expectedResult.compareTo(actualResult);
		assertEquals(0, result);
	}

	@Test
	public void testSubstractingMeterFromKilometer() {
		Length length = new Length(2, Unit.KM);
		Length length2 = new Length(2000, Unit.M);
		Length expectedResult = new Length(0, Unit.M);
		Length actualResult = length.substractLength(length2);
		int result = expectedResult.compareTo(actualResult);
		assertEquals(0, result);
	}

	@Test
	public void testSubstractBiggerFromSmallerLength() {
		try {
			Length length1 = new Length(5, Unit.KM);
			Length length2 = new Length(8000, Unit.M);

			Length result = length1.substractLength(length2);
			fail("Expected IllegalArgumentException, but got result: " + result);
		} catch (IllegalArgumentException e) {
			assertEquals("Value should be equal or less than other value", e.getMessage());
		}
	}

}
