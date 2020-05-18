package com.quantitymeasurement.exception;

public class QuantityMeasurementException extends RuntimeException {
    public ExceptionType type;
    public String message;

    public enum ExceptionType {
        MAINUNIT_MISMATCH
    }

    public QuantityMeasurementException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }
}
