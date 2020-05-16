package com.quantitymeasurement.test;

import com.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement(0);
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0);
        boolean equals = quantityMeasurement.equals(quantityMeasurement1);
        Assert.assertTrue(equals);
    }
}
