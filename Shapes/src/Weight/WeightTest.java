package Weight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WeightTest {

	@Test
	public void testCompareWeight() {
		Weight weight = new Weight(4, WeightUnit.KILOGRAM);
		Weight weight2 = new Weight(4000, WeightUnit.GRAM);
		boolean result = weight.equals(weight2);
		assertEquals(true, result);
	}
	
	@Test
	public void testAddingTonneToKilogram() {
		Weight weight = new Weight(400, WeightUnit.KILOGRAM);
		Weight weight2 = new Weight(4, WeightUnit.TONNE);
		Weight expectedResult = new Weight(4.4,WeightUnit.TONNE);
		Weight actualResult = weight.addWeight(weight2);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testSubtractingMilligramFromGram() {
		Weight weight = new Weight(4, WeightUnit.GRAM);
		Weight weight2 = new Weight(40, WeightUnit.MILLIGRAM);
		Weight expectedResult = new Weight(4.4,WeightUnit.MILLIGRAM);
		Weight actualResult = weight.substractWeigth(weight2);
		System.out.println(actualResult.toString());
		assertEquals(expectedResult,actualResult);
	}
}
