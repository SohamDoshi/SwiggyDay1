package Weight;

import java.util.Objects;

import Length.Length;
import Length.Unit;

public class Weight {

	private double value;
	private WeightUnit unit;
	
	public Weight (double value, WeightUnit unit) {
		if(value < 0) throw new IllegalArgumentException("Side length must be positive");
		if(unit == WeightUnit.TONNE) this.value = value * 1000000000;
		else if(unit == WeightUnit.KILOGRAM) this.value = value * 1000000;
		else if(unit == WeightUnit.GRAM) this.value = value * 1000;
		else this.value = value;
		this.unit = unit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(unit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Weight weight = (Weight) obj;
        return Double.compare(weight.value, value) == 0;
	}
	
	public Weight addWeight(Weight weight) {
		double result = weight.value + this.value;
		WeightUnit unit = weight.unit;
		return new Weight(unit.convertFromMilligram(result, unit), unit);
	}
	
	public Weight substractWeigth(Weight weight) {
		if()  throw new IllegalArgumentException("Value should be equal or less than other value");
		double result = this.value - weight.value;
		WeightUnit unit = weight.unit;
		return new Weight(unit.convertFromMilligram(result, unit),unit);
	}
}
