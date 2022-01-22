package com.udemy.patterns.structural.proxy;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private String name;
    private Point2D location;

    public BitmapImage(String name) {
        System.out.println("Loading image: " + name + " from this disk.");
        this.name = name;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Image: " + name + " rendered at location: " + location);
    }
}
