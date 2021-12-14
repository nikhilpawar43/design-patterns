package com.lynda.structural.design.patterns.composite.challenge;

public class LibraryClient {

    public static void main(String[] args) {
        
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);
        
        NonFictionBook nonFictionBook = new NonFictionBook("A brief history of time");
        
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(fictionBookOne);
        bookCollection.addBook(fictionBookTwo);
        bookCollection.addBook(nonFictionBook);
        
        checkOutBook(nonFictionBook);
        checkOutBook(fictionBookOne);
        checkOutBook(bookCollection);
        
        returnBook(fictionBookOne);
        returnBook(nonFictionBook);
        returnBook(bookCollection);
    }

    private static void checkOutBook(Book book) {
        book.checkOut();    
    }

    private static void returnBook(Book book) {
        book.returnBook();
    }

}
