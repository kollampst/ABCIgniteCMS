package com.abcignitecms.exceptions;

public class NoBookingsFoundException extends RuntimeException {
    public NoBookingsFoundException(String message) {
        super(message);
    }
}