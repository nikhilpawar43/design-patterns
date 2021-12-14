package com.lynda.structural.design.patterns.facade.ch02;

import java.time.LocalDate;

public class VacationFacade {
    
    public void book(LocalDate startDate, LocalDate endDate) {
        Flight flight = new Flight();
        flight.book(startDate, endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
    }
}
