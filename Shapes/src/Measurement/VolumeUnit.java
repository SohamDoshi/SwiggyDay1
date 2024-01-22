package Measurement;

public enum VolumeUnit implements Unit{
	LITER(1000), 
	MILLILITER(1);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
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
        return other instanceof VolumeUnit;
    }

}
