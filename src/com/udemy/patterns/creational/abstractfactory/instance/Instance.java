package com.udemy.patterns.creational.abstractfactory.instance;

import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public interface Instance {
    
    enum Capacity {
        MICRO, SMALL, LARGE
    }
    
    void start();
    void stop();
    void attachStorage(Storage storage);
}
