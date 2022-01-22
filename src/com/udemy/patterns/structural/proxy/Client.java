package com.udemy.patterns.structural.proxy;

import javafx.geometry.Point2D;

public class Client {

    public static void main(String[] args) {

        Image bitmapImage = ImageFactory.getImage("a1.bmp");

        bitmapImage.setLocation(new Point2D(10, 10));
        bitmapImage.setLocation(new Point2D(10, 15));
        System.out.println("Image location: " + bitmapImage.getLocation());
        System.out.println("Rending image now");

        bitmapImage.render();
    }
}
