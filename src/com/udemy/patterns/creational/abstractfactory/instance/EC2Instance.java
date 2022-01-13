package com.udemy.patterns.creational.abstractfactory.instance;

import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public class EC2Instance implements Instance {
    
    private Storage storage;
    private Capacity capacity;

    public EC2Instance(Capacity capacity) {
        System.out.println("Created AWS EC2 instance with " + capacity);
    }

    @Override
    public void start() {
        System.out.println("EC2 instance started.");
    }

    @Override
    public void stop() {
        System.out.println("EC2 instance stopped.");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attaching storage: " + storage.getId());
    }
}
