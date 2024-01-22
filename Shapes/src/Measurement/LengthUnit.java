package Measurement;

public enum LengthUnit implements Unit{
	KM(1000000),
	M(1000),
	CM(10),
	MM(1);

	private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value * conversionFactor;
    }

    @Override
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / conversionFactor;
    }

    @Override
    public boolean isCompatible(Unit other) {
        return other instanceof LengthUnit;
    }
	
}
