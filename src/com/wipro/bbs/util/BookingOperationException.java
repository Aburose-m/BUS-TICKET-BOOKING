package com.wipro.bbs.util;

public class BookingOperationException extends Exception {
    @Override
    public String toString() {
        return "Booking operation failed: wrong ID or booking details";
    }
}
