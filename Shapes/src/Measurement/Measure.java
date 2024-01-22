package Measurement;

import java.util.Objects;

public class Measure {
    private double value;
    private Unit unit;

    public Measure(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Measure convertTo(Unit targetUnit) {
        double baseValue = unit.convertToBaseUnit(value);
        double resultValue = targetUnit.convertFromBaseUnit(baseValue);
        return new Measure(resultValue, targetUnit);
    }

    public boolean isCompatibleWith(Measure otherMeasure) {
    	return unit.isCompatible(otherMeasure.unit);
    }
    
    public Measure add(Measure other) {
        if (other == null || !isCompatibleWith(other)) {
            throw new IllegalArgumentException("Incompatible units for addition");
        }
        double resultValue = value + other.convertTo(unit).value;
        return new Measure(resultValue, unit);
    }
    
    public Measure subtract(Measure other) {
        if (other == null || !isCompatibleWith(other)) {
            throw new IllegalArgumentException("Incompatible units for subtraction");
        }

        if (value < other.convertTo(unit).value) {
            throw new IllegalArgumentException("Cannot subtract a bigger unit from a smaller unit");
        }

        double resultValue = value - other.convertTo(unit).value;
        return new Measure(resultValue, unit);
    }

	@Override
	public int hashCode() {
		return Objects.hash(unit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Measure measure = (Measure) obj;

        return Double.compare(measure.convertTo(unit).value, value) == 0;
	}
    
    
}
