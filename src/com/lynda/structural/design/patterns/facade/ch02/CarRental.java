package com.lynda.structural.design.patterns.facade.ch02;

import java.time.LocalDate;

public class CarRental {

    public void book(LocalDate startDate, LocalDate endDate) {
        System.out.println("Book car for " + startDate + " to " + endDate);
    }
}
