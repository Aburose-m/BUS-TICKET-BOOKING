package com.wipro.bbs.util;

public class BusFullException extends Exception {
    @Override
    public String toString() {
        return "Bus Full: No seats available.";
    }
}

