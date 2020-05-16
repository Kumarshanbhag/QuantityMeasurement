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
    public void givenFeetAndFeet_When0and0_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0);
        boolean equals = quantityMeasurement.equals(quantityMeasurement1);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeetAndFeet_When0AndNull_ShouldReturnFalse(){
        QuantityMeasurement quantityMeasurement1 = null;
        boolean results = quantityMeasurement.equals(quantityMeasurement1);
        Assert.assertFalse(results);
    }
}