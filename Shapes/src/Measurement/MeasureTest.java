package Measurement;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MeasureTest {

	@Test
	public void testCompareLength() {
		Measure length1 = new Measure(3, LengthUnit.KM);
		Measure length2 = new Measure(3000, LengthUnit.M);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testCompareLengthToWeight() {
		Measure length1 = new Measure(3, LengthUnit.KM);
		Measure length2 = new Measure(3, WeightUnit.KG);
		assertEquals(false, length1.isCompatibleWith(length2));
	}
	
	@Test
	public void testAddKilometerToMeter() {
		Measure length = new Measure(500, LengthUnit.M);
		Measure length2 = new Measure(2, LengthUnit.KM);
		Measure result = length.add(length2);
		assertEquals(new Measure(2.5, LengthUnit.KM), result);
	}
	
	@Test
	public void testAddMillimeterToLitter() {
		Measure volume = new Measure(2, VolumeUnit.LITER);
		Measure volume1 = new Measure(200, VolumeUnit.MILLILITER);
		Measure result = volume.add(volume1);
		assertEquals(new Measure(2200, VolumeUnit.MILLILITER), result);
	}
	
	@Test
	public void testAddingTwoDifferentUnits() {
		try {
			Measure length = new Measure(500, LengthUnit.M);
			Measure volume = new Measure(200, VolumeUnit.MILLILITER);
			Measure result = length.add(volume);
			fail("Expected IllegalArgumentException, but got result: " + result);
		} catch (IllegalArgumentException e) {
			assertEquals("Incompatible units for addition", e.getMessage());
		}
	}
	
	@Test
	public void testSubtractKilogramFromTonne() {
		Measure weigth = new Measure(4, WeightUnit.TONNE);
		Measure weigth1 = new Measure(200, WeightUnit.KG);
		Measure result = weigth.subtract(weigth1);
		assertEquals(new Measure(3800, WeightUnit.KG), result);
	}
	
	@Test
	public void testSubtractingBigFromSmallUnit() {
		try {
			Measure weigth = new Measure(4, WeightUnit.KG);
			Measure weigth1 = new Measure(8, WeightUnit.KG);
			Measure result = weigth.subtract(weigth1);
			fail("Expected IllegalArgumentException, but got result: " + result);
		} catch (IllegalArgumentException e) {
			assertEquals("Cannot subtract a bigger unit from a smaller unit", e.getMessage());
		}
	}
}
