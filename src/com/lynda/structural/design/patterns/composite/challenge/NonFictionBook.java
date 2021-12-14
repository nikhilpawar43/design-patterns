package com.lynda.structural.design.patterns.composite.challenge;

public class NonFictionBook implements Book {

    private String name;
    private boolean isCheckedOut;

    public NonFictionBook(String name) {
        this.name = name;
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
