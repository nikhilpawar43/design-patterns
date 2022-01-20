package com.udemy.patterns.structural.facade;

public class Mailer {

    private Mailer() {
        
    }

    public static Mailer getMailer() {
        return new Mailer();
    }
}
