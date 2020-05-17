package com.quantitymeasurement.enums;

public enum Units {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4);

    public double conversionValue;

    Units(double value) {
        this.conversionValue = value;
    }

    public double getConvertedValue(double convertValue) {
        return this.conversionValue * convertValue;
    }
}

