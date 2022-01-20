package com.udemy.patterns.structural.facade;

public class MailExchange {
    
    public boolean send(Email email) {
        System.out.println("Email sent successfully.");
        return true;
    }
}
