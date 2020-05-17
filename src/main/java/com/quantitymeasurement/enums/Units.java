package com.quantitymeasurement.enums;

public enum Units {
    Feet(12.0), INCH(1.0);

    public double conversionValue;

    Units(double value) {
        this.conversionValue = value;
    }
}

