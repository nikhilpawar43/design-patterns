package com.lynda.structural.design.patterns.facade.ch02;

import java.time.LocalDate;

public class Flight {

    public void book(LocalDate checkInTime, LocalDate checkOutTime) {
        System.out.println("Booking flight for " + checkInTime + " to " + checkOutTime);
    }
}
