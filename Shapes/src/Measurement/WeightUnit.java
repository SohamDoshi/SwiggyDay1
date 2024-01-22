package Measurement;

public enum WeightUnit implements Unit{

	TONNE(1000000),
	KG(1000),
	G(1),
	MG(0.001);
	
	private final double conversionFactor;

    WeightUnit(double conversionFactor) {
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
        return other instanceof WeightUnit;
    }
}
