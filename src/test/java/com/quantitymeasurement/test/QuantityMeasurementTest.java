package com.quantitymeasurement.test;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.enums.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenFeetAndFeet_When0and0_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndFeet_When0AndNull_ShouldReturnNotEqual(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        QuantityMeasurement quantityMeasurement1 = null;
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMeasurementObjectAsReference_WhenSame_ShouldReturnEqual(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMeasurementObject_WhenWrongClassType_ShouldReturnFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        boolean results = quantityMeasurement.equals(new QuantityMeasurementTest());
        Assert.assertFalse(results);
    }

    @Test
    public void givenFeetAndFeet_When0and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndInch_When0and0_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndInch_When0AndNull_ShouldReturnNotEqual(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0);
        QuantityMeasurement quantityMeasurement1 = null;
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMeasurementObjectAsReference_WhenSameForInch_ShouldReturnEqual(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMeasurementObject_WhenWrongClassTypeForInch_ShouldReturnFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0);
        boolean results = quantityMeasurement.equals(new QuantityMeasurementTest());
        Assert.assertFalse(results);
    }

    @Test
    public void givenInchAndInch_When0and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndInch_When0and0_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 0);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndInch_When1and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndFeet_When1and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndInch_When1and12_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 12);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndFeet_When12and1_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 12);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndYard_When3and1_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 3);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.YARD, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetAndYard_When1and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.YARD, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndYard_When1and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.YARD, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenYardAndInch_When1and36_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.YARD, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 36);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchAndYard_When36and1_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 36);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.YARD, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenYardAndFeet_When1and3_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.YARD, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 3);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }
}