package Length;

public class Length implements Comparable<Length>{

	private double value;
	private Unit unit;
	
	public Length (double value, Unit unit) {
		if(value < 0) throw new IllegalArgumentException("Side length must be positive");
		if(unit == Unit.KM) this.value = value * 1000000;
		else if(unit == Unit.M) this.value = value * 1000;
		else if(unit == Unit.CM) this.value = value * 10;
		else this.value = value;
		this.unit = unit;
	}
	
	@Override
	public int compareTo(Length length) {
		return Double.compare(value, length.value);
	}
	
	public Length addLength(Length length) {
		double result = this.value + length.value;
		Unit unit = length.unit;
		return new Length(unit.convertFromMillieters(result, unit),unit);
	}

	public Length substractLength (Length length) {
		int comparevalue = compareTo(length);
		if(comparevalue < 0)  throw new IllegalArgumentException("Value should be equal or less than other value");
		double result = this.value - length.value;
		Unit unit = length.unit;
		return new Length(unit.convertFromMillieters(result, unit),unit);
	}

	@Override
	public String toString() {
		return "Length [value=" + value + ", unit=" + unit + "]";
	}
}
