/******************************************************************
 * @Purpose: To Create Custom Exception For Quantity Measurement
 * @Author: Kumar Shanbhag
 * @Date: 18/05/2020
 ******************************************************************/

package com.quantitymeasurement.exception;

public class QuantityMeasurementException extends RuntimeException {
    //To Define specific type  Of Exception
    public ExceptionType type;
    //To store the message for Exception
    public String message;

    public enum ExceptionType {
        NEGATIVE_VALUE, MAINUNIT_MISMATCH
    }

    public QuantityMeasurementException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }
}
