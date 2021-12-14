package com.lynda.structural.design.patterns.composite.challenge;

public class FictionBook implements Book {
    
    private String name;
    private boolean isCheckedOut;
    private boolean isAPlay;

    public FictionBook(String name, boolean isAPlay) {
        this.name = name;
        this.isAPlay = isAPlay;
        this.isCheckedOut = false;
    }
    
    public void checkOut() {
        System.out.println("Request to checkout book - " + name);
        if (!isCheckedOut) {
            System.out.println(name + " has been checked out.");
            isCheckedOut = true;
        } else {
            System.out.println(name + " has already been checked out.");
        }
    }
    
    public void returnBook() {
        System.out.println("Request to return book - " + name);
        if (isCheckedOut) {
            System.out.println(name + " returned successfully.");
            isCheckedOut = false;
        } else {
            System.out.println(name + " has been already returned.");
        }
    }
}
