package com.quantitymeasurement.test;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.QuantityMeasurementException;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    //UC1
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

    //UC2
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

    //UC3
    @Test
    public void givenInchAndCentimeter_When2and5_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.CM, 5);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    //UC4
    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 2);
        quantityMeasurement.convert(quantityMeasurement1);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1);
        Assert.assertEquals(4, totalValue, 0.0 );
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 2);
        quantityMeasurement.convert(quantityMeasurement1);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1);
        Assert.assertEquals(14, totalValue, 0.0 );
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.FEET, 1);
        quantityMeasurement.convert(quantityMeasurement1);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1);
        Assert.assertEquals(24, totalValue, 0.0 );
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.CM, 2.5);
        quantityMeasurement.convert(quantityMeasurement1);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1);
        Assert.assertEquals(3, totalValue, 0.0 );
    }

    @Test
    public void given2FeetAnd2InchAnd2Yard_WhenAdded_ShouldReturn98Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 2);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(Units.YARD, 2);
        quantityMeasurement.convert(quantityMeasurement1, quantityMeasurement2);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1, quantityMeasurement2);
        Assert.assertEquals(98, totalValue, 0.0 );
    }

    @Test
    public void given2FeetAnd2InchAnd2YardAnd5Centimeter_WhenAdded_ShouldReturn100Inch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.FEET, 2);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(Units.YARD, 2);
        QuantityMeasurement quantityMeasurement3 = new QuantityMeasurement(Units.CM, 5);
        quantityMeasurement.convert(quantityMeasurement1, quantityMeasurement2, quantityMeasurement3);
        double totalValue = quantityMeasurement.addUnits(quantityMeasurement1, quantityMeasurement2,quantityMeasurement3);
        Assert.assertEquals(100, totalValue, 0.0 );
    }

    //UC5
    @Test
    public void givenGallonAndLitre_When1And3Point78_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Units.GALLON, 1);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Units.LITRE, 3.78);
        quantityMeasurement.convert(quantityMeasurement1);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }
}