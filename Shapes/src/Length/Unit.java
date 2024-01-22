package Length;

public enum Unit {
    KM,
    M,
    CM,
    MM;
    
    public double convertFromMillieters(double valueInMilliMeters, Unit targetUnit) {
        switch (targetUnit) {
            case KM:
                return valueInMilliMeters / 1000000.0;
            case M:
                return valueInMilliMeters / 1000.0;
            case CM:
                return valueInMilliMeters / 10.0;
            case MM:
            	return valueInMilliMeters;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + targetUnit);
        }
    }
}
