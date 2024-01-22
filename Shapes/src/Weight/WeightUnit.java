package Weight;

public enum WeightUnit {

	TONNE,
	KILOGRAM,
	GRAM,
	MILLIGRAM;
	
	public double convertFromMilligram(double valueInMilligram, WeightUnit targetUnit) {
        switch (targetUnit) {
            case TONNE:
                return valueInMilligram / 1000000000.0;
            case KILOGRAM:
                return valueInMilligram / 100000.0;
            case GRAM:
                return valueInMilligram / 1000.0;
            case MILLIGRAM:
            	return valueInMilligram;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + targetUnit);
        }
    }
}
