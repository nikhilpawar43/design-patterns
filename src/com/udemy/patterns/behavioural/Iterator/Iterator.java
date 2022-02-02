package com.udemy.patterns.behavioural.Iterator;

public interface Iterator<T> {
    
    boolean hasNext();
    
    T next();
}
