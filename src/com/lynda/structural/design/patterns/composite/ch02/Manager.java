package com.lynda.structural.design.patterns.composite.ch02;

public class Manager implements Payee {
    
    private String name;

    public Manager(String name) {
        this.name = name;
    }
    
    public void payExpense(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }
}
