package com.lynda.creation.design.patterns.prototype.ch02;

import com.lynda.creation.design.patterns.prototype.ch02.Rabbit.Bread;

public class Handler {

    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(2);
        rabbit.setBread(Bread.HIMALAYAN);

        Rabbit rabbitCopy = rabbit.clone();

        System.out.println(rabbit);
        System.out.println(rabbitCopy);
    }
}
