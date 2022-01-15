package com.udemy.patterns.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> imagePool;

    public ObjectPool(Supplier<T> creator, int count) {
        imagePool = new LinkedBlockingQueue<>();
        for (int i=0; i<count; i++) {
            imagePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return imagePool.take();
        } catch (InterruptedException e) {
            System.err.println("take() has thrown Interrupted exception");
        }
        return null;
    }

    public void release(T resource) {
        try {
            imagePool.put(resource);
            resource.reset();
        } catch (InterruptedException e) {
            System.err.println("release() has thrown Interrupted exception");
        }
    }
}
