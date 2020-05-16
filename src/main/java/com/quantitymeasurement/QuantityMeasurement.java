package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;

import java.util.Objects;

public class QuantityMeasurement {
    private final double value;
    private final Units unit;

    public QuantityMeasurement(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}
