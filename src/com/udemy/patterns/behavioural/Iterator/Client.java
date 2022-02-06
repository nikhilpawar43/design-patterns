package com.udemy.patterns.behavioural.Iterator;

public class Client {

    public static void main(String[] args) {

        Iterator<ThemeColor> iterator = ThemeColor.getInstance();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
