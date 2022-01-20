package com.udemy.patterns.structural.facade;

public class Stationary {

    private Stationary() {
        
    }
    
    public static Stationary getInstance() {
        return new Stationary();
    }
}
