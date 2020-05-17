package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;

public class QuantityMeasurement {
    private double value;
    private Units unit;

    public QuantityMeasurement(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public void convert(QuantityMeasurement... quantities) {
        this.value = this.unit.getConvertedValue(this.value);
        for(QuantityMeasurement quantity : quantities) {
            quantity.value = quantity.unit.getConvertedValue(quantity.value);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

    public double addUnits(QuantityMeasurement... quantities) {
        double totalValue = this.value;
        for(QuantityMeasurement quantity : quantities) {
            totalValue += quantity.value;
        }
        return totalValue;
    }
}
