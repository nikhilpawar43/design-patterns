package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.instance.GoogleComputeEngineInstance;
import com.udemy.patterns.creational.abstractfactory.instance.Instance;
import com.udemy.patterns.creational.abstractfactory.instance.Instance.Capacity;
import com.udemy.patterns.creational.abstractfactory.storage.GoogleCloudStorage;
import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public class GoogleCloudResourceFactory implements AbstractResourceFactory {

    private Capacity capacity;
    private long storageSize;

    public GoogleCloudResourceFactory(Capacity capacity, long storageSize) {
        this.capacity = capacity;
        this.storageSize = storageSize;
    }

    @Override
    public Instance createInstance() {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage() {
        return new GoogleCloudStorage(storageSize);
    }
}
