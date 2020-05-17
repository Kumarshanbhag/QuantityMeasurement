package com.quantitymeasurement.enums;

public enum Units {
    FEET(12.0), INCH(1.0);

    public double conversionValue;

    Units(double value) {
        this.conversionValue = value;
    }

    public double getConvertedValue(double convertValue) {
        return this.conversionValue * convertValue;
    }
}

