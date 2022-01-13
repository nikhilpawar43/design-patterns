package com.udemy.patterns.creational.abstractfactory.instance;

import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public class GoogleComputeEngineInstance implements Instance {

    private Storage storage;
    private Capacity capacity;
    
    public GoogleComputeEngineInstance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Created Google cloud engine instance with " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Started Google cloud engine instance.");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Google cloud engine instance.");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attaching storage: " + storage.getId());
    }
}
