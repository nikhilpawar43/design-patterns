package com.lynda.structural.design.patterns.facade.ch02;

import java.time.LocalDate;

public class Hotel {
    
    public void book(LocalDate checkInTime, LocalDate checkOutTime) {
        System.out.println("Booking hotel room for " + checkInTime + " to " + checkOutTime);
    }
}
