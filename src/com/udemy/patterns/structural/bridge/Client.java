package com.udemy.patterns.structural.bridge;

import java.util.LinkedList;

public class Client {

    public static void main(String[] args) {
        
        FifoCollection<Integer> numbers = new Queue<>(new LinkedList<Integer>());
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);

        System.out.println(numbers);

        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
    }
}
