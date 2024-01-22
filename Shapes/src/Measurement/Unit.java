package Measurement;

public interface Unit {

	double convertToBaseUnit(double value);
    double convertFromBaseUnit(double baseValue);
    boolean isCompatible(Unit other);
}
