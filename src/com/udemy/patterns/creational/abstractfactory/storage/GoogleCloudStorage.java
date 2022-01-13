package com.udemy.patterns.creational.abstractfactory.storage;

public class GoogleCloudStorage implements Storage {

    private long storageSize;

    public GoogleCloudStorage(long storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public String getId() {
        return "Google cloud storage with " + storageSize + " storageSize.";
    }
}
