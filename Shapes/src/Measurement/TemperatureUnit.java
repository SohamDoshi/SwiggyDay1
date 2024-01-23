package Measurement;

public enum TemperatureUnit implements Unit {
	CELSIUS(1), 
	FAHRENHEIT(5.0 / 9.0, 32), 
	KELVIN(1, 273.15);

	private final double scale;
	private final double offset;

	TemperatureUnit(double scale) {
		this.scale = scale;
		this.offset = 0;
	}

	TemperatureUnit(double scale, double offset) {
		this.scale = scale;
		this.offset = offset;
	}

	@Override
	public double convertToBaseUnit(double value) {
		return (value - offset) / scale;
	}

	@Override
	public double convertFromBaseUnit(double baseValue) {
		return baseValue * scale + offset;
	}

	@Override
	public boolean isCompatible(Unit other) {
		return other instanceof TemperatureUnit;
	}

}
