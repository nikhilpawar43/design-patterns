package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.instance.EC2Instance;
import com.udemy.patterns.creational.abstractfactory.instance.Instance;
import com.udemy.patterns.creational.abstractfactory.instance.Instance.Capacity;
import com.udemy.patterns.creational.abstractfactory.storage.S3Storage;
import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public class AwsResourceFactory implements AbstractResourceFactory {

    private Capacity capacity;
    private long storageSize;

    public AwsResourceFactory(Capacity capacity, long storageSize) {
        this.capacity = capacity;
        this.storageSize = storageSize;
    }

    @Override
    public Instance createInstance() {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage() {
        return new S3Storage(storageSize);
    }
}
