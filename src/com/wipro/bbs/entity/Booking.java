package com.wipro.bbs.entity;

public class Booking {
    private String bookingId;
    private String passengerId;
    private String busId;
    private String travelDate;
    private double fare;

    public Booking(String bookingId, String passengerId, String busId, String travelDate, double fare) {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.busId = busId;
        this.travelDate = travelDate;
        this.fare = fare;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getBusId() {
        return busId;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", passengerId=" + passengerId +
               ", busId=" + busId + ", travelDate=" + travelDate + ", fare=" + fare + "]";
    }
}
