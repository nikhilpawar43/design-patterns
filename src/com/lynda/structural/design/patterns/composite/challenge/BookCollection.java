package com.lynda.structural.design.patterns.composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Book {
    
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void checkOut() {
        books.forEach(Book::checkOut);
    }

    public void returnBook() {
        books.forEach(Book::returnBook);
    }
}
