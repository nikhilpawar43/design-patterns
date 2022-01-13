package com.udemy.patterns.creational.abstractfactory.storage;

public class S3Storage implements Storage {

    private long storageSize;

    public S3Storage(long storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public String getId() {
        return "AWS S3 storage with " + storageSize + " storageSize.";
    }
}
