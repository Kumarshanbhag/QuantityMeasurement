package com.quantitymeasurement.enums;

public enum Units {
    FEET(MainUnits.LENGTH, 12.0), INCH(MainUnits.LENGTH, 1.0), YARD(MainUnits.LENGTH, 36.0), CM(MainUnits.LENGTH, 0.4),
    GALLON(MainUnits.VOLUME,3.78), LITRE(MainUnits.VOLUME, 1);

    public MainUnits mainunit;
    public double conversionValue;

    Units(MainUnits mainunit, double value) {
        this.mainunit = mainunit;
        this.conversionValue = value;
    }

    public double getConvertedValue(double convertValue) {
        return this.conversionValue * convertValue;
    }
}

