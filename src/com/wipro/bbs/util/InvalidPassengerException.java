
package com.wipro.bbs.util;

public class InvalidPassengerException extends Exception {
    @Override
    public String toString() {
        return "Invalid passenger: passenger ID not found.";
    }
}
