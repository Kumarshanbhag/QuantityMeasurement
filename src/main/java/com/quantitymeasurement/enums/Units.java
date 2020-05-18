/************************************************************************
 * @Purpose: To Store All Units with MaiUnit Type And Conversion Value
 * @Author: Kumar Shanbhag
 * @Date: 18/05/2020
 ***********************************************************************/

package com.quantitymeasurement.enums;

public enum Units {
    //Units of MainUnit Length
    FEET(MainUnits.LENGTH, 12.0), INCH(MainUnits.LENGTH, 1.0), YARD(MainUnits.LENGTH, 36.0), CM(MainUnits.LENGTH, 0.4),
    //Units Of MainUnit Volume
    GALLON(MainUnits.VOLUME,3.78), LITRE(MainUnits.VOLUME, 1), ML(MainUnits.VOLUME, 0.001 ),
    //Units Of MainUnit Weight
    KG(MainUnits.WEIGHT, 1), GRAMS(MainUnits.WEIGHT, 0.001), TONNE(MainUnits.WEIGHT, 1000 );

    public MainUnits mainunit;
    public double conversionValue;

    /*
     * @param mainunit To initialize mainunit
     * @param value To initialize conversion value to a specific unit
     */
    Units(MainUnits mainunit, double value) {
        this.mainunit = mainunit;
        this.conversionValue = value;
    }

    /*
     * @param convertValue Value of QuantityMeasurement Object
     * @return Double value to a specific unit
     */
    public double getConvertedValue(double convertValue) {
        return this.conversionValue * convertValue;
    }
}

