package com.wipro.bbs.service;

import java.util.ArrayList;
import com.wipro.bbs.entity.*;
import com.wipro.bbs.util.*;

public class BookingService {
    private ArrayList<Passenger> passengers;
    private ArrayList<Bus> buses;
    private ArrayList<Booking> bookings;

    public BookingService(ArrayList<Passenger> passengers, ArrayList<Bus> buses, ArrayList<Booking> bookings) {
        this.passengers = passengers;
        this.buses = buses;
        this.bookings = bookings;
    }

    public boolean validatePassenger(String passengerId) throws InvalidPassengerException {
        for (Passenger p : passengers) {
            if (p.getPassengerId().equals(passengerId)) {
                return true;
            }
        }
        throw new InvalidPassengerException();
    }

    public Bus findBus(String busId) throws BookingOperationException {
        for (Bus b : buses) {
            if (b.getBusId().equals(busId)) {
                return b;
            }
        }
        throw new BookingOperationException();
    }

    public double calculateFare(Bus bus) {
        double fare = bus.getBaseFare();

        if (bus.getBusType().equalsIgnoreCase("AC")) {
            fare *= 2;
        } else if (bus.getBusType().equalsIgnoreCase("Sleeper")) {
            fare *= 3;
        }

        return fare;
    }

    public Booking bookTicket(String passengerId, String busId, String travelDate) throws Exception {
        validatePassenger(passengerId);

        Bus bus = findBus(busId);

        if (bus.getAvailableSeats() <= 0) {
            throw new BusFullException();
        }

        double fare = calculateFare(bus);

        String bookingId = "BID" + (bookings.size() + 1)+"-"+bus.getBusType();

        Booking booking = new Booking(bookingId,passengerId,busId,travelDate,fare);
        bookings.add(booking);

        bus.setAvailableSeats(bus.getAvailableSeats() - 1);

        return booking;
    }

    public void cancelBooking(String bookingId) throws BookingNotFoundException {
        Booking bookingToCancel = null;
        for (Booking b : bookings) {
            if (b.getBookingId().equals(bookingId)) {
                bookingToCancel = b;
                break;
            }
        }
        if (bookingToCancel == null) {
            throw new BookingNotFoundException();
        }

        Bus selectedBus = null;
        for (Bus bus : buses) {
            if (bus.getBusId().equals(bookingToCancel.getBusId())) {
                selectedBus = bus;
                break;
            }
        }
        if (selectedBus != null) {
            int seats = selectedBus.getAvailableSeats();
            selectedBus.setAvailableSeats(seats + 1);
        }
        bookings.remove(bookingToCancel);
    }
    
    public void printPassengerBookings(String passengerId) {
        for (Booking b : bookings) {
            if (b.getPassengerId().equals(passengerId)) {
                System.out.println(b);
            }
        }
    }
}
