package com.wipro.bbs.util;

public class BookingNotFoundException extends Exception {
    @Override
    public String toString() {
        return "Booking not found,You enterd wrong ID";
    }
}

