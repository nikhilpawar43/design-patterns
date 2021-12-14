package com.lynda.structural.design.patterns.facade.ch02;

import java.time.LocalDate;

public class VacationClient {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2021, 8, 1);
        LocalDate endDate = LocalDate.of(2021, 8, 15);
        
        VacationFacade vacationFacade = new VacationFacade();
        vacationFacade.book(startDate, endDate);
    }
}
