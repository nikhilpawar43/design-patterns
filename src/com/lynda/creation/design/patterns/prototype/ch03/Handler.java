package com.lynda.creation.design.patterns.prototype.ch03;

import com.lynda.creation.design.patterns.prototype.ch03.Rabbit.Bread;

public class Handler {

    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(2);
        rabbit.setBread(Bread.LION_HEAD);
        rabbit.setOwner("Allen");

        Rabbit rabbitCopy = rabbit.clone();
        
        rabbitCopy.getOwner().setName("Steve");

        System.out.println(rabbit);
        System.out.println(rabbitCopy);
    }
}
