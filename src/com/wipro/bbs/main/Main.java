package com.wipro.bbs.main;

import java.util.ArrayList;
import com.wipro.bbs.entity.*;
import com.wipro.bbs.service.BookingService;
import com.wipro.bbs.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("P001", "Arun Kumar", "9876543210"));
        passengers.add(new Passenger("P002", "Ritika Sharma", "9123456780"));

        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus("B101", "Chennai", "Bangalore", "AC", 40, 40, 800.0));
        buses.add(new Bus("B202", "Hyderabad", "Pune", "Sleeper", 30, 30, 1200.0));

        ArrayList<Booking> bookings = new ArrayList<>();

        BookingService service = new BookingService(passengers, buses, bookings);

        try {
            Booking b1 = service.bookTicket("P001", "B101", "2025-04-18");
            System.out.println("Booking Successful! ID: " + b1.getBookingId());

            System.out.println("\n--- Passenger Bookings (P001) ---");
            service.printPassengerBookings("P001");

            System.out.println("\nCancelling booking...");
            service.cancelBooking(b1.getBookingId());
            System.out.println("Booking Cancelled Successfully!");

        } catch (InvalidPassengerException | BusFullException |
                 BookingNotFoundException | BookingOperationException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println("Unexpected Error: " + ex);
        }
    }
}
