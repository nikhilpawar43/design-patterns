package com.udemy.patterns.structural.facade;

public class Email {
    
    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}
