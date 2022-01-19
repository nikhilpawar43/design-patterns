package com.udemy.patterns.structural.bridge;

import java.util.Deque;

public class Queue<T> implements FifoCollection<T> {
    
    private Deque<T> dequeue;

    public Queue(Deque<T> dequeue) {
        this.dequeue = dequeue;
    }

    @Override
    public void offer(T t) {
        dequeue.addFirst(t);
    }

    @Override
    public T poll() {
        return this.dequeue.removeLast();
    }

    @Override
    public String toString() {
        return "Queue{" + "dequeue=" + dequeue + '}';
    }
}
